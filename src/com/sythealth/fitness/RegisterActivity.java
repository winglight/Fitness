package com.sythealth.fitness;

import org.restlet.security.User;

import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.MessageModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends BaseActivity {
	private static final int REGISTER_FAILED = 0;
	private static final int REGISTER_SUCCESS = 1;
	private ProgressDialog pd;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		init();
	}
	private void init(){
		Button backBtn = (Button)findViewById(R.id.act_register_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(RegisterActivity.this, LoginActivity.class,true, true);
			}
		});
		final EditText emailEt = (EditText)findViewById(R.id.act_register_email_et);
		final EditText pwdEt1 = (EditText)findViewById(R.id.act_register_password1_et);
		final EditText pwdEt2 = (EditText)findViewById(R.id.act_register_password2_et);
		Button submitBtn = (Button)findViewById(R.id.act_register_submit_btn);
		submitBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				UserModel user = new UserModel();
				TelephonyManager manager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
				String email = emailEt.getText().toString();
				String pwd1 = pwdEt1.getText().toString();
				String pwd2 = pwdEt2.getText().toString();
				if(email.equals("")){
					Toast.makeText(RegisterActivity.this, "请填写邮箱", Toast.LENGTH_SHORT).show();
				}else if(!Utils.checkingEmail(email)){
					Toast.makeText(RegisterActivity.this, "邮箱格式错误", Toast.LENGTH_SHORT).show();
				}else if(pwd1.equals("")){
					Toast.makeText(RegisterActivity.this, "请填写用户密码", Toast.LENGTH_SHORT).show();
				}else if(pwd1.length()<6){
					Toast.makeText(RegisterActivity.this, "请填写至少6位数密码", Toast.LENGTH_SHORT).show();
				}else if(!pwd2.equals(pwd1)){
					Toast.makeText(RegisterActivity.this, "两次输入的密码不一致", Toast.LENGTH_SHORT).show();
				}else{
					user.setSid(manager.getDeviceId());
					user.setEmail(email);
					user.setPassword(pwd1);
					register(user);
				}
			}
		});
	}
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			if(msg.what == REGISTER_SUCCESS){
				Intent intent = new Intent();
				intent.setClass(RegisterActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				Toast.makeText(RegisterActivity.this, msg.obj.toString(), Toast.LENGTH_SHORT).show();
			}
			Toast.makeText(RegisterActivity.this,"注册成功", Toast.LENGTH_SHORT).show();
			pd.dismiss();
		};
	};
	private void register(final UserModel user){
		pd = Utils.customProgressDialog(this, "提交注册信息...");
		final ServiceImpl service =getService();
		new Thread(){
			public void run() {
				Message msg = new Message();
				MessageModel<String> mm = service.register(user);
				if(mm.isFlag()){
					msg.what = REGISTER_SUCCESS;
				}else{
					msg.what = REGISTER_FAILED;
				}
				msg.obj = mm.getMessage();
				handler.sendMessage(msg);
			};
		}.start();
	}
}

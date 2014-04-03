package com.sythealth.fitness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xml.sax.HandlerBase;

import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.MessageModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;
import com.umeng.analytics.MobclickAgent;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
	private ServiceImpl service;
	private static final int FAILED = 0;
	private static final int USER_SUCCESS = 1;
	private static final int DIRECT_SUCCESS = 2;
	private ProgressDialog pd;
	private String sid;
	private Button backBtn;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		service = getService();
		TelephonyManager manager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
		sid = manager.getDeviceId();
		init();	
	}
	private void init(){
		backBtn = (Button)findViewById(R.id.act_login_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(LoginActivity.this, FirstStartActivity.class,true, true);
			}
		});
		//用户名
		final EditText nameEt = (EditText)findViewById(R.id.act_login_username_et);
		final EditText pwdEt = (EditText)findViewById(R.id.act_login_password_et);
		//登陆按钮
		Button login_btn = (Button)findViewById(R.id.act_login_login_btn);
		login_btn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				String name = nameEt.getText().toString();
				String pwd = pwdEt.getText().toString();
				if(name.equals("")){
					Toast.makeText(LoginActivity.this, "请填写邮箱", Toast.LENGTH_SHORT).show();
				}else if(!Utils.checkingEmail(name)){
					Toast.makeText(LoginActivity.this, "邮箱格式错误", Toast.LENGTH_SHORT).show();
					nameEt.clearComposingText();
				}else if(pwd.equals("")){
					Toast.makeText(LoginActivity.this, "请填写用户密码", Toast.LENGTH_SHORT).show();
				}else if(pwd.length()<6){
					Toast.makeText(LoginActivity.this, "请填写至少6位数密码", Toast.LENGTH_SHORT).show();
				}else{
					login(name, pwd);
				}
			}
		});
		//注册按钮
		Button registBtn = (Button)findViewById(R.id.act_login_regist_btn);
		registBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(LoginActivity.this, RegisterActivity.class,false, true);
			}
		});
	}
	@Override
	public void onResume() {
		super.onResume();
		MobclickAgent.onResume(this);
	}
	@Override
	public void onPause() {
		super.onPause();
		MobclickAgent.onPause(this);
	}
	Handler handler = new Handler(){
		public void handleMessage(Message msg) {
			if(msg.what ==USER_SUCCESS ){
				pd.dismiss();
				Intent intent = new Intent();
				intent.setClass(LoginActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				pd.dismiss();
				Toast.makeText(LoginActivity.this,msg.getData().getString("erro"), Toast.LENGTH_SHORT).show();
			}
		};
	};
	private void login(final String email,final String password){
		pd = Utils.customProgressDialog(this, "正在登陆...");
		new Thread(){
			@Override
			public void run() {
				Message msg = new Message();
				MessageModel<UserModel>  msgModel = service.loginByEmail(email, password);
				if(msgModel.isFlag()){
					msg.what = USER_SUCCESS;
				}else{
					msg.what = FAILED;
					Bundle bundle = new Bundle();
					bundle.putString("erro", msgModel.getMessage());
					msg.setData(bundle);
				}
				handler.sendMessage(msg);
			}
		}.start();
	}
	@Override
	public void onBackPressed() {
		Utils.jumpUI(LoginActivity.this, RegisterActivity.class,true, true);

		super.onBackPressed();
	}
}

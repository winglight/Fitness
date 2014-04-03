package com.sythealth.fitness;

import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;
import com.umeng.analytics.MobclickAgent;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstStartActivity extends BaseActivity {
     private String sid = null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_firststart);	
		WifiManager wifiManger = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		String wifiStr = wifiManger.getConnectionInfo().getMacAddress();
		if (wifiStr == null) {
			TelephonyManager manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
			sid = manager.getDeviceId();
		}else{
			sid = wifiStr.replace(":", "-");
		}	
		init();
	}
	//初始化界面
	private void init(){
		//play按钮
		Button playBtn = (Button)findViewById(R.id.act_firststart_play_btn);
		playBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				ServiceImpl service = FirstStartActivity.this.getService();
				service.loginDirect(sid);
				Intent intent = new Intent(FirstStartActivity.this,LoginActivity.class);
				startActivity(intent);
			}
		});
		//老用户登陆按钮
		Button loginBtn = (Button)findViewById(R.id.act_firststart_login_btn);
		loginBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(FirstStartActivity.this, LoginActivity.class,false, true);
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
}

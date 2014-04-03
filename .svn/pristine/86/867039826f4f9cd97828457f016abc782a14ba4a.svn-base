package com.sythealth.fitness;

import com.umeng.analytics.MobclickAgent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class StartUpActivity extends Activity {
	private SharedPreferences sp;
	//启动标记
    private boolean first_tag;
    private static final String FIRST_TAG="first_tag";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ImageView iv = new ImageView(this);
		iv.setBackgroundResource(R.drawable.ic_launcher);
		sp = getSharedPreferences("first_start", 0);
		first_tag = sp.getBoolean(FIRST_TAG, true);
		setContentView(iv);
		new Thread(){
			public void run() {
				try {
					Intent intent = new Intent();
					sleep(1000);
					//第一次登陆
					if(first_tag){
						Editor editor = sp.edit();
						editor.putBoolean(FIRST_TAG, false).commit();				
						intent.setClass(StartUpActivity.this, FirstStartActivity.class);						
					}else{
						intent.setClass(StartUpActivity.this, MainActivity.class);	
					}
//					intent.setClass(StartUpActivity.this, FirstStartActivity.class);
					startActivity(intent);
					finish();
				} catch (InterruptedException e) {
					Log.e("tag", "error="+e);
				}
			};
		}.start();
	}
	@Override
	protected void onResume() {
		super.onResume();
		MobclickAgent.onResume(this);
	}
	@Override
	protected void onPause() {
		super.onPause();
		MobclickAgent.onPause(this);
	}
}

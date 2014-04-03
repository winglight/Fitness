package com.sythealth.fitness;
import org.restlet.security.User;
import org.w3c.dom.Text;

import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.fb.UMFeedbackService;

import android.os.Bundle;
import android.R.anim;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
	private ServiceImpl service;
	private UserModel user;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		service = getService();
		user = service.getCurrentUser();
		init();
		initTexttype();
	}
	private void initTexttype(){
		TextView totlePlan_tv = (TextView)findViewById(R.id.act_main_total_plan_tv);
		totlePlan_tv.setTextColor(Color.rgb(0, 123, 208));
		Utils.setTypeface2(this, totlePlan_tv);
		TextView totleCal_tv = (TextView)findViewById(R.id.act_main_total_calorie_tv);
		Utils.setTypeface2(this, totleCal_tv);
		totleCal_tv.setTextColor(Color.rgb(0, 123, 208));
	}
	private void init(){
//		//用户任务数量
		TextView task_tv = (TextView)findViewById(R.id.act_main_task_tv);
		Utils.setTypeface2(this, task_tv);
//		//经验进度
		TextView experience_tv = (TextView)findViewById(R.id.act_main_experience_tv);
		Utils.setTypeface1(this, experience_tv);
		experience_tv.setTextColor(Color.rgb(252,243,200));
//		//用户级别
		TextView level_tv = (TextView)findViewById(R.id.act_main_level_tv);
		
		level_tv.setText(user.getLevel().getName());
		Utils.setTypeface2(this, level_tv);
		//用户金币数量
		TextView gold_tv = (TextView)findViewById(R.id.act_main_gold_tv);
		gold_tv.setText(user.getGold()+"");
		Utils.setTypeface1(this, gold_tv);
		gold_tv.setTextColor(Color.rgb(252,243,200));
		//用户宝石数量
		TextView gem_tv = (TextView)findViewById(R.id.act_main_gem_tv);
		gem_tv.setText(user.getGem()+"");
		Utils.setTypeface1(this, gold_tv);
		gem_tv.setTextColor(Color.rgb(252,243,200));
		//用户当前计划达成进度
		TextView plan_tv = (TextView)findViewById(R.id.act_main_plan_tv);
		plan_tv.setText(String.valueOf(user.getCurrentWeight()-user.getPlanBeginWeight()));
		Utils.setTypeface1(this, plan_tv);
		ProgressBar plan_pb  = (ProgressBar)findViewById(R.id.act_main_plan_pb);
		plan_pb.setProgress(50);
		//当日运动消耗热量进度
		TextView calorie_tv = (TextView)findViewById(R.id.act_main_calorie_tv);
		calorie_tv.setText(user.getTodayLossFat()+"");
		Utils.setTypeface1(this, calorie_tv);
		ProgressBar calorie_pb = (ProgressBar)findViewById(R.id.act_main_calorie_pb);
		calorie_pb.setProgress(20);
		//用户图像
		ImageView userIcon_iv = (ImageView)findViewById(R.id.act_main_user_icon);
		userIcon_iv.setImageBitmap(Utils.toRoundBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher)));
		userIcon_iv.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, PersonalHomeActivity.class);
				startActivity(intent);
				finish(); 
			}
		});
		//拍档图像
		ImageView partnerIconIv = (ImageView)findViewById(R.id.act_main_partner_icon);
		partnerIconIv.setImageBitmap(Utils.toRoundBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher)));
		partnerIconIv.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				Log.i("tag", "user.getPartnerId()="+user.getPartnerId());
				if(user.getPartnerId().equals("")){
					Intent intent = new Intent(MainActivity.this, PartnerActivity.class);
					startActivity(intent);
				}
			}
		});
		//用户反馈按钮 
		Button feedBack_btn = (Button)findViewById(R.id.act_main_feedback_btn);
		feedBack_btn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				UMFeedbackService.openUmengFeedbackSDK(MainActivity.this);
			}
		});
		//PK按钮
		Button pkBtn = (Button)findViewById(R.id.act_main_pk_btn);
		pkBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(MainActivity.this, PKActivity.class,false, false);
			}
		});
		//社区按钮
		Button communityBtn = (Button)findViewById(R.id.act_main_community_btn);
		communityBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(MainActivity.this, BBSActivity.class,false,true);
			}
		});
		//菜谱按钮
		Button mealBtn = (Button)findViewById(R.id.act_main_meal_btn);
		mealBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(MainActivity.this, MealActivity.class,false, true);
			}
		});
	}
	@Override
	public void onResume() {
		super.onResume();
		//友盟监听
		MobclickAgent.onResume(this);
	}
	@Override
	public void onPause() {
		super.onPause();
		//友盟监听
		MobclickAgent.onPause(this);
	}
}

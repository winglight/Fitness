package com.sythealth.fitness;

import com.sythealth.custom.fragment.FriendsterFragment;
import com.sythealth.custom.fragment.BBSFragment;
import com.sythealth.fitness.util.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class BBSActivity extends BaseActivity {
	private Button myfriendsBtn;
	private Button friendsterBtn;
	private Button localClubBtn;
	private Button bbsBtn;
	private Button titleBtn;
	public static final String MYFRIENDSFRAGMENT_TAG = "MyFriendsFragment";
	public static final String FRIENDSTERFRAGMENT_TAG = "FriendsterFragment";
	public static final String BBSFRAGMENT_TAG = "BBSFragment";
	public TextView titleTv;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bbs);
		init();
	}
	private void init(){
		titleBtn = (Button)findViewById(R.id.act_bbs_title_btn);
		titleTv = (TextView)findViewById(R.id.act_bbs_title_tv);
		//返回按钮
		Button backBtn = (Button)findViewById(R.id.act_bbs_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(BBSActivity.this, MainActivity.class,true, true);
			}
		});
		//我的好友按钮
		myfriendsBtn = (Button)findViewById(R.id.act_bbs_myfriend_btn);
		myfriendsBtn.setOnClickListener(btnClick);
		//朋友圈
		friendsterBtn = (Button)findViewById(R.id.act_bbs_friendster_btn);
		friendsterBtn.setOnClickListener(btnClick);
		//同城俱乐部
		localClubBtn = (Button)findViewById(R.id.act_bbs_localclub_btn);
		localClubBtn.setOnClickListener(btnClick);
		//社区
		bbsBtn = (Button)findViewById(R.id.act_bbs_bbs_btn);
		bbsBtn.setOnClickListener(btnClick);
	}
	private OnClickListener btnClick = new View.OnClickListener() {		
		@Override
		public void onClick(View v) {
			Button btn = (Button)v;
			switch (btn.getId()) {
			case R.id.act_bbs_myfriend_btn:
				myfriendsBtn.setBackgroundResource(R.drawable.myfriend_btn);
				myfriendsBtn.setEnabled(false);
				friendsterBtn.setBackgroundResource(R.drawable.friendster_btn_unhighlighted);
				friendsterBtn.setEnabled(true);
				localClubBtn.setBackgroundResource(R.drawable.localclub_btn_unhighlighted);
				localClubBtn.setEnabled(true);
				bbsBtn.setBackgroundResource(R.drawable.bbs_btn_unhighlighted);
				bbsBtn.setEnabled(true);
				addFragment(MyFriendsFragment.newInstance(), MYFRIENDSFRAGMENT_TAG, R.id.act_bbs_fragment);
				titleTv.setText("我的好友");
				titleBtn.setVisibility(View.VISIBLE);
				titleBtn.setOnClickListener(new OnClickListener() {					
					@Override
					public void onClick(View v) {
						Intent intent = new Intent();
						intent.setClass(BBSActivity.this, AddFriendsActivity.class);
						startActivity(intent);
					}
				});
				break;
			case R.id.act_bbs_friendster_btn:
				friendsterBtn.setBackgroundResource(R.drawable.friendster_btn);
				friendsterBtn.setEnabled(false);
				localClubBtn.setBackgroundResource(R.drawable.localclub_btn_unhighlighted);
				localClubBtn.setEnabled(true);
				bbsBtn.setBackgroundResource(R.drawable.bbs_btn_unhighlighted);
				bbsBtn.setEnabled(true);
				myfriendsBtn.setBackgroundResource(R.drawable.myfriend_btn_unhighlighted);
				myfriendsBtn.setEnabled(true);
				addFragment(FriendsterFragment.newInstance(), FRIENDSTERFRAGMENT_TAG, R.id.act_bbs_fragment);
				titleTv.setText("朋友圈");
				break;
			case R.id.act_bbs_localclub_btn:
				localClubBtn.setBackgroundResource(R.drawable.localclub_btn);
				localClubBtn.setEnabled(false);
				bbsBtn.setBackgroundResource(R.drawable.bbs_btn_unhighlighted);
				bbsBtn.setEnabled(true);
				myfriendsBtn.setBackgroundResource(R.drawable.myfriend_btn_unhighlighted);
				myfriendsBtn.setEnabled(true);
				friendsterBtn.setBackgroundResource(R.drawable.friendster_btn_unhighlighted);
				friendsterBtn.setEnabled(true);
				break;
			case R.id.act_bbs_bbs_btn:
				bbsBtn.setBackgroundResource(R.drawable.bbs_btn);
				bbsBtn.setEnabled(false);
				myfriendsBtn.setBackgroundResource(R.drawable.myfriend_btn_unhighlighted);
				myfriendsBtn.setEnabled(true);
				friendsterBtn.setBackgroundResource(R.drawable.friendster_btn_unhighlighted);
				friendsterBtn.setEnabled(true);
				localClubBtn.setBackgroundResource(R.drawable.localclub_btn_unhighlighted);
				localClubBtn.setEnabled(true);
				addFragment(BBSFragment.newInstance(), BBSFRAGMENT_TAG, R.id.act_bbs_fragment);
				titleTv.setText("社区论坛");
				break;
			}
		}
	};
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK){
			Intent intent = new Intent();
			intent.setClass(this, MainActivity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.push_left_in,R.anim.push_right_out);
			finish();
		}
		return super.onKeyDown(keyCode, event);
	}
}

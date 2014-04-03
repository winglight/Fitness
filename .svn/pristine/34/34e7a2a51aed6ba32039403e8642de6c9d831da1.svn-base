package com.sythealth.fitness;



import java.util.Calendar;
import java.util.Collection;

import com.sythealth.fitness.db.DiaryModel;
import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class DiaryActivity extends BaseActivity {
	private ServiceImpl service;
	private Collection<DiaryModel> diaryModels;
	private LinearLayout layout;
	public static String DIARYMODEL_KEY="DiaryModel";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diary);
		service = getService();
		init();
	}
	private void init() {
		Button backBtn = (Button)findViewById(R.id.act_diary_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				onBackPressed();
			}
		});
		// 日记列表 自定义数据
		layout = (LinearLayout)findViewById(R.id.act_diary_layout);
		layout.setPadding(20, 20, 20, 20);
		for (int i = 0; i < 20; i++) {
			View view = LayoutInflater.from(this).inflate(
					R.layout.view_mydiary, null);
			ImageView iconIv = (ImageView) view
					.findViewById(R.id.view_mydiary_icon_iv);
			iconIv.setBackgroundResource(R.drawable.s_logo_shrink);
			TextView desTv = (TextView) view
					.findViewById(R.id.view_mydiary_des_tv);
			desTv.setText("今天哥又胖了");
			LinearLayout diaryLayout = (LinearLayout) view
					.findViewById(R.id.view_mydiary_layout);
			diaryLayout.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent();
					intent.setClass(DiaryActivity.this, DiaryInfoActivity.class);
					startActivity(intent);
				}
			});
			layout.addView(view);
		}
		// 写日记按钮
		Button editBtn = (Button)findViewById(R.id.act_diary_editdiary_btn);
		editBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(DiaryActivity.this, EditDiaryActivity.class);
				startActivity(intent);		
			}
		});
		initializeData();
	}
	private void initializeData(){
		layout.removeAllViews();
		UserModel user = service.getCurrentUser();
		diaryModels = user.getDiaryList();
		Log.i("tag", "ssss=="+diaryModels.size());
		//当我的日记集合不为空的时候列出我的所有日记
		if(diaryModels!=null){
			for (final DiaryModel diaryModel : diaryModels) {
				View view = LayoutInflater.from(this).inflate(R.layout.view_mydiary, null);
				ImageView iconIv = (ImageView)view.findViewById(R.id.view_mydiary_icon_iv);
				iconIv.setBackgroundResource(R.drawable.s_logo_shrink);
				TextView desTv = (TextView)view.findViewById(R.id.view_mydiary_des_tv);
				desTv.setText(diaryModel.getTextContent());
				TextView monthTv = (TextView)view.findViewById(R.id.view_mydiary_month_tv);
				Calendar cal = Calendar.getInstance();
				cal.setTime(diaryModel.getCreatedAt());
				monthTv.setText((cal.get(Calendar.MONTH)+1)+"月");
				TextView dayTv = (TextView)view.findViewById(R.id.view_mydiary_day_tv);
				dayTv.setText(cal.get(Calendar.DAY_OF_MONTH)+"");
				LinearLayout diaryLayout = (LinearLayout)view.findViewById(R.id.view_mydiary_layout);
				diaryLayout.setOnClickListener(new OnClickListener() {				
					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent();
						intent.setClass(DiaryActivity.this, DiaryInfoActivity.class);
						intent.putExtra(DIARYMODEL_KEY, diaryModel);
						startActivity(intent);
					}
				});
				layout.addView(view);
			}
		}
	}	
	@Override
	public void onResume() {
		initializeData();
		super.onResume();
	}
}

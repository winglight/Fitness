package com.sythealth.fitness;

import java.util.Calendar;
import java.util.Date;

import com.sythealth.custom.fragment.WeightNormFragment;
import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.DateUtils;
import com.sythealth.fitness.util.Utils;
import com.sythealth.fitness.view.ArrayWheelAdapter;
import com.sythealth.fitness.view.CityWheelAdapter;
import com.sythealth.fitness.view.CustomAlertDialog;
import com.sythealth.fitness.view.OnWheelChangedListener;
import com.sythealth.fitness.view.ProvinceWheelAdapter;
import com.sythealth.fitness.view.WheelView;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FitnessCaseActivity extends BaseActivity {
	// 开始体验按钮
	private Button startBtn;
	private Button saveBtn;
	private Button cancelBtn;
	private Button modifyBtn;
	private TextView initialTv;// 初始体重
	private TextView goalTv;// 目标体重
	private TextView endDateTv;// 计划结束日期
	private TextView norWeightTv;
	private TextView bestWeightTv;
	private TextView startDateTv;
	private TextView expendcalTv;
	private TextView intakecalTv;
	private boolean modifyFlag = false;
	private String[] weight1;
	private String[] weight2;
	private ServiceImpl service;
	private double beginPlanWeight;
	private double endPlanWeight;
	private Date endPlanDate;
	private Calendar calendar;
	private UserModel user;
	private int step = 0;
	private Fragment fragment;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fitnesscase);
		service = getService();
		weight1 = getResources().getStringArray(R.array.weight_quantity);
		weight2 = getResources().getStringArray(R.array.weight_point);
		init();
	}

	private void init() {
		norWeightTv = (TextView)findViewById(R.id.act_fitnesscase_norm_weight_tv);
		bestWeightTv = (TextView)findViewById(R.id.act_fitnesscase_best_weight_tv);
		startDateTv = (TextView)findViewById(R.id.act_fitnesscase_startdate_tv);
		expendcalTv = (TextView)findViewById(R.id.act_fitnesscase_expendcal_tv);
		intakecalTv = (TextView)findViewById(R.id.act_fitnesscase_intakecal_tv);
		initialTv = (TextView) findViewById(R.id.act_fitnesscase_initial_weight_tv);
		goalTv = (TextView) findViewById(R.id.act_fitnesscase_goal_weight_tv);
		endDateTv = (TextView) findViewById(R.id.act_fitnesscase_enddate_tv);
		startBtn = (Button) findViewById(R.id.act_fitness_starte_btn);
		startBtn.setVisibility(View.GONE);
		saveBtn = (Button) findViewById(R.id.act_fitness_save_btn);
		saveBtn.setVisibility(View.GONE);
		cancelBtn = (Button) findViewById(R.id.act_fitness_cancel_btn);
		cancelBtn.setVisibility(View.GONE);
	//	initializeDate(service.getCurrentUser());
		//体重标准列表按钮
		Button weightNromBtn = (Button)findViewById(R.id.act_fitnesscase_weightnrom_btn);
		weightNromBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				addFragment(WeightNormFragment.newInstance(), null, android.R.id.content);
			}
		});
		// 返回按钮
		Button backBtn = (Button) findViewById(R.id.act_fitnesscase_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(FitnessCaseActivity.this, PersonalHomeActivity.class,true, true);
			}
		});
		//取消按钮
		cancelBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				modifyBtn.setVisibility(View.VISIBLE);
				saveBtn.setVisibility(View.GONE);
				cancelBtn.setVisibility(View.GONE);
				initialTv.setBackgroundResource(R.drawable.transparent);
				goalTv.setBackgroundResource(R.drawable.transparent);
				endDateTv.setBackgroundResource(R.drawable.transparent);
				modifyFlag = false;
			}
		});
		// 保存按钮
		saveBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if(beginPlanWeight>0&&endPlanWeight>0){
					if(endPlanWeight>beginPlanWeight){
						Toast.makeText(FitnessCaseActivity.this, "目标体重大与初始体重", Toast.LENGTH_SHORT).show();
					}else{
						service.savePlan(beginPlanWeight, endPlanWeight, endPlanDate);
						initializeDate(service.getCurrentUser());
						modifyBtn.setVisibility(View.VISIBLE);
						saveBtn.setVisibility(View.GONE);
						cancelBtn.setVisibility(View.GONE);
						initialTv.setBackgroundResource(R.drawable.transparent);
						goalTv.setBackgroundResource(R.drawable.transparent);
						endDateTv.setBackgroundResource(R.drawable.transparent);
						modifyFlag = false;
					}
				}
				
			}
		});
		// 修改按钮
		modifyBtn = (Button) findViewById(R.id.act_fitnesscase_modify);
		modifyBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startDateTv.setText(DateUtils.formatDate(new Date(System.currentTimeMillis())));
				modifyBtn.setVisibility(View.INVISIBLE);
				saveBtn.setVisibility(View.VISIBLE);
				cancelBtn.setVisibility(View.VISIBLE);
				initialTv.setBackgroundResource(R.drawable.edittext_bg);
				goalTv.setBackgroundResource(R.drawable.edittext_bg);
				endDateTv.setBackgroundResource(R.drawable.edittext_bg);
				modifyFlag = true;
			}
		});
		// 设置计划初始体重
		initialTv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (modifyFlag) {
					View view = LayoutInflater.from(FitnessCaseActivity.this)
							.inflate(R.layout.view_weight, null);
					TextView text = (TextView) view
							.findViewById(R.id.view_weight_tv);
					text.setText("请录入您的最新体重");
					TextView tipsTv = (TextView) view
							.findViewById(R.id.view_weight_tips_tv);
					tipsTv.setVisibility(View.GONE);
					final WheelView weightWV1 = (WheelView) view
							.findViewById(R.id.view_weight_wv1);
					weightWV1
							.setAdapter(new ArrayWheelAdapter<String>(weight1));
					final WheelView weightWV2 = (WheelView) view
							.findViewById(R.id.view_weight_wv2);
					weightWV2
							.setAdapter(new ArrayWheelAdapter<String>(weight2));
					new CustomAlertDialog.Builder(FitnessCaseActivity.this)
							.setView(view)
							.setPositiveButton(" ",
									new DialogInterface.OnClickListener() {
										@Override
										public void onClick(
												DialogInterface dialog,
												int which) {
											beginPlanWeight = Integer
													.parseInt(weight1[weightWV1
															.getCurrentItem()])
													+ Double.valueOf(weight2[weightWV2
															.getCurrentItem()]);
											initialTv.setText(beginPlanWeight
													+ "公斤");
										}
									}).setNegativeButton(" ", null).show();
				}
			}
		});
		// 设置计划目标体重
		goalTv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (modifyFlag) {
					View view = LayoutInflater.from(FitnessCaseActivity.this)
							.inflate(R.layout.view_weight, null);
					TextView text = (TextView) view
							.findViewById(R.id.view_weight_tv);
					text.setText("请录入您的计划体重");
					TextView tipsTv = (TextView) view
							.findViewById(R.id.view_weight_tips_tv);
					tipsTv.setVisibility(View.GONE);
					final WheelView weightWV1 = (WheelView) view
							.findViewById(R.id.view_weight_wv1);
					weightWV1
							.setAdapter(new ArrayWheelAdapter<String>(weight1));
					final WheelView weightWV2 = (WheelView) view
							.findViewById(R.id.view_weight_wv2);
					weightWV2
							.setAdapter(new ArrayWheelAdapter<String>(weight2));
					new CustomAlertDialog.Builder(FitnessCaseActivity.this)
							.setView(view)
							.setPositiveButton(" ",
									new DialogInterface.OnClickListener() {
										@Override
										public void onClick(
												DialogInterface dialog,
												int which) {
											endPlanWeight = Integer
													.parseInt(weight1[weightWV1
															.getCurrentItem()])
													+ Double.valueOf(weight2[weightWV2
															.getCurrentItem()]);
											goalTv.setText(endPlanWeight+"公斤");
										}
									}).setNegativeButton(" ", null).show();
				}
			}
		});
		// 设置结束日期
		endDateTv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(modifyFlag){
					calendar = Calendar.getInstance();
					new DatePickerDialog(FitnessCaseActivity.this, new OnDateSetListener() {					
						@Override
						public void onDateSet(DatePicker view, int year, int monthOfYear,
								int dayOfMonth) {
							calendar.set(year, monthOfYear, dayOfMonth);
							Calendar systemCalendar = Calendar.getInstance();
							if(systemCalendar.getTimeInMillis()>calendar.getTimeInMillis()){
								Toast.makeText(FitnessCaseActivity.this, "结束日期不能大于或等于开始日期", Toast.LENGTH_SHORT).show();
							}else{
								endPlanDate = new Date(calendar.getTimeInMillis());
								endDateTv.setText(DateUtils.formatDate(endPlanDate));
							}
						}
					}, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
				}
			}
		});
	}
	private void initializeDate(UserModel user){
		norWeightTv.setText(user.getStandardWeight()+"公斤");
		bestWeightTv.setText(Math.floor(user.getBeautyWeight())+"公斤");
		initialTv.setText(user.getPlanBeginWeight()+"公斤");
		goalTv.setText(user.getPlanEndWeight()+"公斤");
		startDateTv.setText(DateUtils.formatDate(user.getPlanBeginDate()));
		endDateTv.setText(DateUtils.formatDate(user.getPlanEndDate()));
		expendcalTv.setText("不少于"+user.getDailyOutCals()+"千卡");
		intakecalTv.setText("不多于"+user.getDailyInCals()+"千卡");
	}
	/**
	 * 重写系统返回按键
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
			if (step == 0) {
				onBackPressed();
			} else if (step > 0) {
				step--;
				backFragment(getFragment());
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	public void addStep() {
		this.step = step + 1;
	}
	public Fragment getFragment() {
		return fragment;
	}
	public void setFragment(Fragment fragment) {
		this.fragment = fragment;
	}
	public void decreaseStep(){
		this.step = step -1;
	}
}

package com.sythealth.fitness;

import com.sythealth.fitness.db.DiaryModel;
import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.DateUtils;
import com.sythealth.fitness.util.Utils;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DiaryInfoActivity extends BaseActivity {
	private DiaryModel diaryModel;
	private UserModel user;
	private ServiceImpl service;
	private LinearLayout imageLayout;
	private Bitmap bitmap;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diaryinfo);
		Intent intent = getIntent();
		DiaryModel diaryModel = (DiaryModel) intent.getSerializableExtra(DiaryActivity.DIARYMODEL_KEY);
		init(diaryModel);
	}
    private void init(DiaryModel diaryModel){
	//返回按钮
	Button backBtn = (Button)findViewById(R.id.act_diaryinfo_back_btn);
	backBtn.setOnClickListener(new OnClickListener() {			
		@Override
		public void onClick(View arg0) {
			onBackPressed();
		}
	});
	imageLayout = (LinearLayout)findViewById(R.id.act_diaryinfo_image_layout);
	//用户图像
	ImageView iconIv = (ImageView)findViewById(R.id.act_diaryinfo_icon_iv);
	iconIv.setBackgroundResource(R.drawable.s_logo_shrink);
	//用户昵称
	TextView nameTv = (TextView)findViewById(R.id.act_diaryinfo_name_tv);
	nameTv.setText("孙子");
	
	//日记内容
	TextView valueTv = (TextView)findViewById(R.id.act_diaryinfo_value_tv);
	valueTv.setText(diaryModel.getTextContent());
	//发表日期
	TextView dateTv = (TextView)findViewById(R.id.act_diaryinfo_date_tv);
	if(user!=null){
		nameTv.setText(user.getNickName());
	}
	if(diaryModel!=null){
		dateTv.setText(DateUtils.formatMonthDayHourMinute(diaryModel.getCreatedAt()));
		final String []imagePaths = Utils.stringIntoArray(Utils.getStrFromBase64(diaryModel.getImages()));
		for (int i = 0; i < imagePaths.length; i++) {
			ImageView iv = new ImageView(this);
			iv.setPadding(10, 0, 0, 0);
			bitmap = Utils.getThumbnailBitmap(imagePaths[i]);
			iv.setImageBitmap(bitmap);
			imageLayout.addView(iv);
			iv.setTag(i);
			iv.setOnClickListener(new OnClickListener() {			
				@Override
				public void onClick(View arg0) {					
					AlertDialog dialog = new AlertDialog.Builder(DiaryInfoActivity.this).create();
					ImageView iv = new ImageView(DiaryInfoActivity.this);
					if(bitmap !=null && !bitmap.isRecycled()){
						bitmap.recycle();
					}
					System.gc();
					bitmap = Utils.getBitmap(imagePaths[(Integer) arg0.getTag()]);
					iv.setImageBitmap(bitmap);
					dialog.setView(iv);
					dialog.setCanceledOnTouchOutside(true);
					dialog.show();
				}
			});
			Log.i("tag", "imagePaths=="+imagePaths[i]);
		}
	}
  }
}

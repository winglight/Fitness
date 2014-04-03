package com.sythealth.fitness;

import java.io.FileNotFoundException;
import java.util.Date;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.sythealth.fitness.db.DiaryModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;
import com.sythealth.fitness.view.CustomAlertDialog;

import android.app.ActionBar.LayoutParams;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class EditDiaryActivity extends BaseActivity {
	private ServiceImpl service;
	private boolean isPublic = true;
	private Button privateBtn;
	private Button publicBtn;
	private LinearLayout layout;
	private Uri uri;
	private StringBuffer sb = new StringBuffer();
	private Bitmap bitmap;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editdiary);
		service = getService();
		init();
		
	}
	private void init(){
		layout = (LinearLayout)findViewById(R.id.act_editdiary_pic_layout);
		//返回按钮
		Button backBtn = (Button)findViewById(R.id.act_editdiary_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				onBackPressed();
			}
		});
		//日记是否公开
		privateBtn = (Button)findViewById(R.id.act_editdiary_private_btn);
		publicBtn = (Button)findViewById(R.id.act_editdiary_public_btn);
		privateBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				if(isPublic){
					isPublic = false;
					privateBtn.setBackgroundResource(R.drawable.diary_flag_true);
					publicBtn.setBackgroundResource(R.drawable.diary_flag_false);
				}
			}
		});
		publicBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				if(!isPublic){
					isPublic = true;
					publicBtn.setBackgroundResource(R.drawable.diary_flag_true);
					privateBtn.setBackgroundResource(R.drawable.diary_flag_false);
				}
			}
		});
		//日记内容
		final EditText valueEt = (EditText)findViewById(R.id.act_editdiary_value_et);
		//保存日记按钮
		Button saveBtn = (Button)findViewById(R.id.act_editdiary_save_btn);
		saveBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				if(!valueEt.getText().toString().equals("")){
					Date date = new Date(System.currentTimeMillis());
					DiaryModel diaryModel = new DiaryModel();
					diaryModel.setPublic(isPublic);
					diaryModel.setTextContent(valueEt.getText().toString());
					diaryModel.setCreatedAt(date);
					diaryModel.setImages(Base64.encodeToString(sb.toString().getBytes(), Base64.DEFAULT));
					service.createDiaryRecord(diaryModel);
					Toast.makeText(EditDiaryActivity.this, "保存成功",Toast.LENGTH_SHORT).show();
					onBackPressed();
				}else{
					Toast.makeText(EditDiaryActivity.this, "请输入日记内容",Toast.LENGTH_SHORT).show();
				}
			}
		});
		//添加图片按钮
		Button addImage = (Button)findViewById(R.id.act_editdiary_add_image_btn);
		addImage.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				View view = LayoutInflater.from(EditDiaryActivity.this).inflate(R.layout.view_option, null);
				Button btn1 = (Button)view.findViewById(R.id.view_option_btn1);
				btn1.setOnClickListener(new OnClickListener() {					
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(Intent.ACTION_GET_CONTENT,null);
						intent.setType("image/*");
						startActivityForResult(intent, 1);
					}
				});
				Button btn2 = (Button)view.findViewById(R.id.view_option_btn2);
				btn2.setOnClickListener(new OnClickListener() {				
					@Override
					public void onClick(View arg0) {
						Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
					//	intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
						startActivityForResult(intent, 2);
					}
				});
				new CustomAlertDialog.Builder(EditDiaryActivity.this).setView(view).setNegativeButton(" ",null).show();
			}
		});
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(resultCode == RESULT_OK){
			uri = data.getData();
			final String pathName = getPathFromURI(uri);
			if(sb.length() ==0){
				sb =sb.append(pathName);
			}else{
				sb = sb.append(",").append(pathName);
			}
			bitmap = Utils.getThumbnailBitmap(pathName);
			final ImageView iv = new ImageView(this);
			iv.setImageBitmap(bitmap);
			iv.setPadding(10, 5, 0, 0);
			iv.setOnClickListener(new OnClickListener() {					
				@Override
				public void onClick(View arg0) {
					if(bitmap!=null&&!bitmap.isRecycled()){
						bitmap.recycle();
					}
					System.gc();
					AlertDialog dialog = new AlertDialog.Builder(EditDiaryActivity.this).create();
					ImageView iv = new ImageView(EditDiaryActivity.this);
					bitmap = Utils.getBitmap(pathName);
					iv.setImageBitmap(bitmap);
					dialog.setView(iv);
					dialog.setCanceledOnTouchOutside(true);
					dialog.show();
				}
			});
			layout.addView(iv);
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
	public String getPathFromURI(Uri uri) {
		   String[] proj = { MediaStore.Images.Media.DATA };
		   Cursor course = managedQuery(uri, proj, null, null, null);
		   int index = course.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
		   course.moveToFirst();
		   String path = course.getString(index);
	       Log.i("tag", "path="+path);
	       return path;
	   } 
}

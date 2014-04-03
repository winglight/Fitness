package com.sythealth.fitness;

import com.sythealth.fitness.util.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FriendsterShareActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_friendstershare);
		init();
	}
	private void init(){
		Button backBtn = (Button)findViewById(R.id.act_friendstershare_back_btn);
		Utils.goBack(backBtn, this);
		LinearLayout layout = (LinearLayout)findViewById(R.id.act_friendstershare_layout);
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
					intent.setClass(FriendsterShareActivity.this, ShareInfoActivity.class);
					startActivity(intent);
				}
			});
			layout.addView(view);
		}
	}
}

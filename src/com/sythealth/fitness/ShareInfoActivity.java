package com.sythealth.fitness;

import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.widget.Button;

public class ShareInfoActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shareinfo);
		init();
	}
	private void init(){
		Button backBtn = (Button)findViewById(R.id.act_shareinfo_back_btn);
		Utils.goBack(backBtn, this);
	}
}

package com.sythealth.fitness;

import java.util.Iterator;
import java.util.List;

import com.sythealth.fitness.db.CountSportModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PKActivity extends BaseActivity {
	private Button itemBtn1;
	private Button itemBtn2;
	private Button itemBtn3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pk);
		init();
	}
	private void init(){
		//返回按钮
		Button backBtn = (Button)findViewById(R.id.act_pk_back_btn);
		Utils.goBack(backBtn,this);
		//英雄榜按钮
		Button heroListBtn = (Button)findViewById(R.id.act_pk_herolist_btn);
		heroListBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(PKActivity.this, HeroListActivity.class);
				startActivity(intent);
			}
		});
		//今日比赛三个项目
		itemBtn1 = (Button)findViewById(R.id.act_pk_item_01);
		itemBtn2 = (Button)findViewById(R.id.act_pk_item_02);
		itemBtn3 = (Button)findViewById(R.id.act_pk_item_03);
		getPKitem();
	}
	//获取今日比赛项目message	
	private void getPKitem(){
		final ProgressDialog pd = Utils.customProgressDialog(this, "正在获取今日比赛项目...");
		pd.setCanceledOnTouchOutside(false);
		final ServiceImpl service = getService();
		service.getPKSports(new Handler(){
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				List<CountSportModel> sportModels = (List<CountSportModel>) msg.obj;
				if(sportModels!=null){
					itemBtn1.setText(sportModels.get(0).getSportName());
					itemBtn2.setText(sportModels.get(1).getSportName());
					itemBtn3.setText(sportModels.get(2).getSportName());
					service.saveCountSportRecord(30, sportModels.get(0),true);
				}
				pd.dismiss();
			}
		});	
	}
}

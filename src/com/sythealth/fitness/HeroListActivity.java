package com.sythealth.fitness;

import com.sythealth.custom.fragment.MyHeroListFragment;
import com.sythealth.custom.fragment.OtherHeroListFragment;
import com.sythealth.fitness.util.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HeroListActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_herolist);
		init();
	}
	private void init(){
		//返回按钮
		Button backBtn = (Button)findViewById(R.id.act_herolist_back_btn);
		Utils.goBack(backBtn, this);
		//昨日同城按钮
		final Button localBtn = (Button)findViewById(R.id.act_herolist_local_btn);
		final Button nationwideBnt = (Button)findViewById(R.id.act_herolist_nationwide_btn);
		final Button mineBtn = (Button)findViewById(R.id.act_herolist_mine_btn);
		localBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				localBtn.setEnabled(false);
				localBtn.setBackgroundResource(R.drawable.pk_local_btn_unhighlighted);			
				nationwideBnt.setEnabled(true);
				nationwideBnt.setBackgroundResource(R.drawable.pk_nationwide_btn_state);
				mineBtn.setEnabled(true);
				mineBtn.setBackgroundResource(R.drawable.pk_mine_btn_state);
				FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
				ft.setCustomAnimations(R.anim.push_up_in, R.anim.push_up_out);
				ft.replace(R.id.act_herolist_fragment, OtherHeroListFragment.newInstance(), "local");
				ft.commit();
			}
		});
		//昨日全国按钮
		nationwideBnt.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				nationwideBnt.setEnabled(false);
				nationwideBnt.setBackgroundResource(R.drawable.pk_nationwide_btn_unhighlighted);
				mineBtn.setEnabled(true);
				mineBtn.setBackgroundResource(R.drawable.pk_mine_btn_state);
				localBtn.setEnabled(true);
				localBtn.setBackgroundResource(R.drawable.pk_local_btn_state);
				FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
				ft.setCustomAnimations(R.anim.push_right_in, R.anim.push_left_out);
				ft.replace(R.id.act_herolist_fragment, OtherHeroListFragment.newInstance(), "nationwide");
				ft.commit();
			}
		});
		//我的按钮
		mineBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				mineBtn.setEnabled(false);
				mineBtn.setBackgroundResource(R.drawable.pk_mine_btn_unhighlighted);
				localBtn.setEnabled(true);
				localBtn.setBackgroundResource(R.drawable.pk_local_btn_state);
				nationwideBnt.setEnabled(true);
				nationwideBnt.setBackgroundResource(R.drawable.pk_nationwide_btn_state);
				FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
				ft.setCustomAnimations(R.anim.push_left_in, R.anim.push_right_out);
				ft.replace(R.id.act_herolist_fragment, MyHeroListFragment.newInstance(), "mine");
				ft.commit();
			}
		});
	}
}

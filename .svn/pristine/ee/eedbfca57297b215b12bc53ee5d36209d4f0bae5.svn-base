package com.sythealth.fitness;

import com.sythealth.custom.fragment.NearbyFragment;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AddFriendsActivity extends BaseActivity {
	public static final String NEARBYFRAGMENT_TAG = "NearbyFragment";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addfriends);
		init();
	}
	private void init(){
		Button btn = (Button)findViewById(R.id.act_addfriends_back_btn);
		Utils.goBack(btn, this);
		//附件的人
		Button nearbyBtn = (Button)findViewById(R.id.act_addfriend_nearby_btn);
		nearbyBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				addFragment(NearbyFragment.newInstance(), NEARBYFRAGMENT_TAG,android.R.id.content);
			}
		});
	}
}

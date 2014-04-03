package com.sythealth.fitness;

import com.sythealth.custom.fragment.InvitePartnerFragment;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PartnerActivity extends BaseActivity {
	private static final String INVITEPARTNERFRAGMENT_TAG = "InvitePartnerFragment";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_partner);
		init();
	}
	private void init(){
		//返回按钮
		Button backBtn = (Button)findViewById(R.id.act_partner_back_btn);
		Utils.goBack(backBtn, this);
		//邀请拍档
		Button inviteBtn = (Button)findViewById(R.id.act_partner_invite_btn);
		inviteBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View arg0) {
				addFragment(InvitePartnerFragment.newInstance(), INVITEPARTNERFRAGMENT_TAG,android.R.id.content);
			}
		});
	}
}

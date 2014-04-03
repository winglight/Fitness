package com.sythealth.custom.fragment;

import com.sythealth.fitness.R;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class InvitePartnerFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_invitepartner, container, false);
		init(view);
		return view;
	}
	private void init(View v){
		//返回按钮
		Button backBtn = (Button)v.findViewById(R.id.fra_invitepartner_back_btn);
		Utils.BackForAct(getActivity(), backBtn, this);
	}
	public static InvitePartnerFragment newInstance(){
		InvitePartnerFragment fragment = new InvitePartnerFragment();
		return fragment;
	}
}

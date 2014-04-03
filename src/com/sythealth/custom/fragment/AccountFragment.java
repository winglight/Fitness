package com.sythealth.custom.fragment;

import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.util.Utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

public class AccountFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_account,container, false);
		init(view);
		return view;
	}
	private void init(View v){
		//返回按钮
		Button backBtn = (Button)v.findViewById(R.id.fra_account_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(getActivity(), PersonalHomeActivity.class,true, true);
			}
		});
	}
	public static AccountFragment newInstance(){
		AccountFragment fragment = new AccountFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

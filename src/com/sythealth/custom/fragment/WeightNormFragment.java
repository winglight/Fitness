package com.sythealth.custom.fragment;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.FitnessCaseActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WeightNormFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_weightnorm, container, false);
		init(view);
		((FitnessCaseActivity)getActivity()).addStep();
		((FitnessCaseActivity)getActivity()).setFragment(this);
		return view;
	}
	private void init(View v){
		Button backBtn = (Button)v.findViewById(R.id.fra_weightnorm_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				((FitnessCaseActivity)getActivity()).decreaseStep();
				((BaseActivity)getActivity()).backFragment(WeightNormFragment.this);
			}
		});
	}
	public static WeightNormFragment newInstance(){
		WeightNormFragment fragment = new WeightNormFragment();
		return fragment;
	}
}

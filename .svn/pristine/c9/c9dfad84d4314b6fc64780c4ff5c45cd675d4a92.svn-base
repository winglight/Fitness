package com.sythealth.custom.fragment;

import org.restlet.Server;

import com.sythealth.fitness.MainActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.PostedBBSActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BodyTypeFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_bodytype, container, false);
		init(view);
		return view;
	}
	private void init(View v){
		Button backBtn = (Button)v.findViewById(R.id.fra_bodytype_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(getActivity(), PersonalHomeActivity.class,true, true);
			}
		});
	}
	public static BodyTypeFragment newInstance(){
		BodyTypeFragment fragment = new BodyTypeFragment();
//		Bundle bundle = new Bundle();
//		fragment.setArguments(bundle);
		return fragment;
	}
}

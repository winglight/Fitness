package com.sythealth.custom.fragment;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.db.MedalModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MedalListFragment extends Fragment {
	private ServiceImpl service;
	private List<MedalModel> medalModels;
	private LinearLayout layout;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		service = ((BaseActivity)getActivity()).getService();
		medalModels = service.getAllMedals();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_medallist, container, false);
		init(view);
		((PersonalHomeActivity)getActivity()).addStep();
		((PersonalHomeActivity)getActivity()).setFragment(this);
		return view;
	}
	private void init(View v){
		Button backBtn = (Button)v.findViewById(R.id.fra_medallist_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				((BaseActivity)getActivity()).backFragment(MedalListFragment.this);
				((PersonalHomeActivity)getActivity()).decreaseStep();
			}
		});
		//勋章列表
		layout = (LinearLayout)v.findViewById(R.id.fra_medallist_layout);
		layout.setPadding(20, 20, 20, 20);
		for (int i = 0; i < 20; i++) {
			View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_medal_listview, null);
			layout.addView(view);
		}
		//勋章列表逻辑
//		for (MedalModel medalModel : medalModels) {
//			View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_medal_listview, null);
//			ImageView iconIv = (ImageView)view.findViewById(R.id.medal_list_icon_iv);
//			Button nameBtn = (Button)view.findViewById(R.id.medal_list_name_btn);
//			TextView desTv = (TextView)view.findViewById(R.id.medal_list_des_tv);
//			nameBtn.setText(medalModel.getMedalName());
//			desTv.setText(medalModel.getCondition());
//			layout.addView(view);
//		}
	}
	public static MedalListFragment newInstance(){
		MedalListFragment fragment = new MedalListFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

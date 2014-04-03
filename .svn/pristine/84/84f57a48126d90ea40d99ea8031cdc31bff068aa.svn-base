package com.sythealth.custom.fragment;

import java.util.List;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.db.LevelModel;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LevelListFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_levellist,container, false);
		init(view);
		((PersonalHomeActivity)getActivity()).addStep();
		((PersonalHomeActivity)getActivity()).setFragment(this);
		return view;
	}
	private void init(View v){
		Button backBtn = (Button)v.findViewById(R.id.fra_level_back_btn);
		backBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				((BaseActivity)getActivity()).backFragment(LevelListFragment.this);
				((PersonalHomeActivity)getActivity()).decreaseStep();
			}
		});
		//级别列表
		LinearLayout layout = (LinearLayout)v.findViewById(R.id.fra_levellist_layout);
		layout.setPadding(20, 20, 20, 20);
		for (int i = 0; i < 20; i++) {
			View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_medal_listview, null);			
			layout.addView(view);
		}
		ServiceImpl service = ((BaseActivity)getActivity()).getService();
		List<LevelModel> levleModels = service.getAllLevels();
		for (LevelModel levelModel : levleModels) {
			View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_medal_listview, null);
			ImageView iconIv = (ImageView)view.findViewById(R.id.medal_list_icon_iv);
			Button nameBtn = (Button)view.findViewById(R.id.medal_list_name_btn);
			TextView desTv = (TextView)view.findViewById(R.id.medal_list_des_tv);
			nameBtn.setText(levelModel.getName());
			desTv.setText(levelModel.getIndex());
			layout.addView(view);
		}
	}
	public static LevelListFragment newInstance(){
		LevelListFragment fragment = new LevelListFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

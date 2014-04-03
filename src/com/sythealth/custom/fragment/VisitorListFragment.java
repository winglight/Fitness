package com.sythealth.custom.fragment;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;
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

public class VisitorListFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_visitorlist,container, false);
		init(view);
		((PersonalHomeActivity)getActivity()).addStep();
		((PersonalHomeActivity)getActivity()).setFragment(this);
		return view;
	}
	private void init(View v){
		Button backBtn = (Button)v.findViewById(R.id.fra_visitor_back_btn);
		Utils.BackForAct(getActivity(), backBtn, this);
		//级别列表
		LinearLayout layout = (LinearLayout)v.findViewById(R.id.fra_visitorlist_layout);
		layout.setPadding(20, 20, 20, 20);
		for (int i = 0; i < 20; i++) {
			View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_visitor_list, null);
			ImageView iconIv = (ImageView)view.findViewById(R.id.visitor_list_icon_iv);
			iconIv.setBackgroundResource(R.drawable.s_logo_shrink);
			TextView nameTv = (TextView)view.findViewById(R.id.visitor_list_name_tv);
			nameTv.setText("小三");
			ImageView sexIv = (ImageView)view.findViewById(R.id.visitor_list_sex_iv);
			sexIv.setBackgroundResource(R.drawable.sex1_btn);
			Button desBtn = (Button)view.findViewById(R.id.visitor_list_des_btn);
			desBtn.setText("我是神经病啊啊啊啊");
			layout.addView(view);
		}
	}
	public static VisitorListFragment newInstance(){
		VisitorListFragment fragment = new VisitorListFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

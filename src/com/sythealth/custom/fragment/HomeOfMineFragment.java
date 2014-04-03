package com.sythealth.custom.fragment;

import com.sythealth.fitness.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
//被别人查看
public class HomeOfMineFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_homeofmine, container, false);
		init(view);
		return view;
	}
	private void init(View v){
//		LinearLayout layout = (LinearLayout)v.findViewById(R.id.fragment_userinfo_layout);
//		View add_view = LayoutInflater.from(getActivity()).inflate(R.layout.view_userinfo, null);
//		layout.addView(add_view);
	}
	public static HomeOfMineFragment newInstance(){
		HomeOfMineFragment fragment = new HomeOfMineFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

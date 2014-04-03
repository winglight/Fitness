package com.sythealth.custom.fragment;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.db.CountSportModel;
import com.sythealth.fitness.db.UserModel;
import com.sythealth.fitness.db.enumetype.SportType;
import com.sythealth.fitness.service.ServiceImpl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyHeroListFragment extends Fragment {
	private ServiceImpl service;
	private UserModel user;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		service = ((BaseActivity)getActivity()).getService();
		user = service.getCurrentUser();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_myherolist,container, false);
		init(view);
		return view;
	}
	private void init(View v){
		//昨日战绩
		TextView detailTv = (TextView)v.findViewById(R.id.fra_myherolist_detail_tv);
		detailTv.setText(user.getPkYesterdayDetail());
		Log.i("tag", "user.getPkYesterdayDetail()=="+user.getPkYesterdayDetail());
	}
	public static MyHeroListFragment newInstance(){
		MyHeroListFragment fragment = new MyHeroListFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
}

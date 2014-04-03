package com.sythealth.custom.fragment;

import java.util.List;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.json.result.FitRankDto;
import com.sythealth.fitness.service.ServiceImpl;
import com.sythealth.fitness.util.Utils;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OtherHeroListFragment extends Fragment {
	private LinearLayout layout;
	private ServiceImpl service;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		service = ((BaseActivity)getActivity()).getService();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_otherherolist,container, false);
		init(view);
		getYesterPKList("123", true);
		return view;
	}
	private void init(View v){
		layout = (LinearLayout)v.findViewById(R.id.fra_otherherolist_layout);
	}
	public static OtherHeroListFragment newInstance(){
		OtherHeroListFragment fragment = new OtherHeroListFragment();
		Bundle bundle = new Bundle();
		fragment.setArguments(bundle);
		return fragment;
	}
	//获取昨日比赛排名  
	private void getYesterPKList(String cityId,boolean gender){
		final ProgressDialog pd = Utils.customProgressDialog(getActivity(), "正在获取排名...");
		service.getYesterdayPKList(new Handler(){
			@Override
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				List<FitRankDto> lists = (List<FitRankDto>) msg.obj;
				Log.i("tag", "list==="+lists);
				if(lists!=null){
					for (FitRankDto fitRankDto : lists) {
						View view = LayoutInflater.from(getActivity()).inflate(R.layout.view_rank, null);
						TextView nameTv = (TextView)view.findViewById(R.id.view_rank_name_tv);
						nameTv.setText(fitRankDto.getNickname());
						TextView infoTv = (TextView)view.findViewById(R.id.view_rank_info_tv);
						infoTv.setText(fitRankDto.getCalorie()+"千卡");
						layout.addView(view);
					}
				}    
				pd.dismiss();
			}
		}, cityId, gender);
	}
}

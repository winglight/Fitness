package com.sythealth.fitness;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFriendsFragment extends Fragment{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_myfriends, container, false);
		init(view);
		return view;
	}
	private void init(View v){
		
	}
	public static MyFriendsFragment newInstance(){
		MyFriendsFragment fragment = new MyFriendsFragment();
		return fragment;
	}
}

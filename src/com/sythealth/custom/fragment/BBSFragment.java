package com.sythealth.custom.fragment;

import com.sythealth.custom.fragment.FriendsterFragment.Holder;
import com.sythealth.custom.fragment.FriendsterFragment.ListAdapter;
import com.sythealth.fitness.FriendsterShareActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.PostedBBSActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.ShareInfoActivity;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

public class BBSFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_bbs, container,false);
		init(view);
		return view;
	}
	private void init(View v){
		//发帖按钮
		Button postedBtn = (Button)v.findViewById(R.id.fra_bbs_posted_btn);
		postedBtn.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Utils.jumpUI(getActivity(), PostedBBSActivity.class,false, false);
			}
		});
		ListView listView = (ListView)v.findViewById(R.id.fra_bbs_list);
		listView.setDivider(null);
		listView.setAdapter(new ListAdapter());
	}
	public static BBSFragment newInstance(){
		BBSFragment fragment = new BBSFragment();
		return fragment;
	}
	class ListAdapter extends BaseAdapter{
		@Override
		public int getCount() {
			return 20;
		}

		@Override
		public Object getItem(int arg0) {
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			return arg0;
		}

		@Override
		public View getView(int position, View view, ViewGroup arg2) {
			Holder h;
			if(view == null){
				h = new Holder();
				view = LayoutInflater.from(getActivity()).inflate(R.layout.view_list_tiem, null);
				h.iconBtn = (Button)view.findViewById(R.id.view_list_item_icon_btn);
				view.setTag(h);
			}else{
				h = (Holder) view.getTag();
			}
			h.iconBtn.setOnClickListener(new OnClickListener() {			
				@Override
				public void onClick(View v) {
					Utils.jumpUI(getActivity(), ShareInfoActivity.class,false, false);
				}
			});
			return view;
		}		
	}
	static class  Holder{
		Button iconBtn;
	} 
}

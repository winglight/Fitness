package com.sythealth.custom.fragment;

import com.sythealth.fitness.BaseActivity;
import com.sythealth.fitness.FriendsterShareActivity;
import com.sythealth.fitness.PersonalHomeActivity;
import com.sythealth.fitness.R;
import com.sythealth.fitness.ShareInfoActivity;
import com.sythealth.fitness.util.Utils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FriendsterFragment extends Fragment {
	public static final String FRIENDSTERSHARE_TAG = "FriendsterShareFragment";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_friendster, container, false);
		init(view);
		return view;
	}
	private void init(View v){
		ListView listView = (ListView)v.findViewById(R.id.fra_friendster_list);
		listView.setDivider(null);
		listView.setAdapter(new ListAdapter());
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
					Utils.jumpUI(getActivity(), FriendsterShareActivity.class,false, false);
				}
			});
			return view;
		}		
	}
	static class  Holder{
		Button iconBtn;
	} 
	public static FriendsterFragment newInstance(){
		FriendsterFragment fragment = new FriendsterFragment();
		return fragment;
	}
}

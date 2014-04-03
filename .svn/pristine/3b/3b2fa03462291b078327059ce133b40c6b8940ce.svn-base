package com.sythealth.fitness.view;

import java.util.List;

import com.sythealth.fitness.json.Province;

public class ProvinceWheelAdapter implements WheelAdapter{
	private List<Province> provinceModels;
	public ProvinceWheelAdapter(List<Province> provinceModels){
		this.provinceModels = provinceModels;
	}

	@Override
	public int getItemsCount() {
		// TODO Auto-generated method stub
		return provinceModels.size();
	}

	@Override
	public String getItem(int index) {
		// TODO Auto-generated method stub
		return provinceModels.get(index).getNames();
	}

	@Override
	public int getMaximumLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getId(int position){
		return provinceModels.get(position).getId();
		
	}

}

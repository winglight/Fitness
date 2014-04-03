package com.sythealth.fitness.view;

import java.util.List;

import com.sythealth.fitness.json.City;
import com.sythealth.fitness.json.Province;

public class CityWheelAdapter implements WheelAdapter{
	private List<City> cityModels;
	public CityWheelAdapter(List<City> cityModels){
		this.cityModels = cityModels;
	}

	@Override
	public int getItemsCount() {
		// TODO Auto-generated method stub
		return cityModels.size();
	}

	@Override
	public String getItem(int index) {
		// TODO Auto-generated method stub
		return cityModels.get(index).getNames();
	}

	@Override
	public int getMaximumLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getId(int position){
		return cityModels.get(position).getId();
		
	}

}

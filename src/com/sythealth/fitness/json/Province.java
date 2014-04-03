package com.sythealth.fitness.json;

import java.util.List;

public class Province {

	private String id;
	private String names;
	private List<City> item;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public List<City> getItem() {
		return item;
	}
	public void setItem(List<City> item) {
		this.item = item;
	}
	
	
}

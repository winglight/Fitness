package com.sythealth.fitness.db.enumetype;

public enum MedalCategory {

	COUNTSPORT("计数运动"),
	TIMESPORT("计时运动"),
	SHOP("商城");

	private final String displayName;

	MedalCategory(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

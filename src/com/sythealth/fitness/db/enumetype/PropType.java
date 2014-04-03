package com.sythealth.fitness.db.enumetype;

public enum PropType {

	HAT("头饰"),
	CLOTH("衣服"),
	HAIR("发型"),
	SPORT("运动"),
	MENU("菜谱");

	private final String displayName;

	PropType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

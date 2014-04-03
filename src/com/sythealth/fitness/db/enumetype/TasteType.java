package com.sythealth.fitness.db.enumetype;

public enum TasteType {

	SWEET("甜"),
	SPICY("辣"),
	LIGHT("清淡"),
	SOUR("酸");

	private final String displayName;

	TasteType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

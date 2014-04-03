package com.sythealth.fitness.db.enumetype;

public enum BodyType {

	THIN("偏瘦"),
	STANDARD("标准"),
	OVER("超重"),
	FAT("肥胖");

	private final String displayName;

	BodyType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

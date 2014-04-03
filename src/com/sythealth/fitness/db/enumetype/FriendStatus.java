package com.sythealth.fitness.db.enumetype;

public enum FriendStatus {

	INVITED("已邀请"),
	UNHANDLEDINVITE("待处理邀请"),
	CANCELINVITE("已取消邀请"),
	ACCEPTED("已接受"),
	REFUSED("已拒绝"),
	DELETED("已删除");

	private final String displayName;

	FriendStatus(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}

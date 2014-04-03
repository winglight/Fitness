package com.sythealth.fitness.json.user;

public class FitReqmsgDto {
	private String requserid;	// 邀请人ID
	private String type;		// 邀请类型，请求req 拒绝reject 解除release  同意agree
	private String date;		// 邀请日期 yyyy-MM-DD HH:mm:ss
	private String reqmsg;		// 邀请留言
	private String requsername;	// 邀请人昵
	
	public FitReqmsgDto() {
		super();
	}

	public FitReqmsgDto(String requserid, String type, String date,
			String reqmsg, String requsername) {
		super();
		this.requserid = requserid;
		this.type = type;
		this.date = date;
		this.reqmsg = reqmsg;
		this.requsername = requsername;
	}

	public String getRequserid() {
		return requserid;
	}

	public void setRequserid(String requserid) {
		this.requserid = requserid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getReqmsg() {
		return reqmsg;
	}

	public void setReqmsg(String reqmsg) {
		this.reqmsg = reqmsg;
	}

	public String getRequsername() {
		return requsername;
	}

	public void setRequsername(String requsername) {
		this.requsername = requsername;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((reqmsg == null) ? 0 : reqmsg.hashCode());
		result = prime * result
				+ ((requserid == null) ? 0 : requserid.hashCode());
		result = prime * result
				+ ((requsername == null) ? 0 : requsername.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitReqmsgDto other = (FitReqmsgDto) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (reqmsg == null) {
			if (other.reqmsg != null)
				return false;
		} else if (!reqmsg.equals(other.reqmsg))
			return false;
		if (requserid == null) {
			if (other.requserid != null)
				return false;
		} else if (!requserid.equals(other.requserid))
			return false;
		if (requsername == null) {
			if (other.requsername != null)
				return false;
		} else if (!requsername.equals(other.requsername))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FitReqmsgDto [requserid=" + requserid + ", type=" + type
				+ ", date=" + date + ", reqmsg=" + reqmsg + ", requsername="
				+ requsername + "]";
	}
	
}

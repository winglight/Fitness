package com.sythealth.fitness.json.result;

import java.util.Date;

/**
 * 勋章记录dto
 * @author pc_02
 *
 */
public class FitMedalDto {
	public static final String MEDALID_FIELD = "medalid";
	public static final String TIME_FIELD = "time";
	
	String medalid;	//勋章id
	Date time;	//获得时间
	public String getMedalid() {
		return medalid;
	}
	public void setMedalid(String medalid) {
		this.medalid = medalid;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public FitMedalDto(String medalid, Date time) {
		super();
		this.medalid = medalid;
		this.time = time;
	}
	public FitMedalDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitMedalDto [medalid=" + medalid + ", time=" + time + "]";
	}
	
}

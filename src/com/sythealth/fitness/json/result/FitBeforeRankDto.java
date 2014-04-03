package com.sythealth.fitness.json.result;

import java.util.Date;
/**
 * 历史排名dto,用于我的英雄榜显示历史排名
 * @author luhao
 *
 */
public class FitBeforeRankDto {
	public static final String TIME_FIELD = "time";
	public static final String CITYID_FIELD = "cityid";
	public static final String SPORTID_FIELD = "sportid";
	public static final String GROUPS_FIELD = "groups";
	public static final String RANKOFCITY_FIELD = "rankofcity";
	public static final String RANK_FIELD = "rank";
	
	private Date time;//排名日期
	private String cityid;	//城市id 
	private String sportid;	//运动id
	private String groups;		//组别
	private int rankofcity; //同城排名
	private int rank;		//全国排名
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getSportid() {
		return sportid;
	}
	public void setSportid(String sportid) {
		this.sportid = sportid;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getGroups() {
		return groups;
	}
	public void setGroups(String groups) {
		this.groups = groups;
	}
	public int getRankofcity() {
		return rankofcity;
	}
	public void setRankofcity(int rankofcity) {
		this.rankofcity = rankofcity;
	}
	
	public FitBeforeRankDto(Date time, String cityid, String sportid,
			String groups, int rankofcity, int rank) {
		super();		
		this.time = time;
		this.cityid = cityid;
		this.sportid = sportid;
		this.groups = groups;
		this.rankofcity = rankofcity;
		this.rank = rank;
	}
	public FitBeforeRankDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitBeforeRankDto [time=" + time + ", cityid=" + cityid
				+ ", sportid=" + sportid + ", groups=" + groups
				+ ", rankofcity=" + rankofcity + ", rank=" + rank + "]";
	}

	
}

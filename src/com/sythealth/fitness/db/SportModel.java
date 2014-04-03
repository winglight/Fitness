package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "SPORT")
public class SportModel implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 8709093131054832813L;

public static final String FIELD_SERVERID = "SERVERID";
public static final String FIELD_OWNER = "OWNER";
public static final String FIELD_SPORTNAME = "SPORTNAME";
public static final String FIELD_WEEK = "WEEK";
public static final String FIELD_TIME = "TIME";
public static final String FIELD_DURING = "DURING";
public static final String FIELD_ISREPEAT = "ISREPEAT";

	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_SPORTNAME)
	private String sportName;// name
	@DatabaseField(columnName = FIELD_WEEK)
	private int week;// day of week
	@DatabaseField(columnName = FIELD_TIME)
	private String time;// plan begin time
	@DatabaseField(columnName = FIELD_DURING)
	private int during;// plan during time，xx minutes
	@DatabaseField(columnName = FIELD_ISREPEAT)
	private boolean isRepeat;// weekly repeat
	
	public SportModel(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getDuring() {
		return during;
	}
	public void setDuring(int during) {
		this.during = during;
	}
	public boolean isRepeat() {
		return isRepeat;
	}
	public void setRepeat(boolean isRepeat) {
		this.isRepeat = isRepeat;
	}
	
	
}

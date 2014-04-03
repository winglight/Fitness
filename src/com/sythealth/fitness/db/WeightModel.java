package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "WEIGHT")
public class WeightModel implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -6173468082260106125L;
	
public static final String FIELD_SERVERID = "SERVERID";
public static final String FIELD_WEIGHT = "WEIGHT";
public static final String FIELD_CREATEDAT = "CREATEDAT";
public static final String FIELD_OWNER = "OWNER";
	
	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_WEIGHT)
	private Double weight;// weight
	@DatabaseField(columnName = FIELD_CREATEDAT)
	private String createdAt;// what day to record weight， like 2013-05-07
	
	public WeightModel(){
		
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public UserModel getOwner() {
		return owner;
	}
	public void setOwner(UserModel owner) {
		this.owner = owner;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	
}

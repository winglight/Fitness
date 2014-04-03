package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.PropType;

@DatabaseTable(tableName = "PROP")
public class PropModel implements Serializable {

public static final String FIELD_SERVERID = "SERVERID";
public static final String FIELD_OWNER = "OWNER";
public static final String FIELD_PROPNAME = "PROPNAME";
public static final String FIELD_PROPIMAGE = "PROPIMAGE";
public static final String FIELD_PROPTYPE = "PROPTYPE";
public static final String FIELD_VALIDATEND = "VALIDATEND";

	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_PROPNAME)
	private String propName;// name
	@DatabaseField(columnName = FIELD_PROPIMAGE)
	private String propImage;// prop image
	@DatabaseField(columnName = FIELD_PROPTYPE)
	private PropType propType;// type
	@DatabaseField(columnName = FIELD_VALIDATEND)
	private Date validatEnd;// expiration date
	
	public PropModel() {
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
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public String getPropImage() {
		return propImage;
	}
	public void setPropImage(String propImage) {
		this.propImage = propImage;
	}
	public PropType getPropType() {
		return propType;
	}
	public void setPropType(PropType propType) {
		this.propType = propType;
	}
	public Date getValidatEnd() {
		return validatEnd;
	}
	public void setValidatEnd(Date validatEnd) {
		this.validatEnd = validatEnd;
	}
	
	
}

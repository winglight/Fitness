package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.SportType;

@DatabaseTable(tableName = "COUNTSPORT")
public class CountSportModel implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 8709093131054832813L;

public static final String FIELD_SERVERID = "SERVERID";
public static final String FIELD_OWNER = "OWNER";
public static final String FIELD_SPORTNAME = "SPORTNAME";
public static final String FIELD_SPORTIMAGE = "SPORTIMAGE";
public static final String FIELD_SPORTANIM = "SPORTANIM";
public static final String FIELD_TYPE = "TYPE";
public static final String FIELD_ORDER = "ORDER";
public static final String FIELD_COUNT = "COUNT";
public static final String FIELD_STANDARDCALS = "STANDARDCALS";
public static final String FIELD_VALIDATEENDDATE = "VALIDATEENDDATE";

	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_SPORTNAME)
	private String sportName;// name
	@DatabaseField(columnName = FIELD_SPORTIMAGE)
	private String sportImage;// 运动图片
	@DatabaseField(columnName = FIELD_SPORTANIM)
	private String sportAnim;// 运动动画
	@DatabaseField(columnName = FIELD_TYPE)
	private SportType type;// 运动部位
	@DatabaseField(columnName = FIELD_ORDER)
	private int order;// 同一部位运动下的顺序
	@DatabaseField(columnName = FIELD_COUNT)
	private int count;// 建议次数
	@DatabaseField(columnName = FIELD_STANDARDCALS)
	private double standardCals;//标准热量
	@DatabaseField(columnName = FIELD_VALIDATEENDDATE)
	private Date validateEndDate;//有效时间
	
	public CountSportModel(){
		
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

	public UserModel getOwner() {
		return owner;
	}

	public void setOwner(UserModel owner) {
		this.owner = owner;
	}

	public SportType getType() {
		return type;
	}

	public void setType(SportType type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getStandardCals() {
		return standardCals;
	}

	public void setStandardCals(double standardCals) {
		this.standardCals = standardCals;
	}

	public Date getValidateEndDate() {
		return validateEndDate;
	}

	public void setValidateEndDate(Date validateEndDate) {
		this.validateEndDate = validateEndDate;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getSportImage() {
		return sportImage;
	}

	public void setSportImage(String sportImage) {
		this.sportImage = sportImage;
	}

	public String getSportAnim() {
		return sportAnim;
	}

	public void setSportAnim(String sportAnim) {
		this.sportAnim = sportAnim;
	}
	
	
}

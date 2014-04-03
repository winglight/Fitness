package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "LEVEL")
public class LevelModel implements Serializable {

public static final String TAG = "LevelModel";
	
	public static final String FIELD_NAME = "NAME";
	public static final String FIELD_LEVELIMAGE = "LEVELIMAGE";
	public final static String FIELD_SERVER_ID = "SERVER_ID";
	public static final String FIELD_INDEX = "INDEX";
	public static final String FIELD_EXP = "EXP";
	public static final String FIELD_GOLD = "GOLD";
	public static final String FIELD_GOTON = "GOTON";
	public static final String FIELD_ISINFORMED = "ISINFORMED";
	
	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVER_ID)
	private String serverId;// ID of server
	@DatabaseField( columnName = FIELD_NAME)
	private String name;//昵称
	@DatabaseField(columnName = FIELD_LEVELIMAGE)
	private String levelImage;// level image
	@DatabaseField( columnName = FIELD_INDEX)
	private Integer index;//级别：从1开始
	@DatabaseField( columnName = FIELD_EXP)
	private Integer exp;//所需经验
	@DatabaseField( columnName = FIELD_GOLD)
	private Integer gold;//奖励金币
	@DatabaseField(columnName = FIELD_GOTON)
	private Date gotOn;// when got the medal
	@DatabaseField(columnName = FIELD_ISINFORMED)
	private boolean isInformed;// 是否已通知用户
	
	public LevelModel(){
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevelImage() {
		return levelImage;
	}

	public void setLevelImage(String levelImage) {
		this.levelImage = levelImage;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public Date getGotOn() {
		return gotOn;
	}

	public void setGotOn(Date gotOn) {
		this.gotOn = gotOn;
	}

	public boolean isInformed() {
		return isInformed;
	}

	public void setInformed(boolean isInformed) {
		this.isInformed = isInformed;
	}
	
}

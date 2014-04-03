package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.MedalCategory;
import com.sythealth.fitness.db.enumetype.SportType;

@DatabaseTable(tableName = "MEDAL")
public class MedalModel implements Serializable {

	public static final String FIELD_SERVERID = "SERVERID";
	public static final String FIELD_OWNER = "OWNER";
	public static final String FIELD_MEDALNAME = "MEDALNAME";
	public static final String FIELD_CONDITION = "CONDITION";
	public static final String FIELD_MEDALIMAGE = "MEDALIMAGE";
	public static final String FIELD_GOTON = "GOTON";
	public static final String FIELD_ISINFORMED = "ISINFORMED";
	public static final String FIELD_CATEGORY = "CATEGORY";
	public static final String FIELD_TYPE = "TYPE";
	public static final String FIELD_GENDER = "GENDER";
	public static final String FIELD_COUNT = "COUNT";
	public static final String FIELD_PLANCOUNT = "PLANCOUNT";
	public static final String FIELD_GOLD = "GOLD";
	public static final String FIELD_EXPERIENCE = "EXPERIENCE";
	
	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_MEDALNAME)
	private String medalName;// medal name
	@DatabaseField(columnName = FIELD_CONDITION)
	private String condition;// medal condition
	@DatabaseField(columnName = FIELD_MEDALIMAGE)
	private String medalImage;// medal image
	@DatabaseField(columnName = FIELD_GOTON)
	private Date gotOn;// when got the medal
	@DatabaseField(columnName = FIELD_ISINFORMED)
	private boolean isInformed;// 是否已通知用户
	@DatabaseField(columnName = FIELD_CATEGORY)
	private MedalCategory category;// 大类
	@DatabaseField(columnName = FIELD_TYPE)
	private SportType type;// 小类
	@DatabaseField(columnName = FIELD_GENDER)
	private boolean gender;// 用户性别，true 男，false 女
	@DatabaseField(columnName = FIELD_COUNT)
	private int count;// 当前计数数量
	@DatabaseField(columnName = FIELD_PLANCOUNT)
	private int planCount;// 目标计数数量
	@DatabaseField(columnName = FIELD_GOLD)
	private int gold;// 金币
	@DatabaseField(columnName = FIELD_EXPERIENCE)
	private boolean experience;// 奖励经验
	
	public MedalModel(){
		
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
	public String getMedalName() {
		return medalName;
	}
	public void setMedalName(String medalName) {
		this.medalName = medalName;
	}
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getMedalImage() {
		return medalImage;
	}
	public void setMedalImage(String medalImage) {
		this.medalImage = medalImage;
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

	public UserModel getOwner() {
		return owner;
	}

	public void setOwner(UserModel owner) {
		this.owner = owner;
	}

	public MedalCategory getCategory() {
		return category;
	}

	public void setCategory(MedalCategory category) {
		this.category = category;
	}

	public SportType getType() {
		return type;
	}

	public void setType(SportType type) {
		this.type = type;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPlanCount() {
		return planCount;
	}

	public void setPlanCount(int planCount) {
		this.planCount = planCount;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public boolean isExperience() {
		return experience;
	}

	public void setExperience(boolean experience) {
		this.experience = experience;
	}
	
	
}

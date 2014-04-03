package com.sythealth.fitness.db;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import android.util.Log;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.BodyType;
import com.sythealth.fitness.db.enumetype.TasteType;
import com.sythealth.fitness.util.DateUtils;

@DatabaseTable(tableName = "USER")
public class UserModel implements Serializable {

	public static final String TAG = "UserModel";
	
	public static final String FIELD_REFERALID = "REFERALID";
	public static final String FIELD_NICKNAME = "NICKNAME";
	public static final String FIELD_EMAIL = "EMAIL";
	public static final String FIELD_PHONE_NUMBER = "PHONE_NUMBER";
	public final static String FIELD_PASSWORD = "PASSWORD";
	public final static String FIELD_SID = "DEVICE_ID";
	public final static String FIELD_AVAILABLE_LIST = "AVAILABLE";
	public final static String FIELD_SERVER_ID = "SERVER_ID";
	public final static String FIELD_SERVER_CODE = "SERVER_CODE";
	public final static String FIELD_AVATAR = "AVATAR";
	public final static String FIELD_ANIMATION = "ANIMATION";
	public final static String FIELD_GENDER = "GENDER";
	public final static String FIELD_BIRTHDAY = "BIRTHDAY";
	public final static String FIELD_HEIGHT = "HEIGHT";
	public final static String FIELD_CITY = "CITY";
	public final static String FIELD_CITY_ID = "CITY_ID";
	public final static String FIELD_BUST = "BUST";
	public final static String FIELD_HIPS = "HIPS";
	public final static String FIELD_THIGH = "THIGH";
	public final static String FIELD_CALF = "CALF";
	public final static String FIELD_HIPUP = "HIPUP";
	public final static String FIELD_DECLARATION = "DECLARATION";
	public final static String FIELD_IS_PUBLIC_ACHIEVEMENT = "IS_PUBLIC_ACHIEVEMENT";
	public final static String FIELD_TASTE = "TASTE";
	public final static String FIELD_WAIST = "WAIST";
	public final static String FIELD_DISEASE = "DISEASE";
	public final static String FIELD_EXPERIENCE = "EXPERIENCE";
	public final static String FIELD_GOLD = "GOLD";
	public final static String FIELD_GEM = "GEM";
	public final static String FIELD_PLANBEGINDATE = "PLANBEGINDATE";
	public final static String FIELD_PLANENDDATE = "PLANENDDATE";
	public final static String FIELD_PLANBEGINWEIGHT = "PLANBEGINWEIGHT";
	public final static String FIELD_PLANENDWEIGHT = "PLANENDWEIGHT";
	public final static String FIELD_CURRENTWEIGHT = "CURRENTWEIGHT";
	public final static String FIELD_PARTNERID = "PARTNERID";
	public final static String FIELD_PARTNERNAME = "PARTNERNAME";
	public final static String FIELD_PARTNERAVATAR = "PARTNERAVATAR";
	public final static String FIELD_HISTORY = "HISTORY";
	public final static String FIELD_TODAYLOSSFAT = "TODAYLOSSFAT";
	public final static String FIELD_TODAYGOLD = "TODAYGOLD";
	public final static String FIELD_TODAYEXPERIENCE = "TODAYEXPERIENCE";
	public final static String FIELD_TODAYRECORD = "TODAYRECORD";
	public final static String FIELD_TODAYDATE = "TODAYDATE";
	public final static String FIELD_PKTOTALGOLD = "PKTOTALGOLD";
	public final static String FIELD_PKTOPPOSITION = "PKTOPPOSITION";
	public final static String FIELD_PKTOPGROUP = "PKTOPGROUP";
	public final static String FIELD_PKTOPDATE = "PKTOPDATE";
	public final static String FIELD_PKYESTERDAYDETAIL = "PKYESTERDAYDETAIL";
	public final static String FIELD_PKYESTERDAYCALS = "PKYESTERDAYCALS";
	public final static String FIELD_PKYESTERDAYPOSITION = "PKYESTERDAYPOSITION";
	public final static String FIELD_PKTODAYDATE = "PKTODAYDATE";
	public final static String FIELD_PKTODAYDETAIL = "PKTODAYDETAIL";
	public final static String FIELD_PKHISTORY = "PKHISTORY";
	public final static String FIELD_NEWMESSAGECOUNT = "NEWMESSAGECOUNT";
	public final static String FIELD_NEWPARTNERMESSAGECOUNT = "NEWPARTNERMESSAGECOUNT";
	public final static String FIELD_FRIENDLIST = "FRIENDLIST";
	public final static String FIELD_MEDALLIST = "MEDALLIST";
	public final static String FIELD_WEIGHTLIST = "WEIGHTLIST";
	public final static String FIELD_PROPLIST = "PROPLIST";
	public final static String FIELD_DIARYLIST = "DIARYLIST";
	public final static String FIELD_SPORTLIST = "SPORTLIST";
	public final static String FIELD_MESSAGELIST = "MESSAGELIST";
	public final static String FIELD_LEVEL = "LEVEL";
	public final static String FIELD_BODYTYPE = "BODYTYPE";

	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVER_ID)
	private String serverId;// ID of server
	@DatabaseField(columnName = FIELD_SERVER_CODE)
	private String serverCode;// ID of server
	@DatabaseField(columnName = FIELD_REFERALID)
	private String referalId;// ID of invitor
	@DatabaseField( columnName = FIELD_NICKNAME)
	private String nickName;//昵称
	@DatabaseField(columnName = FIELD_EMAIL)
	private String email;
	@DatabaseField(columnName = FIELD_AVATAR)
	private String avatar; //file name of the head photo
	@DatabaseField(columnName = FIELD_ANIMATION)
	private String animation; //file name of the animation
	@DatabaseField(columnName = FIELD_PASSWORD)
	private String password;
	@DatabaseField(columnName = FIELD_SID)
	private String sid;
	@DatabaseField(columnName = FIELD_GENDER)
	private boolean gender; //性别
	@DatabaseField(columnName = FIELD_BIRTHDAY)
	private Date birthday;//年龄
	@DatabaseField(columnName = FIELD_HEIGHT)
	private int height;//身高
	@DatabaseField(columnName = FIELD_CITY)
	private String city;//城市
	@DatabaseField(columnName = FIELD_CITY_ID)
	private String cityId;//城市ID
	@DatabaseField(columnName = FIELD_BUST)
	private int bust;//胸围
	@DatabaseField(columnName = FIELD_WAIST)
	private int waist;//腰围
	@DatabaseField(columnName = FIELD_HIPS)
	private int hips;//臀围
	@DatabaseField(columnName = FIELD_THIGH)
	private int thigh;//大腿围(女)
	@DatabaseField(columnName = FIELD_CALF)
	private int calf;//小腿围(女)
	@DatabaseField(columnName = FIELD_HIPUP)
	private int hipup;//上臀围(女)
	@DatabaseField(columnName = FIELD_DECLARATION)
	private String declaration;//瘦身宣言
	@DatabaseField(columnName = FIELD_IS_PUBLIC_ACHIEVEMENT)
	private boolean isPublicAchievement;//公开战绩
	@DatabaseField(columnName = FIELD_TASTE)
	private TasteType taste;//饮食偏好
	@DatabaseField(columnName = FIELD_DISEASE)
	private String disease;//疾病信息
	@DatabaseField(columnName = FIELD_EXPERIENCE)
	private int experience;//经验值
	@DatabaseField(columnName = FIELD_GOLD)
	private int gold;//金币数
	@DatabaseField(columnName = FIELD_GEM)
	private int gem;//宝石数
	@DatabaseField(columnName = FIELD_PLANBEGINDATE)
	private Date planBeginDate;//计划开始日期
	@DatabaseField(columnName = FIELD_PLANENDDATE)
	private Date planEndDate;//计划结束日期
	@DatabaseField(columnName = FIELD_PLANBEGINWEIGHT)
	private double planBeginWeight;//计划初始体重
	@DatabaseField(columnName = FIELD_PLANENDWEIGHT)
	private double planEndWeight;//计划目标体重
	@DatabaseField(columnName = FIELD_CURRENTWEIGHT)
	private double currentWeight;//当前体重
	@DatabaseField(columnName = FIELD_PARTNERID)
	private String partnerId;//拍档ID
	@DatabaseField(columnName = FIELD_PARTNERNAME)
	private String partnerName;//拍档昵称
	@DatabaseField(columnName = FIELD_PARTNERAVATAR)
	private String partnerAvatar;//拍档头像
	@DatabaseField(columnName = FIELD_NEWMESSAGECOUNT)
	private int newMessageCount;//新消息总数
	@DatabaseField(columnName = FIELD_NEWPARTNERMESSAGECOUNT)
	private int newPartnerMessageCount;//拍档新消息数量
	//当前等级
	@DatabaseField(columnName = FIELD_LEVEL, dataType=DataType.SERIALIZABLE)
		private LevelModel level;
	
	//历史战绩
	@DatabaseField(columnName = FIELD_HISTORY)
	private String history="";//历史记录
	//今日战绩
	@DatabaseField(columnName = FIELD_TODAYLOSSFAT)
	private double todayLossFat;//今日消耗热量(千卡)
	@DatabaseField(columnName = FIELD_TODAYGOLD)
	private int todayGold;//今日获得金币
	@DatabaseField(columnName = FIELD_TODAYEXPERIENCE)
	private int todayExperience;//今日获得经验值
	@DatabaseField(columnName = FIELD_TODAYRECORD)
	private String todayRecord="";//今日运动记录
	@DatabaseField(columnName = FIELD_TODAYDATE)
	private Date todayDate=new Date();//今日战绩日期,如果不是当前日期，则其他今日战绩数据置空
	//PK战绩
	@DatabaseField(columnName = FIELD_PKTOTALGOLD)
	private int pkTotalGold;//累积奖金
	@DatabaseField(columnName = FIELD_PKTOPPOSITION)
	private int pkTopPosition;//最高排名
	@DatabaseField(columnName = FIELD_PKTOPGROUP)
	private String pkTopGroup=""; //最高排名所属组别
	@DatabaseField(columnName = FIELD_PKTOPDATE)
	private String pkTopDate=""; //最高排名获得日期
	@DatabaseField(columnName = FIELD_PKYESTERDAYDETAIL)
	private String pkYesterdayDetail="";//昨日PK成绩
	@DatabaseField(columnName = FIELD_PKYESTERDAYCALS)
	private int pkYesterdayCals;//昨日PK消耗总热量
	@DatabaseField(columnName = FIELD_PKYESTERDAYPOSITION)
	private String pkYesterdayPosition="";//昨日PK排名:全国24568名
	@DatabaseField(columnName = FIELD_PKTODAYDETAIL)
	private String pkTodayDetail = "";//今日PK详情
	@DatabaseField(columnName = FIELD_PKTODAYDATE)
	private Date pkTodayDate=new Date();//今日日期
	@DatabaseField(columnName = FIELD_PKHISTORY)
	private String pkHistory="";//历史成绩
	
	//one-to-many
	@ForeignCollectionField(eager = false)
	private Collection<FriendModel> friendList;//我的好友
	@ForeignCollectionField(eager = false)
	private Collection<MedalModel> medalList;//我当前的勋章
	@ForeignCollectionField(eager = false)
	private Collection<WeightModel> weightList;//我的体重历史记录
	@ForeignCollectionField(eager = false)
	private Collection<PropModel> propList;//我的所有道具
	@ForeignCollectionField(eager = false, orderColumnName=DiaryModel.FIELD_CREATEDAT, orderAscending=false)
	private Collection<DiaryModel> diaryList;//我的日记(含回复)
	@ForeignCollectionField(eager = false)
	private Collection<SportModel> sportList;//个性运动
	@ForeignCollectionField(eager = false)
	private Collection<MessageModel> messageList;//我的消息(系统消息,业务消息,成就消息)
	
	// Non-DB field
	private Double bmi;
	//当前体型
	private BodyType bodyType;
	//标准体重
	private String standardWeight;
	//最美体重(女)
	private double beautyWeight;
	//每日运动消耗热量
	private int dailyOutCals;
	//每日饮食摄入热量
	private int dailyInCals;
	
	private int age;//年龄

	private ObjectMapper mapper = new ObjectMapper();

	public UserModel() {

	}
	
	public void refresh(){
		bmi = 0.0;
		bodyType = null;
		standardWeight = null;
		dailyOutCals = 0;
		dailyInCals = 0;
	}
	
	public void resetToday(){
		todayDate = new Date();
		todayExperience = 0;
		todayGold = 0;
		todayLossFat = 0;
		todayRecord = "";
	}
	
	public void resetYesterdayPK(){
		pkTodayDate = new Date();
		pkYesterdayDetail = new String(pkTodayDetail);
		pkYesterdayDetail = pkYesterdayDetail + "累计消耗：" + pkYesterdayCals + "千卡\n";
		pkYesterdayDetail = pkYesterdayDetail + "\n" + pkYesterdayPosition;
		pkYesterdayCals = 0;
		pkYesterdayPosition = "";
		pkTodayDetail = "";
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

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getReferalId() {
		return referalId;
	}

	public void setReferalId(String referalId) {
		this.referalId = referalId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAnimation() {
		return animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		if(age == 0 && birthday != null){
			Date now = new Date();
			age = DateUtils.subtractDateByYear(birthday, now);
		}
		return age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public int getBust() {
		return bust;
	}

	public void setBust(int bust) {
		this.bust = bust;
	}

	public int getWaist() {
		return waist;
	}

	public void setWaist(int waist) {
		this.waist = waist;
	}

	public int getHips() {
		return hips;
	}

	public void setHips(int hips) {
		this.hips = hips;
	}

	public int getThigh() {
		return thigh;
	}

	public void setThigh(int thigh) {
		this.thigh = thigh;
	}

	public int getCalf() {
		return calf;
	}

	public void setCalf(int calf) {
		this.calf = calf;
	}

	public int getHipup() {
		return hipup;
	}

	public void setHipup(int hipup) {
		this.hipup = hipup;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	public boolean isPublicAchievement() {
		return isPublicAchievement;
	}

	public void setPublicAchievement(boolean isPublicAchievement) {
		this.isPublicAchievement = isPublicAchievement;
	}

	public TasteType getTaste() {
		return taste;
	}

	public void setTaste(TasteType taste) {
		this.taste = taste;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getGem() {
		return gem;
	}

	public void setGem(int gem) {
		this.gem = gem;
	}

	public double getBmi() {
		if(bmi == 0 && height > 0){
			bmi = currentWeight * 10000 / (height*height);
		}
		return bmi;
	}

	public LevelModel getLevel() {
		return level;
	}

	public void setLevel(LevelModel level) {
		this.level = level;
	}

	public BodyType getBodyType() {
		if(bodyType == null && getBmi() > 0){
			if(bmi < 20){
				bodyType = BodyType.THIN;
			}else if(bmi >= 20 && bmi <= 22.6){
				bodyType = BodyType.STANDARD;
			}else if(bmi > 22.6 && bmi <= 30){
				bodyType = BodyType.OVER;
			}else {
				bodyType = BodyType.FAT;
			}
		}
		return bodyType;
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	public Date getPlanBeginDate() {
		return planBeginDate;
	}

	public void setPlanBeginDate(Date planBeginDate) {
		this.planBeginDate = planBeginDate;
	}

	public Date getPlanEndDate() {
		return planEndDate;
	}

	public void setPlanEndDate(Date planEndDate) {
		this.planEndDate = planEndDate;
	}

	public double getPlanBeginWeight() {
		return planBeginWeight;
	}

	public void setPlanBeginWeight(double planBeginWeight) {
		this.planBeginWeight = planBeginWeight;
	}

	public double getPlanEndWeight() {
		return planEndWeight;
	}

	public void setPlanEndWeight(double planEndWeight) {
		this.planEndWeight = planEndWeight;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getPartnerAvatar() {
		return partnerAvatar;
	}

	public void setPartnerAvatar(String partnerAvatar) {
		this.partnerAvatar = partnerAvatar;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public double getTodayLossFat() {
		if(DateUtils.beforeToday(todayDate)){
			resetToday();
		}
		return todayLossFat;
	}

	public void setTodayLossFat(double todayLossFat) {
		this.todayLossFat = todayLossFat;
	}

	public int getTodayGold() {
		if(DateUtils.beforeToday(todayDate)){
			resetToday();
		}
		return todayGold;
	}

	public void setTodayGold(int todayGold) {
		this.todayGold = todayGold;
	}

	public int getTodayExperience() {
		if(DateUtils.beforeToday(todayDate)){
			resetToday();
		}
		return todayExperience;
	}

	public void setTodayExperience(int todayExperience) {
		this.todayExperience = todayExperience;
	}

	public String getTodayRecord() {
		if(DateUtils.beforeToday(todayDate)){
			resetToday();
		}
		return todayRecord;
	}

	public void setTodayRecord(String todayRecord) {
		this.todayRecord = todayRecord;
	}

	public Date getTodayDate() {
		if(DateUtils.beforeToday(todayDate)){
			resetToday();
		}
		return todayDate;
	}

	public void setTodayDate(Date todayDate) {
		this.todayDate = todayDate;
	}

	public int getPkTotalGold() {
		return pkTotalGold;
	}

	public void setPkTotalGold(int pkTotalGold) {
		this.pkTotalGold = pkTotalGold;
	}

	public int getPkTopPosition() {
		return pkTopPosition;
	}

	public void setPkTopPosition(int pkTopPosition) {
		this.pkTopPosition = pkTopPosition;
	}

	public String getPkTopGroup() {
		return pkTopGroup;
	}

	public void setPkTopGroup(String pkTopGroup) {
		this.pkTopGroup = pkTopGroup;
	}

	public String getPkTopDate() {
		return pkTopDate;
	}

	public void setPkTopDate(String pkTopDate) {
		this.pkTopDate = pkTopDate;
	}


	public String getPkYesterdayDetail() {
		if(DateUtils.beforeToday(pkTodayDate)){
			resetYesterdayPK();
		}
		return pkYesterdayDetail;
	}

	public void setPkYesterdayDetail(String pkYesterdayDetail) {
		this.pkYesterdayDetail = pkYesterdayDetail;
	}

	public int getPkYesterdayCals() {
		if(DateUtils.beforeToday(pkTodayDate)){
			resetYesterdayPK();
		}
		return pkYesterdayCals;
	}

	public void setPkYesterdayCals(int pkYesterdayCals) {
		this.pkYesterdayCals = pkYesterdayCals;
	}

	public String getPkYesterdayPosition() {
		if(DateUtils.beforeToday(pkTodayDate)){
			resetYesterdayPK();
		}
		return pkYesterdayPosition;
	}

	public void setPkYesterdayPosition(String pkYesterdayPosition) {
		this.pkYesterdayPosition = pkYesterdayPosition;
	}

	public String getPkTodayDetail() {
		if(DateUtils.beforeToday(pkTodayDate)){
			resetYesterdayPK();
		}
		return pkTodayDetail;
	}

	public void setPkTodayDetail(String pkTodayDetail) {
		this.pkTodayDetail = pkTodayDetail;
	}

	public Date getPkTodayDate() {
		if(DateUtils.beforeToday(pkTodayDate)){
			resetYesterdayPK();
		}
		return pkTodayDate;
	}

	public void setPkTodayDate(Date pkTodayDate) {
		this.pkTodayDate = pkTodayDate;
	}

	public String getPkHistory() {
		return pkHistory;
	}

	public void setPkHistory(String pkHistory) {
		this.pkHistory = pkHistory;
	}

	public Collection<FriendModel> getFriendList() {
		return friendList;
	}

	public void setFriendList(Collection<FriendModel> friendList) {
		this.friendList = friendList;
	}

	public Collection<MedalModel> getMedalList() {
		return medalList;
	}

	public void setMedalList(Collection<MedalModel> medalList) {
		this.medalList = medalList;
	}


	public Collection<WeightModel> getWeightList() {
		return weightList;
	}

	public void setWeightList(Collection<WeightModel> weightList) {
		this.weightList = weightList;
	}

	public Collection<PropModel> getPropList() {
		return propList;
	}

	public void setPropList(Collection<PropModel> propList) {
		this.propList = propList;
	}

	public Collection<DiaryModel> getDiaryList() {
		return diaryList;
	}

	public void setDiaryList(Collection<DiaryModel> diaryList) {
		this.diaryList = diaryList;
	}

	public Collection<SportModel> getSportList() {
		return sportList;
	}

	public void setSportList(Collection<SportModel> sportList) {
		this.sportList = sportList;
	}

	public Collection<MessageModel> getMessageList() {
		return messageList;
	}

	public void setMessageList(Collection<MessageModel> messageList) {
		this.messageList = messageList;
	}

	public String getStandardWeight() {
		if(standardWeight == null){
			standardWeight = Integer.valueOf(20*(height*height)/10000) + "~" + Integer.valueOf(226*(height*height)/100000);
		}
		return standardWeight;
	}

	public double getBeautyWeight() {
		if(beautyWeight < 1){
			beautyWeight = (height-150)*0.452+43.2;
		}
		return beautyWeight;
	}

	public int getDailyOutCals() {
		return dailyOutCals;
	}

	public void setDailyOutCals(int dailyOutCals) {
		this.dailyOutCals = dailyOutCals;
	}

	public int getDailyInCals() {
		return dailyInCals;
	}

	public void setDailyInCals(int dailyInCals) {
		this.dailyInCals = dailyInCals;
	}

	public int getNewMessageCount() {
		return newMessageCount;
	}

	public void setNewMessageCount(int newMessageCount) {
		this.newMessageCount = newMessageCount;
	}

	public int getNewPartnerMessageCount() {
		return newPartnerMessageCount;
	}

	public void setNewPartnerMessageCount(int newPartnerMessageCount) {
		this.newPartnerMessageCount = newPartnerMessageCount;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


}

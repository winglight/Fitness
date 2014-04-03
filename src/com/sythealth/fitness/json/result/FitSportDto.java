package com.sythealth.fitness.json.result;

import java.util.Date;

/**
 * 运动记录dto
 * @author luhao
 *
 */
public class FitSportDto {
	public static final String TYPE_FIELD = "type";
	public static final String SPORTID_FIELD = "sportid";
	public static final String COIN_FIELD = "coin";
	public static final String CALORIETID_FIELD = "calorie";
	public static final String EXP_FIELD = "exp";
	public static final String CREATETIME_FIELD = "createtime";

	int type;			//运动类型 0=个人,1=全国
	String sportid;		//运动id
	int coin;			//获得金币
	int calorie;		//消耗卡路里
	int exp;			//获得经验
	Date createtime;	//时间
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSportid() {
		return sportid;
	}
	public void setSportid(String sportid) {
		this.sportid = sportid;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public static String getSportidField() {
		return SPORTID_FIELD;
	}
	public FitSportDto(int type, String sportid, int coin, int calorie,
			int exp, Date createtime) {
		super();
		this.type = type;
		this.sportid = sportid;
		this.coin = coin;
		this.calorie = calorie;
		this.exp = exp;
		this.createtime = createtime;
	}
	public FitSportDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitSportDto [type=" + type + ", sportid=" + sportid + ", coin="
				+ coin + ", calorie=" + calorie + ", exp=" + exp
				+ ", createtime=" + createtime + "]";
	}
	
	
}

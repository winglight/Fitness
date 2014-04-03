package com.sythealth.fitness.json.result;

import java.util.List;

/**
 * 战绩记录dto
 * @author pc_02
 *
 */
public class FitWardataDto {
	
	public static final String COIN_FIELD = "coin";
	public static final String WIGHT_FIELD = "weight";
	public static final String EXP_FIELD = "exp";
	public static final String CALORIE_FIELD = "calorie";
	public static final String SPORTLOG_FIELD = "sportlog";

	
	private int coin;		//当天金币
	private int weight;		//当天减去体重
	private int exp;		//当天获得经验
	private int calorie;	//当天减去热量
	private String sportlog;
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public FitWardataDto() {
		super();
	}
	public String getSportlog() {
		return sportlog;
	}
	public void setSportlog(String sportlog) {
		this.sportlog = sportlog;
	}
	public FitWardataDto(int coin, int weight, int exp, int calorie,
			String sportlog) {
		super();
		this.coin = coin;
		this.weight = weight;
		this.exp = exp;
		this.calorie = calorie;
		this.sportlog = sportlog;
	}
	@Override
	public String toString() {
		return "FitWardataDto [coin=" + coin + ", weight=" + weight + ", exp="
				+ exp + ", calorie=" + calorie + ", sportlog=" + sportlog
				+ "]";
	}
	
}

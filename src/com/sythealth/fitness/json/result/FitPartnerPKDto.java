package com.sythealth.fitness.json.result;
/**
 * 和拍档pk数据dto
 * @author pc_02
 *
 */
public class FitPartnerPKDto {
	public static final String WEIGHT_FIELD = "weight";
	public static final String COIN_FIELD = "coins";
	String weight;		//体重
	String coins;		//金币
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCoins() {
		return coins;
	}
	public void setCoins(String coins) {
		this.coins = coins;
	}
	public FitPartnerPKDto(String weight, String coins) {
		super();
		this.weight = weight;
		this.coins = coins;
	}
	public FitPartnerPKDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitPartnerPKDto [weight=" + weight + ", coins=" + coins
				+ "]";
	}
	
	
}

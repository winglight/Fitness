package com.sythealth.fitness.json.result;

/**
 * 记录体重dto
 * @author luhao
 *
 */
public class FitWeightDto {

	public static final String DATE_FIELD = "date";
	public static final String WEIGHT_FIELD = "weight";
	
	String date;			//记录日期
	double weight;			//体重
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public FitWeightDto(String date, double weight) {
		super();
		this.date = date;
		this.weight = weight;
	}
	public FitWeightDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitWeightDto [date=" + date + ", weight=" + weight + "]";
	}
	
}

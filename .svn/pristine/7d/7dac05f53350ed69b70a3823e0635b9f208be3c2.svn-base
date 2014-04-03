package com.sythealth.fitness.json.result;

import java.util.Date;
import java.util.List;
/**
 * 朋友战绩记录dto
 * @author luhao
 *
 */
public class FitFriendWardataDto {

	public static final String TOPWEIGHTDATE_FIELD = "topweightdate";
	public static final String TOTALWEIGHT_FIELD = "totalweight";
	public static final String CURRENTWEIGHT_FIELD = "currentweight";
	public static final String CURRENTPLANWEIGHT_FIELD = "currentplanweight";
	public static final String LOG_FIELD = "log";
	public static final String HEIGHT_FIELD = "height";
	public static final String WEIGHT_FIELD = "weight";
	
	private Date topweightdate;//最新体重记录日期
	private double totalweight;//累计瘦身数
	private double currentweight;//本期瘦身数
	private double currentplanweight;//本期计划瘦身数
	private int height;//身高
	private String log;//事件记录
	private List<FitWeightDto> weight;//体重记录List
	public Date getTopweightdate() {
		return topweightdate;
	}
	public void setTopweightdate(Date topweightdate) {
		this.topweightdate = topweightdate;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public List<FitWeightDto> getWeight() {
		return weight;
	}
	public void setWeight(List<FitWeightDto> weight) {
		this.weight = weight;
	}
	public double getTotalweight() {
		return totalweight;
	}
	public void setTotalweight(double totalweight) {
		this.totalweight = totalweight;
	}
	public double getCurrentweight() {
		return currentweight;
	}
	public void setCurrentweight(double currentweight) {
		this.currentweight = currentweight;
	}
	public double getCurrentplanweight() {
		return currentplanweight;
	}
	public void setCurrentplanweight(double currentplanweight) {
		this.currentplanweight = currentplanweight;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public FitFriendWardataDto(Date topweightdate, double totalweight,
			double currentweight, double currentplanweight, int height,
			String log, List<FitWeightDto> weight) {
		super();
		this.topweightdate = topweightdate;
		this.totalweight = totalweight;
		this.currentweight = currentweight;
		this.currentplanweight = currentplanweight;
		this.height = height;
		this.log = log;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "FitFriendWardataDto [topweightdate=" + topweightdate
				+ ", totalweight=" + totalweight + ", currentweight="
				+ currentweight + ", currentplanweight=" + currentplanweight
				+ ", height=" + height + ", log=" + log + ", weight=" + weight + "]";
	}
	public FitFriendWardataDto() {
		super();
	}
	
}

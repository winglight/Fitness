package com.sythealth.fitness.json.result;
/**
 * 全部排名dto
 * @author luhao
 *
 */
public class FitRankDto {
	public static final String CALORIE_FIELD = "calorie";
	public static final String NICKNAME_FIELD = "nickname";
	public static final String PIC_FIELD = "pic";
	public static final String RANK_FIELD = "rank";
	int calorie;		//热量
	String nickname;	//昵称
	String pic;			//	头像
	int rank;			//排名名次
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public FitRankDto(int calorie, String nickname, String pic, int rank) {
		super();
		this.calorie = calorie;
		this.nickname = nickname;
		this.pic = pic;
		this.rank = rank;
	}
	public FitRankDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitRankDto [calorie=" + calorie + ", nickname=" + nickname
				+ ", pic=" + pic + ", rank=" + rank + "]";
	}
	
}

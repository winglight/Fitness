package com.sythealth.fitness.json.user;

import java.util.List;

import com.sythealth.fitness.json.shopping.FitDressDto;


/**
 * 用户主页信息
 * 
 * @author tom
 *
 */
public class FitUserDataDto {
	private int codeid;				// 类似ID的字段列，用于邀请用户时作ID用
	private String userid;			// 用户ID
	private String sex;				// 性别
	private String nickname;		// 昵称
	private int age;				// 年龄
	private String pic;				// 图像URL
	private int exp;				// 积分
	private int coin;				// 金币
	private int gem; 				// 钻石
	private String declaration;		//个性签名(宣言)
	private String level;			// 用户等级
	private List<String> medals;	// 勋章id集合
	private List<FitDressDto> dress;// 装扮
	private int pkcoin;				// pk奖金
	private String totalfit;		// 累计瘦身
	private String city;			// 所在城市ID
	
	public FitUserDataDto() {
		super();
	}

	public FitUserDataDto(int codeid, String userid, String sex,
			String nickname, int age, String pic, int exp, int coin, int gem,
			String declaration, String level, List<String> medals,
			List<FitDressDto> dress, int pkcoin, String totalfit, String city) {
		super();
		this.codeid = codeid;
		this.userid = userid;
		this.sex = sex;
		this.nickname = nickname;
		this.age = age;
		this.pic = pic;
		this.exp = exp;
		this.coin = coin;
		this.gem = gem;
		this.declaration = declaration;
		this.level = level;
		this.medals = medals;
		this.dress = dress;
		this.pkcoin = pkcoin;
		this.totalfit = totalfit;
		this.city = city;
	}

	public int getCodeid() {
		return codeid;
	}

	public void setCodeid(int codeid) {
		this.codeid = codeid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getGem() {
		return gem;
	}

	public void setGem(int gem) {
		this.gem = gem;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<String> getMedals() {
		return medals;
	}

	public void setMedals(List<String> medals) {
		this.medals = medals;
	}

	public List<FitDressDto> getDress() {
		return dress;
	}

	public void setDress(List<FitDressDto> dress) {
		this.dress = dress;
	}

	public int getPkcoin() {
		return pkcoin;
	}

	public void setPkcoin(int pkcoin) {
		this.pkcoin = pkcoin;
	}

	public String getTotalfit() {
		return totalfit;
	}

	public void setTotalfit(String totalfit) {
		this.totalfit = totalfit;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + codeid;
		result = prime * result + coin;
		result = prime * result
				+ ((declaration == null) ? 0 : declaration.hashCode());
		result = prime * result + ((dress == null) ? 0 : dress.hashCode());
		result = prime * result + exp;
		result = prime * result + gem;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((medals == null) ? 0 : medals.hashCode());
		result = prime * result
				+ ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + pkcoin;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((totalfit == null) ? 0 : totalfit.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitUserDataDto other = (FitUserDataDto) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (codeid != other.codeid)
			return false;
		if (coin != other.coin)
			return false;
		if (declaration == null) {
			if (other.declaration != null)
				return false;
		} else if (!declaration.equals(other.declaration))
			return false;
		if (dress == null) {
			if (other.dress != null)
				return false;
		} else if (!dress.equals(other.dress))
			return false;
		if (exp != other.exp)
			return false;
		if (gem != other.gem)
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (medals == null) {
			if (other.medals != null)
				return false;
		} else if (!medals.equals(other.medals))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (pkcoin != other.pkcoin)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (totalfit == null) {
			if (other.totalfit != null)
				return false;
		} else if (!totalfit.equals(other.totalfit))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FitUserDataDto [codeid=" + codeid + ", userid=" + userid
				+ ", sex=" + sex + ", nickname=" + nickname + ", age=" + age
				+ ", pic=" + pic + ", exp=" + exp + ", coin=" + coin + ", gem="
				+ gem + ", declaration=" + declaration + ", level=" + level
				+ ", medals=" + medals + ", dress=" + dress + ", pkcoin="
				+ pkcoin + ", totalfit=" + totalfit + ", city=" + city + "]";
	}
	
}

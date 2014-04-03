package com.sythealth.fitness.json.user;

/**
 * 好友列表信息{UserListDto}
 * 
 * @author tom
 *
 */
public class FitUserListDto {
	private String userid;	// 用户id
	private String nickname;// 用户昵称
	private String sex;		// 用户性别
	private String pic;		// 用户头像
	private int age;		// 用户年龄
	private String declaration;	// 用户宣言
	private int codeid;		// 用户代号
	
	public FitUserListDto() {
		super();
	}

	public FitUserListDto(String userid, String nickname, String sex,
			String pic, int age, String declaration, int codeid) {
		super();
		this.userid = userid;
		this.nickname = nickname;
		this.sex = sex;
		this.pic = pic;
		this.age = age;
		this.declaration = declaration;
		this.codeid = codeid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	public int getCodeid() {
		return codeid;
	}

	public void setCodeid(int codeid) {
		this.codeid = codeid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + codeid;
		result = prime * result
				+ ((declaration == null) ? 0 : declaration.hashCode());
		result = prime * result
				+ ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		FitUserListDto other = (FitUserListDto) obj;
		if (age != other.age)
			return false;
		if (codeid != other.codeid)
			return false;
		if (declaration == null) {
			if (other.declaration != null)
				return false;
		} else if (!declaration.equals(other.declaration))
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
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
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
		return "FitUserListDto [userid=" + userid + ", nickname=" + nickname
				+ ", sex=" + sex + ", pic=" + pic + ", age=" + age
				+ ", declaration=" + declaration + ", codeid=" + codeid + "]";
	}

}

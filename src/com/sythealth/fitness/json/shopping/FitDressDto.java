package com.sythealth.fitness.json.shopping;

import java.util.Date;

/**
 * 我的装扮Dto
 */
@SuppressWarnings("serial")
public class FitDressDto {

	private String id;	
	private String goodsname;		//商品名称
	private String userid;			//用户ID
	private Date valid;				//有效期时间
	private int flag;				//0：仓库， 1：当前装扮
	private String mlid;			//父id(上一级目录ID)
	private String pic;				//图片
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	public Date getValid() {
		return valid;
	}

	public void setValid(Date valid) {
		this.valid = valid;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getMlid() {
		return mlid;
	}

	public void setMlid(String mlid) {
		this.mlid = mlid;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	
}

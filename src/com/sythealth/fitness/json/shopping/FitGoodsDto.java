package com.sythealth.fitness.json.shopping;

import java.util.Date;

/**
 * 商品清单
 */
@SuppressWarnings("serial")
public class FitGoodsDto {
	
	
	private String id;
	private String name; 		//商品名称
	private String pic;			//图片
	private String mlid;		//父ID（上一级商品目录ID）
	private int coin;			//金币
	private int gem;			//宝石
	private String context;		//简介
	private int unitrmb;		//单价(RMB)
	private int price;			//优惠价
	private Date valid;			//有效期时间

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPic() {
		return pic;
	}



	public void setPic(String pic) {
		this.pic = pic;
	}



	public String getMlid() {
		return mlid;
	}



	public void setMlid(String mlid) {
		this.mlid = mlid;
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



	public String getContext() {
		return context;
	}



	public void setContext(String context) {
		this.context = context;
	}



	public int getUnitrmb() {
		return unitrmb;
	}



	public void setUnitrmb(int unitrmb) {
		this.unitrmb = unitrmb;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Date getValid() {
		return valid;
	}



	public void setValid(Date valid) {
		this.valid = valid;
	}



	public FitGoodsDto(String id, String name, String pic, String mlid, int coin, int gem,
			String context, int unitrmb, int price, Date valid) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.mlid = mlid;
		this.coin = coin;
		this.gem = gem;
		this.context = context;
		this.unitrmb = unitrmb;
		this.price = price;
		this.valid = valid;
	}



	public FitGoodsDto() {
		super();
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

	
}

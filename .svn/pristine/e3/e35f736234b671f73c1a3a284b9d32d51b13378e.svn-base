package com.sythealth.fitness.json.user;

/**
 * 用户宝石数
 * 
 * @author tom
 *
 */
public class FitUserGemDto {
	private int gem; 				// 钻石

	public FitUserGemDto() {
		super();
	}

	public FitUserGemDto(int gem) {
		super();
		this.gem = gem;
	}

	public int getGem() {
		return gem;
	}

	public void setGem(int gem) {
		this.gem = gem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gem;
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
		FitUserGemDto other = (FitUserGemDto) obj;
		if (gem != other.gem)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FitUserGemDto [gem=" + gem + "]";
	}
	
	
}

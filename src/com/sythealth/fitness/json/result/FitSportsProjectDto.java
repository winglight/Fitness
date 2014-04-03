package com.sythealth.fitness.json.result;


/**
 * 比赛项目dto
 * @author luhao
 *
 */
public class FitSportsProjectDto {
	public static final String ID_FIELD = "id";
	public static final String NAME_FIELD = "name";
	
	String id;	//比赛项目id
	String name;	//比赛项目名称
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FitSportsProjectDto(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public FitSportsProjectDto() {
		super();
	}
	@Override
	public String toString() {
		return "FitSportsProjectDto [id=" + id + ", name=" + name + "]";
	}

	
	
}

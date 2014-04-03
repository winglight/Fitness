package com.sythealth.fitness.json.community;

import java.util.List;

public class FitFriendCircleDto {

	private String forumid;			//id
	private String name;			//发帖人昵称
	private String context;			//帖子内容
	private String pic;				//发帖人头像
	private List<String> img;				//帖子图片
	private String createuserid;	//发帖人ID
	private String createtime;		//发帖时间
	

	public FitFriendCircleDto() {
		super();
	}
	
	public FitFriendCircleDto(String forumid, String name, String context, String pic,
			List<String> img, String createuserid, String createtime) {
		super();
		this.forumid = forumid;
		this.name = name;
		this.context = context;
		this.pic = pic;
		this.img = img;
		this.createuserid = createuserid;
		this.createtime = createtime;
	}
	
	public String getForumid() {
		return forumid;
	}



	public void setForumid(String forumid) {
		this.forumid = forumid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public List<String> getImg() {
		return img;
	}
	public void setImg(List<String> img) {
		this.img = img;
	}
	public String getCreateuserid() {
		return createuserid;
	}
	public void setCreateuserid(String createuserid) {
		this.createuserid = createuserid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
 	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result
				+ ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result
				+ ((createuserid == null) ? 0 : createuserid.hashCode());
		result = prime * result + ((forumid == null) ? 0 : forumid.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
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
		final FitFriendCircleDto other = (FitFriendCircleDto) obj;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (createuserid == null) {
			if (other.createuserid != null)
				return false;
		} else if (!createuserid.equals(other.createuserid))
			return false;
		if (forumid == null) {
			if (other.forumid != null)
				return false;
		} else if (!forumid.equals(other.forumid))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		return true;
	}

	
}

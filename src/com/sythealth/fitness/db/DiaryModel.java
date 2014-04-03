package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DIARY")
public class DiaryModel implements Serializable {

	public static final String FIELD_SERVERID = "SERVERID";
	public static final String FIELD_OWNER = "OWNER";
	public static final String FIELD_TEXTCONTENT = "TEXTCONTENT";
	public static final String FIELD_IMAGES = "IMAGES";
	public static final String FIELD_CREATEDAT = "CREATEDAT";
	public static final String FIELD_ISPUBLIC = "ISPUBLIC";
	
	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_TEXTCONTENT)
	private String textContent;// text content
	@DatabaseField(columnName = FIELD_IMAGES)
	private String images;// images
	@DatabaseField(columnName = FIELD_CREATEDAT)
	private Date createdAt;// when wrote the diary
	@DatabaseField(columnName = FIELD_ISPUBLIC)
	private boolean isPublic;// public or private
	
	public DiaryModel(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getTextContent() {
		return textContent;
	}
	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public UserModel getOwner() {
		return owner;
	}

	public void setOwner(UserModel owner) {
		this.owner = owner;
	}
	
	
}

package com.sythealth.fitness.db;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.MessageType;

@DatabaseTable(tableName = "MESSAGE")
public class MessageModel implements Serializable {

public static final String FIELD_SERVERID = "SERVERID";
public static final String FIELD_OWNER = "OWNER";
public static final String FIELD_MESSAGETYPE = "MESSAGETYPE";
public static final String FIELD_MESSAGEBODY = "MESSAGEBODY";

	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(columnName = FIELD_SERVERID)
	private String serverId;// ID of server
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_MESSAGETYPE)
	private MessageType messageType;// message type
	@DatabaseField(columnName = FIELD_MESSAGEBODY)
	private String messageBody;// message body, JSON format
	
	public MessageModel(){
		
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
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	
	
}

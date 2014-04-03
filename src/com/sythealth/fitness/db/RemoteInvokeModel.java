package com.sythealth.fitness.db;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sythealth.fitness.db.enumetype.RemoteInvokeStatus;
import com.sythealth.fitness.db.enumetype.RemoteRequestAction;

@DatabaseTable(tableName = "REMOTEINVOKE")
public class RemoteInvokeModel implements Serializable {

	public static final String FIELD_ACTION = "ACTION";
	public static final String FIELD_URL= "URL";
	public static final String FIELD_REQUEST_BODY = "REQUEST_BODY";
	public static final String FIELD_RESPONSE_BODY = "RESPONSE_BODY";
	public static final String FIELD_PLAN_AT = "PLAN_AT";
	public static final String FIELD_FINISHED_AT = "FINISHED_AT";
	public static final String FIELD_STATUS = "STATUS";
	public static final String FIELD_MESSAGE = "MESSAGE";
	public static final String FIELD_OWNER = "OWNER";
	
	@DatabaseField(generatedId = true)
	private long id = -1;
	@DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = FIELD_OWNER)
	private UserModel owner;
	@DatabaseField(columnName = FIELD_ACTION)
	private RemoteRequestAction action;// POST or GET
	@DatabaseField(columnName = FIELD_URL)
	private String url;// complete request url
	@DatabaseField(columnName = FIELD_REQUEST_BODY)
	private String requestBody;// request body
	@DatabaseField(columnName = FIELD_RESPONSE_BODY)
	private String responseBody;// response body
	@DatabaseField(columnName = FIELD_PLAN_AT)
	private Date planAt;// when wrote the diary
	@DatabaseField(columnName = FIELD_FINISHED_AT)
	private Date finisheddAt;// when wrote the diary
	@DatabaseField(columnName = FIELD_STATUS)
	private RemoteInvokeStatus status;// invoke status
	@DatabaseField(columnName = FIELD_MESSAGE)
	private String message;// error message
	
	public RemoteInvokeModel(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public RemoteRequestAction getAction() {
		return action;
	}
	public void setAction(RemoteRequestAction action) {
		this.action = action;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public Date getPlanAt() {
		return planAt;
	}
	public void setPlanAt(Date planAt) {
		this.planAt = planAt;
	}
	public Date getFinisheddAt() {
		return finisheddAt;
	}
	public void setFinisheddAt(Date finisheddAt) {
		this.finisheddAt = finisheddAt;
	}
	public RemoteInvokeStatus getStatus() {
		return status;
	}
	public void setStatus(RemoteInvokeStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}

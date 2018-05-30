package com.entity;

import java.util.Date;
import java.util.UUID;

import org.springframework.util.StringUtils;

public class OaNotifyRecord {
    private String id;

    private String oaNotifyId;

    private String userId;

    private String readFlag;

    private Date readDate;

    public String getId() {
    	if(StringUtils.isEmpty(id)){
    		id=UUID.randomUUID().toString().replace("-", "");
    	}
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOaNotifyId() {
        return oaNotifyId;
    }

    public void setOaNotifyId(String oaNotifyId) {
        this.oaNotifyId = oaNotifyId == null ? null : oaNotifyId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag == null ? null : readFlag.trim();
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }
}
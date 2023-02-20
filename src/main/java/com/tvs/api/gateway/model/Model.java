package com.tvs.api.gateway.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class Model {
    @NotNull
    @JsonProperty("mit")
    private long mit;
    @NotNull
    private String requestID;
    @NotNull
    private String senderChannel;
    @NotNull
    private DeviceInfo deviceInfo;
    @NotNull
    private ApplicationInfo applicationInfo;
    @NotNull
    private String requestTime;
    @NotNull
    private String sessionId;
    @NotNull
    private String requestBody;
    @NotNull
    private String macIn;

    public Model() {
    }

    public long getMit() {
        return mit;
    }

    public void setMit(long mit) {
        this.mit = mit;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getSenderChannel() {
        return senderChannel;
    }

    public void setSenderChannel(String senderChannel) {
        this.senderChannel = senderChannel;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getMacIn() {
        return macIn;
    }

    public void setMacIn(String macIn) {
        this.macIn = macIn;
    }
}

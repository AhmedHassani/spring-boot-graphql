package com.tvs.api.gateway.model;



public class Resopnse {
   private String requestID;
   private String responseTime;
   private String responseCode;
   private String responseDesc;
   private String responseBody;

    public Resopnse(String requestID, String responseTime, String responseCode, String responseDesc, String responseBody) {
        this.requestID = requestID;
        this.responseTime = responseTime;
        this.responseCode = responseCode;
        this.responseDesc = responseDesc;
        this.responseBody = responseBody;
    }

    public Resopnse() {
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}

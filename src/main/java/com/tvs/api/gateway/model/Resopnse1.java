package com.tvs.api.gateway.model;

public class Resopnse1 extends  Resopnse{
    private  String mac_out;

    public Resopnse1(String requestID, String responseTime, String responseCode, String responseDesc, String responseBody, String mac_out) {
        super(requestID, responseTime, responseCode, responseDesc, responseBody);
        this.mac_out = mac_out;
    }

    public String getMac_out() {
        return mac_out;
    }

    public void setMac_out(String mac_out) {
        this.mac_out = mac_out;
    }
}

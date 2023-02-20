package com.tvs.api.gateway.model;

public class DeviceInfo {
    private String  deviceID;
    private String operatingSystem;

    public DeviceInfo() {

    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

package com.lwx.map;

/**
 * Created by lwx on 2015/11/30.
 */
public class WifiInfo {
    private String bssid, ssid, security;
    private int signal;
    public WifiInfo(String bssid, String ssid, String security, int signal){
        this.bssid = bssid;
        this.ssid = ssid;
        this.security = security;
        this.signal = signal;
    }
    public String getBssid(){
        return bssid;
    }
    public String getSsid(){
        return ssid;
    }
    public String getSecurity(){
        return security;
    }
    public int getSignal(){
        return signal;
    }
}

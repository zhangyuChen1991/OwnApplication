package com.sz.china.testmoudule.bean;

/**
 * Created by zhangyu on 2016/10/17.
 */
public class WifiInfoBean {
    private String ssid;
    private String password;
    private int ip;

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "WifiInfoBean{" +
                "ssid='" + ssid + '\'' +
                ", password='" + password + '\'' +
                ", ip=" + ip +
                '}';
    }
}

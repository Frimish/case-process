package com.bm.process.pojo;

public class Aj2013Akmemo {
    private String akmemoGuid;

    private String tjbh;

    private String akmemo;

    private String bmsah;

    public String getAkmemoGuid() {
        return akmemoGuid;
    }

    public void setAkmemoGuid(String akmemoGuid) {
        this.akmemoGuid = akmemoGuid == null ? null : akmemoGuid.trim();
    }

    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh == null ? null : tjbh.trim();
    }

    public String getAkmemo() {
        return akmemo;
    }

    public void setAkmemo(String akmemo) {
        this.akmemo = akmemo == null ? null : akmemo.trim();
    }

    public String getBmsah() {
        return bmsah;
    }

    public void setBmsah(String bmsah) {
        this.bmsah = bmsah == null ? null : bmsah.trim();
    }
}
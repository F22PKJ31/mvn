package com.sac.pojo;

public class SacAdmin {
    private Integer adminId;

    private String adminUn;

    private String adminPsw;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUn() {
        return adminUn;
    }

    public void setAdminUn(String adminUn) {
        this.adminUn = adminUn == null ? null : adminUn.trim();
    }

    public String getAdminPsw() {
        return adminPsw;
    }

    public void setAdminPsw(String adminPsw) {
        this.adminPsw = adminPsw == null ? null : adminPsw.trim();
    }
}
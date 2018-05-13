package com.sac.pojo;

public class SacCooperation {
    private Integer cooperationid;

    private Integer schoolid;

    private String companyname;

    public Integer getCooperationid() {
        return cooperationid;
    }

    public void setCooperationid(Integer cooperationid) {
        this.cooperationid = cooperationid;
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }
}
package com.sac.pojo;

public class SacSchool {
    private Integer schoolid;

    private String schoolname;

    private String schooldesc;

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    public String getSchooldesc() {
        return schooldesc;
    }

    public void setSchooldesc(String schooldesc) {
        this.schooldesc = schooldesc == null ? null : schooldesc.trim();
    }
}
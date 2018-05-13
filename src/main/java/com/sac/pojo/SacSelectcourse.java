package com.sac.pojo;

import java.util.Date;

public class SacSelectcourse {
    private Integer selectid;

    private Integer courseid;

    private Integer stuid;

    private Date selecttime;

    public Integer getSelectid() {
        return selectid;
    }

    public void setSelectid(Integer selectid) {
        this.selectid = selectid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Date getSelecttime() {
        return selecttime;
    }

    public void setSelecttime(Date selecttime) {
        this.selecttime = selecttime;
    }
}
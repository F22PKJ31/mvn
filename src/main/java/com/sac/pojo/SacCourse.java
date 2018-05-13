package com.sac.pojo;

public class SacCourse {
    private Integer courseid;

    private String coursename;

    private String courseteacher;

    private String coursemajor;

    private String coursedesc;

    private Integer ishome;

    private String coursepic;

    private String homepic;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCourseteacher() {
        return courseteacher;
    }

    public void setCourseteacher(String courseteacher) {
        this.courseteacher = courseteacher == null ? null : courseteacher.trim();
    }

    public String getCoursemajor() {
        return coursemajor;
    }

    public void setCoursemajor(String coursemajor) {
        this.coursemajor = coursemajor == null ? null : coursemajor.trim();
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc == null ? null : coursedesc.trim();
    }

    public Integer getIshome() {
        return ishome;
    }

    public void setIshome(Integer ishome) {
        this.ishome = ishome;
    }

    public String getCoursepic() {
        return coursepic;
    }

    public void setCoursepic(String coursepic) {
        this.coursepic = coursepic == null ? null : coursepic.trim();
    }

    public String getHomepic() {
        return homepic;
    }

    public void setHomepic(String homepic) {
        this.homepic = homepic == null ? null : homepic.trim();
    }
}
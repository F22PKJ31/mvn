package com.sac.pojo;

public class SacTeacher {
    private Integer teacherid;

    private String teachername;

    private String teacherdesc;

    private String teacherpic;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getTeacherdesc() {
        return teacherdesc;
    }

    public void setTeacherdesc(String teacherdesc) {
        this.teacherdesc = teacherdesc == null ? null : teacherdesc.trim();
    }

    public String getTeacherpic() {
        return teacherpic;
    }

    public void setTeacherpic(String teacherpic) {
        this.teacherpic = teacherpic == null ? null : teacherpic.trim();
    }
}
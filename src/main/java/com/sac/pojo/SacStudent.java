package com.sac.pojo;

public class SacStudent {
    private Integer stuid;

    private String stupsw;

    private String stunickname;

    private String stuschool;

    private Long stuphone;

    private String stumail;

    private String stuheadpic;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStupsw() {
        return stupsw;
    }

    public void setStupsw(String stupsw) {
        this.stupsw = stupsw == null ? null : stupsw.trim();
    }

    public String getStunickname() {
        return stunickname;
    }

    public void setStunickname(String stunickname) {
        this.stunickname = stunickname == null ? null : stunickname.trim();
    }

    public String getStuschool() {
        return stuschool;
    }

    public void setStuschool(String stuschool) {
        this.stuschool = stuschool == null ? null : stuschool.trim();
    }

    public Long getStuphone() {
        return stuphone;
    }

    public void setStuphone(Long stuphone) {
        this.stuphone = stuphone;
    }

    public String getStumail() {
        return stumail;
    }

    public void setStumail(String stumail) {
        this.stumail = stumail == null ? null : stumail.trim();
    }

    public String getStuheadpic() {
        return stuheadpic;
    }

    public void setStuheadpic(String stuheadpic) {
        this.stuheadpic = stuheadpic == null ? null : stuheadpic.trim();
    }
}
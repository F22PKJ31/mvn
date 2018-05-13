package com.sac.pojo;

import java.util.Date;

public class PostAndPoster {

	private Integer postid;

    private String posttitle;

    private String postcontent;

    private String postername;

    private Date postdate;

    private String postdesc;
    
    private Integer stuid;

    private String stupsw;

    private String stunickname;

    private String stuschool;

    private String stugrade;

    private Integer stumajor;

    private Long stuphone;

    private String stumail;

    private String stuheadpic;

    
	public PostAndPoster() {
		super();
	}

	public PostAndPoster(SacPost post, String stuheadpic) {
		super();
		this.postid = post.getPostid();
		this.posttitle = post.getPosttitle();
		this.postcontent = post.getPostcontent();
		this.postername = post.getPostername();
		this.postdate = post.getPostdate();
		this.postdesc = post.getPostdesc();
		this.stuheadpic = stuheadpic;
	}

	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getPosttitle() {
		return posttitle;
	}

	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}

	public String getPostcontent() {
		return postcontent;
	}

	public void setPostcontent(String postcontent) {
		this.postcontent = postcontent;
	}

	public String getPostername() {
		return postername;
	}

	public void setPostername(String postername) {
		this.postername = postername;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}

	public String getPostdesc() {
		return postdesc;
	}

	public void setPostdesc(String postdesc) {
		this.postdesc = postdesc;
	}

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
		this.stupsw = stupsw;
	}

	public String getStunickname() {
		return stunickname;
	}

	public void setStunickname(String stunickname) {
		this.stunickname = stunickname;
	}

	public String getStuschool() {
		return stuschool;
	}

	public void setStuschool(String stuschool) {
		this.stuschool = stuschool;
	}

	public String getStugrade() {
		return stugrade;
	}

	public void setStugrade(String stugrade) {
		this.stugrade = stugrade;
	}

	public Integer getStumajor() {
		return stumajor;
	}

	public void setStumajor(Integer stumajor) {
		this.stumajor = stumajor;
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
		this.stumail = stumail;
	}

	public String getStuheadpic() {
		return stuheadpic;
	}

	public void setStuheadpic(String stuheadpic) {
		this.stuheadpic = stuheadpic;
	}
    
    
}

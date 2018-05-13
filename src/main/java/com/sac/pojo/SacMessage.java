package com.sac.pojo;

import java.util.Date;

public class SacMessage {
    private Integer messageid;

    private String messagetitle;

    private String messagecontent;

    private Date messagedate;

    private String messagedesc;

    private String messagecompany;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle == null ? null : messagetitle.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public Date getMessagedate() {
        return messagedate;
    }

    public void setMessagedate(Date messagedate) {
        this.messagedate = messagedate;
    }

    public String getMessagedesc() {
        return messagedesc;
    }

    public void setMessagedesc(String messagedesc) {
        this.messagedesc = messagedesc == null ? null : messagedesc.trim();
    }

    public String getMessagecompany() {
        return messagecompany;
    }

    public void setMessagecompany(String messagecompany) {
        this.messagecompany = messagecompany == null ? null : messagecompany.trim();
    }
}
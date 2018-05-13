package com.sac.pojo;

public class SacLesson {
    private Integer lessonid;

    private Integer courseid;

    private String lessonname;

    private String lessonsrc;

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getLessonname() {
        return lessonname;
    }

    public void setLessonname(String lessonname) {
        this.lessonname = lessonname == null ? null : lessonname.trim();
    }

    public String getLessonsrc() {
        return lessonsrc;
    }

    public void setLessonsrc(String lessonsrc) {
        this.lessonsrc = lessonsrc == null ? null : lessonsrc.trim();
    }
}
package com.sac.pojo;

public class CommentAndStudentPic {

	private SacComment sacComment;
	
	private String studentpic;

	public CommentAndStudentPic(String studentpic) {
		// TODO Auto-generated constructor stub
		this.studentpic = studentpic;
	}
	
	public SacComment getSacComment() {
		return sacComment;
	}

	public void setSacComment(SacComment sacComment) {
		this.sacComment = sacComment;
	}

	public String getStudentpic() {
		return studentpic;
	}

	public void setStudentpic(String studentpic) {
		this.studentpic = studentpic;
	}

}

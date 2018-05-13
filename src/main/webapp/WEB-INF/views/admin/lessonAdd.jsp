<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp"%>
<!--主体内容-->
<div class="right">
	<div class="location">
		<strong>你现在所在的位置是:</strong> <span>课程管理页面 >> 课程视频管理页面 >> 视频添加页面</span>
	</div>
	<div class="providerAdd">
		<h3 style="color: red;">${msg }</h3>
		<form action="addLesson.do" method="post"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<input type="hidden" name="courseid" value="${courseid }">
			<div class="">
				<label for="lessonname">视频名称：</label> <input type="text"
					name="lessonname" id="lessonname" required /> <span>*请输入视频名称</span>
			</div>
			<div>
				<label>视频</label> <input type="file" id="exampleInputFile"
					name="file" /> <span>*请上传视频</span>
			</div>
			<div class="providerAddBtn">
				<!--<a href="#">保存</a>-->
				<!--<a href="billList.html">返回</a>-->
				<input type="submit" value="保存" /> <input type="button" value="返回"
					onclick="history.back(-1)" />
			</div>
		</form>
	</div>

</div>
</section>
<%@include file="footer.jsp" %>

</body>
</html>
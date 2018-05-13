<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp"%>
<div class="right">
	<div class="location">
		<strong>你现在所在的位置是:</strong> <span>学生管理页面 >> 学生添加页面</span>
	</div>
	<div class="providerAdd">
		<form id="form" action="addStudent.do" method="post"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<div class="">
				<label for="stunickname">学生昵称：</label> <input type="text"
					name="stunickname" id="stunickname" /> <span>*请输入学生昵称</span>
			</div>
			<div class="">
				<label for="stupsw">密码：</label> <input type="text" name="stupsw"
					id="stupsw" /> <span>*请输入密码</span>
			</div>
			<div>
				<label for="stuschool">学校：</label> <select class="form-control"
					name="stuschool">
					<c:forEach items="${school}" var="s">
						<option value="${s.schoolname }">${s.schoolname }</option>
					</c:forEach>
				</select><span>*请输入所在学校</span>
			</div>
			<div>
				<label for="stuphone">联系方式：</label> <input type="text"
					name="stuphone" id="stuphone" /> <span>*请输入联系方式</span>
			</div>
			<div>
				<label for="stumail">邮箱：</label> <input type="email" name="stumail"
					id="stumail" /> <span>*请输入邮箱</span>
			</div>
			<div>
				<label for="stuheadpic">头像：</label> <input type="file" name="file"
					id="stuheadpic" /> <span>*请上传头像</span>
			</div>
			<div class="providerAddBtn">
				<input type="button" value="保存"
					onclick="document.getElementById('form').submit(); " /> <input
					type="button" value="返回" onclick="history.back(-1)" />
			</div>
			<center>
				<h2 style="color: red;">${param.msg }</h2>
			</center>
		</form>
	</div>

</div>
</section>
<%@include file="footer.jsp"%>
</body>
</html>
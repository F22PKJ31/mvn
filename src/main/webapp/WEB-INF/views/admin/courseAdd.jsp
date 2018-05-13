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
		<strong>你现在所在的位置是:</strong> <span>课程管理页面 >> 课程添加页面</span>
	</div>
	<div class="providerAdd">
		<h3 style="color: red;">${msg }</h3>
		<form id="form" action="addCourse.do" method="post"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<div class="">
				<label for="coursename">课程名称：</label> <input type="text"
					name="coursename" id="coursename" required /> <span>*请输入课程名称</span>
			</div>
			<div>
				<label for="courseteacher">授课教师：</label> 
				 <select name="courseteacher">
				 <c:forEach items="${allteacher}" var="t" >
                        <option value="${t.teachername }">${t.teachername }</option>				 
				 </c:forEach>
                    </select>
				<span>*请输入授课教师</span>
			</div>
			<div>
				<label for="coursemajor">所属专业：</label> <input type="text"
					name="coursemajor" id="coursemajor" required /> <span>*请输入所属专业</span>

			</div>
			<div>
				<label for="coursedesc">课程介绍：</label>
				<input type="text" name="coursedesc" id="coursedesc" required/>
				<span>*请输入课程介绍</span>
			</div>
			<div>
				<label>主页推荐：</label> <input type="radio" name="ishome" value="0"
					checked />否 <input type="radio" name="ishome" value="1" />是 <span>*请选择是否主页推荐</span>
			</div>

			<div>
				<label>图片</label> <input type="file" id="exampleInputFile"
					name="file" /> <span>*请上传图片</span>
			</div>
			<div>
				<label>首页图片</label> <input type="file" id="exampleInputFile"
					name="file2" /> <span>请上传首页图片</span>
			</div>
			<div class="providerAddBtn">
				<!--<a href="#">保存</a>-->
				<!--<a href="billList.html">返回</a>-->
				<input type="button" value="保存" onclick="document.getElementById('form').submit(); "/> <input type="button" value="返回"
					onclick="history.back(-1)" />
			</div>
		</form>
	</div>

</div>
</section>
<%@include file="footer.jsp" %>

</body>
</html>
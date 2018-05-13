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
		<strong>你现在所在的位置是:</strong> <span>企业管理页面 >> 消息管理页面 >> 消息添加页面</span>
	</div>
	<div class="providerAdd">
		<h3 style="color: red;">${msg }</h3>
		<form action="addMessage.do" method="post" id = "form"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<input type="hidden" name="companyid" value="${companyid }">
			<div class="">
				<label for="messagetitle">消息标题：</label> <input type="text"
					name="messagetitle" id="messagetitle" required /> <span>*请输入消息标题</span>
			</div>
			<div class="">
				<label for="messagecontent">消息内容：</label> <input type="text"
					name="messagecontent" id="messagecontent" required /> <span>*请输入消息内容</span>
			</div>
			<div class="">
				<label for="messagedesc">消息介绍：</label> <input type="text"
					name="messagedesc" id="messagedesc" required /> <span>*请输入消息介绍</span>
			</div>
			<div class="providerAddBtn">
				<!--<a href="#">保存</a>-->
				<!--<a href="billList.html">返回</a>-->
				<input type="button" value="保存" onclick="document.getElementById('form').submit();"/> 
				 <input type="button" value="返回" onclick="history.back(-1)" />
			</div>
		</form>
	</div>

</div>
</section>
<%@include file="footer.jsp" %>

</body>
</html>
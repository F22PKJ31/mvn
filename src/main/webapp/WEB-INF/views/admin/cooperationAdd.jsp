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
		<strong>你现在所在的位置是:</strong> <span>学校管理页面 >> 校企合作管理页面 >> 合作添加页面</span>
	</div>
	<div class="providerAdd">
		<h3 style="color: red;">${msg }</h3>
		<form action="addCooperation.do" method="post" id = "form"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<input type="hidden" name="schoolid" value="${schoolid }">
			<div>
				<label for="companyname">合作企业：</label> 
				 <select name="companyname">
				 <c:forEach items="${allcompany}" var="t" >
                        <option value="${t.companyname }">${t.companyname }</option>				 
				 </c:forEach>
                    </select>
				<span>*请选择企业公司</span>
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
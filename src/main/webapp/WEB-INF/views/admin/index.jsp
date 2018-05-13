<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp" %>
    <div class="right">
        <img class="wColck" src="${pageContext.request.contextPath }/img/clock.jpg" alt=""/>
        <div class="wFont">
            <h2>${sessionScope['ADMIN'].getAdminUn() }</h2>
            <p>欢迎来到学生互助平台管理系统!</p>
			<span id="hours"></span>
        </div>
    </div>
</section>
<%@include file="footer.jsp" %>
</body>
</html>
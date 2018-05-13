<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/public.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/stylee.css"/>

</head>
<!--头部-->
<body>
<header class="publicHeader">
    <h1>学生互助平台管理系统</h1>

    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> ${sessionScope['ADMIN'].getAdminUn() }</span> , 欢迎你！</p>
        <a href="${pageContext.request.contextPath }/admin/logout.do">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
<div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="${pageContext.request.contextPath }/admin/showCourseList.do">课程管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/showTeacherList.do">教师管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/showStudentList.do">学生管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/showSchoolList.do">学校管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/showCompanyList.do">企业管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/showPostList.do">帖子管理</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/password.do">密码修改</a></li>
                <li><a href="${pageContext.request.contextPath }/admin/logout.do">退出系统</a></li>
            </ul>
        </nav>
    </div>
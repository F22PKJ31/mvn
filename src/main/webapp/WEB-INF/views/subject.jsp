<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>

<style type="text/css">
img {
	width: 100%;
}

</style>
<%@include file="header.jsp"%>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img alt="300x200" width="100%" src="http://47.95.14.18:9080/mvn/img/6608230909190265551.jpg" />
			</div>
		</div>
		<div class="row clearfix" style="background-color: #EEEEEE;">
			<div class="col-md-12 column">
				<h3>课程</h3>
				<hr />
				<div class="row">
					<c:forEach items="${allCourse}" var="h" varStatus="hc" begin="${(Count-1)*8 }" end="${Count*8 -1 }">
						<div class="col-md-3" style=" height: 260px;">
							<a href="${pageContext.request.contextPath }/course.do?courseid=${h.courseid}">
								<div class="thumbnail">

									<img class="coursepic" alt="300x200" src="${h.coursepic}" />
									<div class="caption">
										<h4>${h.coursename }</h4>
										<p>${h.courseteacher }</p>
									</div>
								</div>
							</a>
						</div>
					</c:forEach>
				</div>
				<ul class="pagination pull-right pagination-lg">
					<li><a href="${pageContext.request.contextPath }/subject.do?count=${Count-1}">&laquo;</a></li>
					<c:forEach items="${allCourse}" var="h" varStatus="hr"  step="8">
						<li><a href="${pageContext.request.contextPath }/subject.do?count=${hr.count}">${hr.count}</a></li>
					</c:forEach>
					<li><a href="${pageContext.request.contextPath }/subject.do?count=${Count+1}">&raquo;</a></li>
				</ul>
			</div>

		</div>
		<div class="row clearfix teacher">
			<div class="col-md-12 column">
				<h3>教师列表</h3>
				<hr />
				<div class="row">
					<c:forEach items="${allTeacher}" var="t" varStatus="at">
						<div class="col-md-3">
							<a href="${pageContext.request.contextPath }/teacher.do?teacherid=${t.teacherid }">
								<div class="thumbnail">

									<img class="coursepic" alt="300x200" src="${t.teacherpic }" />
									<div class="caption">
										<h4>${t.teachername }</h4>
										<p>${t.teacherdesc }</p>
									</div>
								</div>
							</a>
						</div>
						<div class="col-md-3"></div>
					</c:forEach>
				</div>
				
			</div>

		</div>
	</div>
</body>
</html>

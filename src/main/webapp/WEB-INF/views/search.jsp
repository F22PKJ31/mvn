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
		<div class="row clearfix" style="background-color: #EEEEEE;">
			<div class="col-md-12 column">
				<h3>课程</h3>
				<hr />
				<div class="row">
					<c:forEach items="${searchCourse}" var="h" varStatus="hc">
						<div class="col-md-3">
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
				
			</div>

		</div>
	</div>
</body>
</html>

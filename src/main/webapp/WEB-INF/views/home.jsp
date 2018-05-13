<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%@include file="header.jsp"%>
<style>
img {
	width: 100%
}
</style>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="carousel slide" id="carousel-186144">
					<ol class="carousel-indicators">
						<li data-slide-to="0" data-target="#carousel-186144"></li>
						<li data-slide-to="1" data-target="#carousel-186144"
							class="active"></li>
						<li data-slide-to="2" data-target="#carousel-186144"></li>
					</ol>
					<div class="carousel-inner">
						<c:forEach items="${bigCourse}" var="b" varStatus="bg">
							<c:if test="${bg.count<=2 }">
								<div class="item">
									<a href="${pageContext.request.contextPath }/course.do?courseid=${b.courseid }"> 
									<img src="${b.homepic}" />
										<div class="carousel-caption">
											<h4>${b.coursename }</h4>
											<p>${b.coursedesc}</p>
										</div>
									</a>
								</div>
							</c:if>
						</c:forEach>

						<c:forEach items="${bigCourse}" var="b" varStatus="bg">
							<c:if test="${bg.count==3 }">
								<div class="item active">
									<a href="${pageContext.request.contextPath }/course.do?courseid=${b.courseid }"> <img
										src="${b.homepic}" />
										<div class="carousel-caption">
											<h4>${b.coursename }</h4>
											<p>${b.coursedesc}</p>
										</div>
									</a>
								</div>
							</c:if>
						</c:forEach>
					</div>
					<a class="left carousel-control" href="#carousel-186144"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-186144"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
		
				<div class="row">
					<c:forEach items="${homeCourse}" var="h"   varStatus="hc">
						
							<div class="col-md-3">
								<div class="thumbnail">

									<img class="coursepic" alt="300x200" src="${h.coursepic}" />
									<div class="caption">
										<h4>${h.coursename }</h4>
										<p>${h.courseteacher }</p>
										<a class="btn btn-primary"
											href="${pageContext.request.contextPath }/course.do?courseid=${h.courseid }">进入学习</a>
									</div>
								</div>
							</div>
						
					</c:forEach>
				</div>
			</div>



		</div>
	</div>
</body>

</html>
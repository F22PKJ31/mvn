<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
li {
	list-style-type: none;
}

.myclass {
	text-align: center;
	width: 100%;
	height: 100%;
	background-color: #FFFFFF;
	padding: 10px;
}
</style>
<body>
	<%@include file="header.jsp"%>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 col-sm-12 column">
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="jumbotron" style="background-color: #FFFFFF">
							<div class="pull-left">
								<h2>${course.get(0).coursename }</h2>
								<p></p>
								<p>
									<c:if test="${sessionScope['Login']==null}">
										<a rel="nofollow" class="btn btn-primary btn-large"
											href="#loginFormModal" data-toggle="modal">登录即可添加课程</a>
									</c:if>
									<c:if test="${sessionScope['Login']!=null}">
										<c:if test="${isSelect==false}">
										<a rel="nofollow" class="btn btn-primary btn-large"
											href="${pageContext.request.contextPath }/selectcoures.do?courseid=${course.get(0).courseid }">添加课程</a>
										</c:if>
										<c:if test="${isSelect==true}">
										<button class="btn btn-danger btn-large" value="已添加">已添加</button>
										</c:if>
									</c:if>
								</p>
							</div>
							<img alt="140x140" src="${course.get(0).coursepic }"
								class="nofollow pull-right" style="height: 150px" />
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">课程介绍</h3>
							</div>
							<div class="panel-body">
								<pre
									style="border: 0px; font-size: 16px; background-color: #FFFFFF; list-style-type: none;">${course.get(0).coursedesc }</pre>
							</div>
						</div>


						<div class="panel panel-default">
							<div class="panel-heading" >
								<h3 class="panel-title">课程列表</h3>
							</div>
							<div class="panel-body" style="background-color: #FFFFFF;">
								<ul class="newsList">
									<c:forEach items="${lesson }" var="l">
										<li><a style="margin-top: 15px; font-size: 16px;"
											href="${pageContext.request.contextPath }/single.do?lessonid=${l.lessonid }">${l.lessonname }</a></li>
									</c:forEach>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
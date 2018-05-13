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
								<h1>${teacher.teachername }</h1>
								
							</div>
							<img alt="140x140" src="${teacher.teacherpic }"
								class="nofollow pull-right" style="height: 150px" />
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="row clearfix">
					<div class="col-md-12 column">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">教师介绍</h3>
							</div>
							<div class="panel-body">
								<pre
									style="border: 0px; font-size: 16px; background-color: #FFFFFF; list-style-type: none;">${teacher.teacherdesc }</pre>
							</div>
						</div>


						<div class="panel panel-default">
							<div class="panel-heading" >
								<h3 class="panel-title">所授课程</h3>
							</div>
							<div class="panel-body" style="background-color: #FFFFFF;">
								<ul class="newsList">
									<c:forEach items="${course }" var="l">
										<li><a style="margin-top: 15px; font-size: 16px;"
											href="course.do?courseid=${l.courseid }">${l.coursename }</a></li>
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
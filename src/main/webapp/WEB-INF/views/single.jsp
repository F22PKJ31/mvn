<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/luntan.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/ckplayer/ckplayer.js"></script>
</head>
<%@include file="header.jsp"%>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12 main">
				<div class="show-top-grids">
					<div class="col-sm-9 col-md-9">

						<div class="song-info">
							<h3>${single.lessonname }</h3>
						</div>
						<div class="video-grid">
						<video controls width="100%" >
	           				 <source src="${single.lessonsrc }" type="video/mp4"/>
	       		   	 		您的浏览器不支持 video 标签。
	       		   		</video>
							
						</div>

					</div>
					<div class="col-md-3 col-sm-3 column">
						<div class="myclass">
							<c:if test="${sessionScope['Login']==null}">
								<img class=" img-responsive img-circle"
									 style="width: 50%; margin: auto;"
									 src="http://imgsrc.baidu.com/imgad/pic/item/c2cec3fdfc039245cc437c338c94a4c27d1e2513.jpg" />
								<a href="#loginFormModal" data-toggle="modal"><h4
										class="username">请登录</h4></a>
								<h5>分享经验分享想法</h5>
							</c:if>
							<c:if test="${sessionScope['Login']!=null}">
								<img class=" img-responsive img-circle"
									 style="width: 50%; margin: auto;"
									 src="${sessionScope['Login'].stuheadpic }" />
								<a href="${pageContext.request.contextPath }/info.do"><h4 class="username">${sessionScope['Login'].stunickname }</h4></a>
								<h5>分享经验分享想法</h5>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
</body>
</html>
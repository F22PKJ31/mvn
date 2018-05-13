<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<%@include file="header.jsp"%>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/luntan.css">
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-12 column">
						<img alt="140x140" src="http://47.95.14.18:9080/mvn/img/xuewen.png" />
						<div class="row clearfix " style="margin-top: 40px;">
							<div class="col-md-9 column textform">
								<li class="forum-item">
									<h3 class="topic-title">${mes.messagetitle }</h3>
									<h6>${mes.messagecompany }发表于 ${mes.messagedate }</h6>
								</li>
								<pre
									style="white-space: pre-wrap; background-color: #ffffff; border: 0px; line-height: 25px; font-size: 14px;">${mes.messagecontent}</pre>
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
		</div>
	</div>
</body>

</html>
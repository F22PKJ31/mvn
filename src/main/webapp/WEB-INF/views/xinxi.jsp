<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<%@include file="header.jsp"%>

<style type="text/css">
body {
	background-color: #EEEEEE;
}

.fenlei {
	background-color: #FFFFFF;
}

.forum-item img {
	width: 80%;
	border-radius: 200px;
	position: relative;
	left: 20px;
}

.forum-item {
	height: 100px;
	background-color: #FFFFFF;
	margin-top: 10px;
	padding: 10px;
}

.orum-item-title {
	font-size: 20px;
}

.itemWrap a {
	text-decoration: none;
	color: #000000;
}

.forum-item-info {
	margin-top: 30px;
}

.myclass {
	text-align: center;
	width: 293px;
	height: 100%;
	background-color: #FFFFFF;
	padding: 10px;
}

.myclass img {
	margin-top: 10px;
	width: 50%;
	border-radius: 200px;
}

li {
	list-style-type: none;
}
</style>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<img alt="140x140" src="http://47.95.14.18:9080/mvn/img/xuewen.png" />
				<div class="row clearfix" style="margin-top: 40px;">
					<div class="col-md-9 column">
						<c:forEach items="${allMessage.list }" var="a">
							<li class="forum-item">
								<div class="itemWrap">
									<div class="title" style="margin-left: 10px;">
										<!--Regular if33-->
										<a class="orum-item-title" target="_blank" href="${pageContext.request.contextPath }/mes/message.do?mesid=${a.messageid }">${a.messagetitle }
										</a><br /> <a href="#" style="color: gray; margin-left: 20px;">
											${a.messagedesc } </a>
									</div>
									<div class=" col-md-12 column" style="margin-top: 5px;">
										<a class="name" href="${pageContext.request.contextPath }/mes/message.do?mesid=${a.messageid }" target="_blank" style="color: green;">${a.messagecompany }</a>
										<span class="time"> 发表于${a.messagedate }</span>
									</div>
								</div>
							</li>
						</c:forEach>
						<!-- 显示分页信息 -->

						<ul class="pagination">
							<li><a href="xinxi.do?pn=1">首页</a></li>
							<c:if test="${allMessage.hasPreviousPage }">
								<li><a href="xinxi.do?pn=${allMessage.pageNum-1}"
									aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
								</a></li>
							</c:if>


							<c:forEach items="${allMessage.navigatepageNums }" var="page_Num">
								<c:if test="${page_Num == allMessage.pageNum }">
									<li class="active"><a href="#">${page_Num }</a></li>
								</c:if>
								<c:if test="${page_Num != allMessage.pageNum }">
									<li><a href="${pageContext.request.contextPath }/mes/xinxi.do?pn=${page_Num }">${page_Num }</a></li>
								</c:if>

							</c:forEach>
							<c:if test="${allMessage.hasNextPage }">
								<li><a href="${pageContext.request.contextPath }/mes/xinxi.do?pn=${allMessage.pageNum+1 }"
									aria-label="Next"> <span aria-hidden="true">&raquo;</span>
								</a></li>
							</c:if>
							<li><a href="${pageContext.request.contextPath }/mes/xinxi.do?pn=${allMessage.pages}">末页</a></li>
						</ul>


					</div>


					<div class="col-md-3 column">
						<div class="myclass">
							<img src="${sessionScope['Login'].stuheadpic }" /> <a
								href="${pageContext.request.contextPath }/info.do"><h4 class="username">F22PKJ31</h4></a>
							<h5>分享经验分享想法</h5>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
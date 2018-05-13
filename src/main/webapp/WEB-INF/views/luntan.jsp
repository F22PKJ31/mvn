<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<%@include file="header.jsp"%>
<link rel="stylesheet" href="css/luntan.css">
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">

					<div class="col-md-12 col-sm-8 column">

						<img alt="140x140" class="img-responsive" width="100%"
							src="http://47.95.14.18:9080/mvn/img/xuewen.png" />
						<div class="row clearfix" style="margin-top: 40px;">
							<div class="col-md-9 col-sm-9 column">
								<div style="margin-top: 20px; height: 50px;">
									<c:if test="${sessionScope['Login']!=null}">
										<button class="btn btn-lg btn-danger pull-right"
											onclick="window.location='${pageContext.request.contextPath }/fatie.do'">+发表新帖</button>
									</c:if>
									<c:if test="${sessionScope['Login']==null}">
										<a href="#loginFormModal" data-toggle="modal"><button
												class="btn btn-lg btn-danger pull-right">+登陆后可发帖</button></a>
									</c:if>
									<!-- <a href="#">时间排序</a> |
									<a href="#">热度排序</a> -->
								</div>

								<c:forEach items="${allPost }" var="p" varStatus="ps" begin="${(Count-1)*10 }" end="${Count*10 -1 }">

									<div class="row clearfix forum-item">
										<div class="col-md-2 col-sm-2 column face">

											<img src="${p.stuheadpic }"
												class="img-circle img-responsive img-thumbnail posterimg"></a>
										</div>

										<div class="col-md-10 col-sm-10 column">

											<div class="itemWrap">
												<a class="orum-item-title"
													href="${pageContext.request.contextPath }/tiezi.do?postid=${p.postid }">
													<div class="col-md-12 column" style="height: 40px">
														<!--Regular if33-->
														<b style="font-size: 19px"> ${p.posttitle } </b>
													</div>
													<div class="col-md-12 column" style="height: 60px">
														<p style="font-size: 14px; color: gray;">${p.postdesc }
														</p>
													</div>
												</a>
												<div class=" col-md-12 column">
													<a class="name" href="#" target="_blank"
														style="color: green;">${postername }</a> <span
														class="time">${p.postername} 发表于 ${p.postdate }</span>


												</div>

											</div>

										</div>
									</div>


								</c:forEach>
								<ul class="pagination pull-right pagination-lg">
									<ul class="pagination pull-right pagination-lg">
										<li><a href="${pageContext.request.contextPath }/luntan.do?count=${Count-1}">&laquo;</a></li>
										<c:forEach items="${allPost}" var="h" varStatus="hr"
											step="10">
											<li><a href="${pageContext.request.contextPath }/luntan.do?count=${hr.count}">${hr.count}</a></li>
										</c:forEach>
										<li><a href="${pageContext.request.contextPath }/luntan.do?count=${Count+1}">&raquo;</a></li>
									</ul>
								</ul>
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
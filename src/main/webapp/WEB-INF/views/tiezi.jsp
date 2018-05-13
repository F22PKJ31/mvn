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
						<img alt="140x140" src="img/xuewen.png" />
						<div class="row clearfix " style="margin-top: 40px;">
							<div class="col-md-9 column textform">
								<li class="forum-item">
									<h3 class="topic-title">${post.posttitle }</h3>
									<h6>${post.postername }发表于 ${post.postdate }</h6>
								</li>
								<pre
									style="white-space: pre-wrap; background-color: #ffffff; border: 0px; line-height: 25px; font-size: 14px;">${post.getPostcontent()}</pre>
								<c:if test="${sessionScope['Login']==null}">

									<form class="form-horizontal" role="form"
										action="${pageContext.request.contextPath }/addCommend.do" id="form" method="post">


										<div class="form-group">
											<label for="Text2" class="col-sm-2"><h4>评论</h4></label>
											<div class="col-sm-12">
												<h4 style="color: red;" id="msg2"></h4>
												<textarea rows="5" class="form-control"
													name="commentcontent" id="Text2" readonly="readonly"></textarea>
											</div>
										</div>
										<div class="form-group">
											<a href="#loginFormModal" data-toggle="modal"><input
												type="button" class="btn btn-danger pull-right" id="sub"
												value="请登陆后评论"></a>
										</div>

									</form>

								</c:if>

								<c:if test="${sessionScope['Login']!=null}">
									<form class="form-horizontal" role="form"
										action="${pageContext.request.contextPath }/addCommend.do" id="form" method="post">

										<input type="hidden" name="studentname"
											value="${sessionScope['Login'].stunickname }"> <input
											type="hidden" name="postid" value="${post.postid }">
										<div class="form-group">
											<label for="Text2" class="col-sm-2"><h4>评论</h4></label>
											<div class="col-sm-12">
												<h4 style="color: red;" id="msg2"></h4>
												<textarea rows="5" class="form-control"
													name="commentcontent" id="Text2"></textarea>
											</div>
										</div>
										<div class="form-group">
											<input type="submit" class="btn btn-info pull-right" id="sub"
												value="提交">
										</div>

									</form>
								</c:if>

								<c:forEach items="${comment }" var="p" varStatus="ps" begin="${(Count-1)*10 }" end="${Count*10 -1 }">
									<li class="forum-item2">
										<div class="row clearfix ">
											<div class="col-md-2 column face center-block">
												<center>
													<img src="${p.getStudentpic() }"
														class="img-circle img-responsive img-thumbnail"
														style="width: 80px;"></a>
												</center>
											</div>

											<div class="col-md-10 column">
												<div class="itemWrap">
													<div class="col-md-12 column">
														<p style="font-size: 15px; height: 60px; color: gray;">
															${p.getSacComment().getCommentcontent() }</p>
													</div>
													<div class=" col-md-12 column">
														<a class="name" href="#" target="_blank"
															style="color: green;">${p.getSacComment().getStudentname() }</a>

														<span class="time"> 发表于
															${p.getSacComment().getCommentdate() }</span>


													</div>

												</div>
											</div>
										</div>

									</li>

								</c:forEach>

								<ul class="pagination pull-right pagination-lg">
									<li><a href="${pageContext.request.contextPath }/tiezi.do?postid=${post.postid }&count=${Count-1}">&laquo;</a></li>
										<c:forEach items="${comment}" var="h" varStatus="hr"
											step="10">
											<li><a href="${pageContext.request.contextPath }/tiezi.do?postid=${post.postid }&count=${hr.count}">${hr.count}</a></li>
										</c:forEach>
										<li><a href="${pageContext.request.contextPath }/tiezi.do?postid=${post.postid }&count=${Count+1}">&raquo;</a></li>
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
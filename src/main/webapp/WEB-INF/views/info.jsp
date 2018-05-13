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
img {
	width: 100%;
}


</style>

<body>
	<div class="container">
		<div class="row clearfix"
			style="height: 210px; background-image: url('img/BCA790F6E742B8CBF078CA413D2ED7AD.png');">
			<div class="col-md-12 column">
				<center>

					<div style="width: 130px; margin: 30px; margin-bottom: 0">
						<img class="img-circle img-responsive" alt=""
							src="${sessionScope['Login'].stuheadpic }">
						<h4>${sessionScope['Login'].stunickname }</h4>
					</div>
				</center>

			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<ul class="nav nav-tabs" style="margin-bottom: 20px;">
					<li><a href="${pageContext.request.contextPath }/info.do?index=1">课程</a></li>
					<li><a href="${pageContext.request.contextPath }/info.do?index=2">帖子</a></li>
					<li><a href="${pageContext.request.contextPath }/info.do?index=3">评论</a></li>

				</ul>
				<div class="row qiehuan" id="subject">
					<c:forEach items="${infoCourse }" var="i">
						<div class="col-md-3">
							<a href="${pageContext.request.contextPath }/course.do?courseid=${i.courseid }">
								<div class="thumbnail">
									<img alt="300x200" src="${i.coursepic }" />
									<div class="caption">
										<h4>${i.coursename }</h4>
										<p>${i.courseteacher }</p>
										<p>${i.coursemajor }</p>
									</div>
								</div>
							</a>
							<button class="btn btn-primary" data-toggle="modal" onclick="concelCourse('${pageContext.request.contextPath}','${i.courseid }');">退出课程</button>
						</div>
					</c:forEach>
				</div>
				<div class="row qiehuan" id="taolun">
					<c:if test="${infoPost.isEmpty()==false }">
						<c:forEach items="${infoPost }" var="i">
							<div class="col-md-12">
								<a href="${pageContext.request.contextPath }/tiezi.do?postid=${i.postid }">
									<div
										style="background-color: #FFFFFF; padding: 10px; margin-top: 10px">
										<h3>${i.posttitle }</h3>
										<p>${i.postdesc }</p>
									</div>
								</a>
								<button class="btn btn-primary" data-toggle="modal" onclick="concelPost('${pageContext.request.contextPath}','${i.postid }');">删除帖子</button>
								
							</div>
						</c:forEach>
					</c:if>
					<c:if test="${infoPost.isEmpty()==true }">
						<h3>您还没发过帖</h3>
						<a class="btn btn-primary" href="${pageContext.request.contextPath }/luntan.do">去发帖</a>
					</c:if>
				</div>
				<div class="qiehuan" id="message">
					<c:if test="${infoComment.isEmpty()==false }">
						<c:forEach items="${infoComment }" var="i">
							<div class="col-md-12">
								<a href="${pageContext.request.contextPath }/tiezi.do?postid=${i.postid }">
									<div
										style="background-color: #FFFFFF; padding: 10px; margin-top: 10px">
										<p>${i.commentcontent }</p>
									</div>
								</a>
								<button class="btn btn-primary" data-toggle="modal" onclick="concelComment('${pageContext.request.contextPath}','${i.commentid }');">删除评论</button>
							</div>
						</c:forEach>
					</c:if>
					<c:if test="${infoComment.isEmpty()==true }">
						<h3>您还没有任何评论</h3>
					</c:if>
				</div>
			</div>


		</div>
	</div>
</body>
<script type="text/javascript">
		function concelCourse(url,id){

			$.post(url+"/concelCourse.do",{courseid:id},
				function(result){
					if(result.mes==true){
			   			
						$("#msgTitle").html("成功");
						$("#msgBody").html("退出成功");
						$("#msgModal").modal('show');
					}
					else{
						$("#msgTitle").html("失败");
						$("#msgBody").html("退出失败");
						$("#msgModal").modal('show');
						
					}
				},"json");
		}
		function concelPost(url,id){

			$.post(url+"/concelPost.do",{postid:id},
				function(result){
					if(result.mes==true){
			   			
						$("#msgTitle").html("成功");
						$("#msgBody").html("删除成功");
						$("#msgModal").modal('show');
					}
					else{
						$("#msgTitle").html("失败");
						$("#msgBody").html("删除失败");
						$("#msgModal").modal('show');
						
					}
				},"json");
		}
		function concelComment(url,id){

			$.post(url+"/concelComment.do",{commentid:id},
				function(result){
					if(result.mes==true){
			   			
						$("#msgTitle").html("成功");
						$("#msgBody").html("删除成功");
						$("#msgModal").modal('show');
					}
					else{
						$("#msgTitle").html("失败");
						$("#msgBody").html("删除失败");
						$("#msgModal").modal('show');
						
					}
				},"json");
		}
		</script>
</html>

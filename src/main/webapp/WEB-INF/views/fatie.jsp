<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		
	</head>
<%@include file="header.jsp" %>
<link rel="stylesheet" href="css/luntan.css">
		
		<script type="text/javascript">
			$(document).ready(function() {
				
				$('#sub').click(function() {
					
					 if($('#Title').val()==''){
						$('#msg1').html('标题不能为空');
					}
					if ($('#Text2').val()=='') {
						$('#msg2').html('内容不能为空');
					}
					if ($('#Text').val()=='') {
						$('#msg3').html('内容介绍不能为空');
					}
					if($('#Title').val()!=''){
						$('#msg1').empty();
					}
					if($('#Text2').val()!=''){
						$('#msg2').empty();
					}
					if($('#Text').val()!=''){
						$('#msg3').empty();
					}
					if($('#Title').val()!=''&&$('#Text2').val()!=''&&$('#Text').val()!=''){
						$('#form').submit();
					} 
					
					
				});
				
			});
		</script>
	<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-12 column">
						<img alt="140x140" src="img/xuewen.png" />
						<div class="row clearfix" style="margin-top:40px;">
							<div class="col-md-9">
								<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/addPost.do" id="form" method="post">
									<div class="form-group">
										 <label for="Title" class="col-sm-2"><h3>标题</h3></label>
										 <input type="hidden" class="form-control" name="postername" value="${sessionScope['Login'].stunickname }" />
										<div class="col-sm-12">
											<h4 style="color:red;" id="msg1"></h4>
											<input type="text" class="form-control" name="posttitle" id="Title" />
										</div>
									</div>
									<div class="form-group">
										 <label for="Text" class="col-sm-2"><h3>内容介绍</h3></label>
										<div class="col-sm-12">
										<h4 style="color:red;" id="msg3"></h4>
											<textarea rows="5" class="form-control" name="postdesc" id="Text" ></textarea>
										</div>
									</div>
									<div class="form-group">
										 <label for="Text2" class="col-sm-2"><h3>内容</h3></label>
										<div class="col-sm-12">
										<h4 style="color:red;" id="msg2"></h4>
											<textarea rows="20" class="form-control" name="postcontent" id="Text2" ></textarea>
										</div>
									</div>
									<input type="button" class="btn btn-primary btn-block" id="sub" style="margin-top: 40px" value="提交">
								</form>
							</div>

							<div class="col-md-3 col-sm-3 column">
								<div class="myclass">
									<c:if test="${sessionScope['Login']==null}">
										<img class=" img-responsive img-circle" style="width:50%; margin: auto;" src="http://imgsrc.baidu.com/imgad/pic/item/c2cec3fdfc039245cc437c338c94a4c27d1e2513.jpg"/>
										<a href="#loginFormModal" data-toggle="modal"><h4 class="username">请登录</h4></a>
										<h5>分享经验分享想法</h5>
									</c:if>
									<c:if test="${sessionScope['Login']!=null}">
										<img class=" img-responsive img-circle" style="width:50%; margin: auto;" src="${sessionScope['Login'].stuheadpic }"/>
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
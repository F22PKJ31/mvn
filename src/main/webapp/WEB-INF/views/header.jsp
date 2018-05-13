<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.2.11.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/body.css">
	<style type="text/css">
	li {
	list-style-type: none;
}
	</style>
</head>

<body>
<div class="modal fade" id="msgModal" role="dialog" aria-hidden="true" aria-labelledby="myModalLabel">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">					 
				<button class="close" aria-hidden="true" type="button" data-dismiss="modal">
					×
				</button>
				<h4 class="modal-title" id="msgTitle">
					
				</h4>
			</div>
			<div class="modal-body" id="msgBody">
				
			</div>
			<div class="modal-footer">	 
				<button class="btn btn-default" type="button" data-dismiss="modal" onclick="flush();">关闭窗口</button>	
			</div>
		</div>
		
	</div>
	
</div>
<div class="row clearfix">
<!-- 模态框（Modal） -->
			<div class="modal fade" id="loginFormModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">登录</h4>
						</div>
						<form class="form-horizontal" role="form" id="LoginForm" action="login.do" method="post">
							<div class="modal-body">

								<div class="form-group">
									<label for="stumail" class="col-sm-2 control-label">用户名</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="stunickname" id="stunickname" placeholder="用户名" />
									</div>
								</div>
								<div class="form-group">
									<label for="stupsw" class="col-sm-2  control-label">密码</label>
									<div class="col-sm-10">
										<input type="password" class="form-control" name="stupsw" id="stupsw" placeholder="密码" />
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal" onclick="flush();">关闭</button>
									<button type="button" onclick="login('${pageContext.request.contextPath}')" class="btn btn-primary">登录</button>
								</div>
							</div>
						</form>

					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal -->
			</div>
			<div class="col-md-12 column">
				<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
						<a class="navbar-brand" href="#">校企合作学生互助平台</a>
					</div>

					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav act">
							<li>
								<a href="${pageContext.request.contextPath }/home.do">首页</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/subject.do">课程建设</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/luntan.do">校园社区</a>
							</li>
							<li>
							<c:if test="${sessionScope['Login']==null}">
									<a rel="nofollow"  href="#loginFormModal" data-toggle="modal">查看信息发布需要登录</a>
								</c:if>
								<c:if test="${sessionScope['Login']!=null}">
									<a href="${pageContext.request.contextPath }/mes/xinxi.do">信息发布</a>
								</c:if>
							</li>
						</ul>
						<form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath }/search.do" method="post">
							<div class="form-group">
								<input type="text" class="form-control" name="coursename" placeholder="课程搜索" />
							</div> 
							<button type="submit" class="btn btn-default">搜索</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
						<c:if test="${sessionScope['Login']==null}">
							<li>
								<a href="${pageContext.request.contextPath }/reg.do">注册</a>
							</li>
							<li>
								<a href="#loginFormModal" data-toggle="modal">登录</a>
							</li>
							<li>
								&nbsp;&nbsp;&nbsp;&nbsp;
							</li>
						</c:if>
							<c:if test="${sessionScope['Login']!=null}">
								<li>
									<a href="${pageContext.request.contextPath }/info.do">个人中心</a>
								</li>
							<li class="dropdown">
								 <a href="#" class="dropdown-toggle" data-toggle="dropdown">${sessionScope['Login'].stunickname }<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									
									<li class="divider">
									</li>
									<li>
										 <a href="#" onclick="logout('${pageContext.request.contextPath}');">退出登录</a>
									</li>
								</ul>
							</li>
						</c:if>
						</ul>
					</div>

				</nav>
			</div>

		</div>
		<script type="text/javascript">
		function login(url){

			$.post(url+"/login.do",$('#LoginForm').serialize(),
				function(result){
					if(result.login==true){
			   			
						$('#loginFormModal').modal('hide');
						location.reload();
					}
					else{
						$('#loginFormModal').modal('hide');
						$("#msgTitle").html("登录失败");
						$("#msgBody").html("用户名或密码错误");
						$("#msgModal").modal('show');
						
					}
				},"json");
		}
		
		function logout(url){
			$.post(url+"/logout.do",null,function(){
				
				location.reload();
			});
			
		}
		
		function flush(){
			location.reload();
		}
		$(document).ready(function() {
			var a = '${param.mes}';
			if(a!=null&&a!=""){
				alert(a);
			}
		})
	
		</script>
</body>
</html>
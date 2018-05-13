<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	</head>
	
	<style>
	  .provinceSchool { display:none;position:absolute;width:580px;height:310px;border:1px solid #72B9D7; }
	  .provinceSchool .title { width:100%;height:30px;background:url(images/title-bg.png) repeat-x center left;}
	  .provinceSchool .title span { margin-left:10px;font-weight:600;color:#000;line-height:30px;}
	  .provinceSchool .proSelect { width:550px;height:22px;margin:10px 0 6px 15px;}
	  .provinceSchool .proSelect select { width:136px;}
	  .provinceSchool .proSelect input { display:none;}
	  .provinceSchool .schoolList { width:550px;height:200px;margin-left:15px;overflow-y:auto; border:1px solid #72B9D7;}
	  .provinceSchool .schoolList ul { width:510px;}
	  .provinceSchool .schoolList ul li { float:left;width:158px;height:22px;margin-left:6px;padding-left:6px;line-height:22px;cursor:pointer;}
		.provinceSchool .schoolList ul li.DoubleWidthLi { width:328px;}
	  .provinceSchool .schoolList ul li:hover { background:#72B9D7;}
	  .provinceSchool .button { width:100%;height:40px;margin-top:8px;}
	  .provinceSchool .button button { float:right;height:30px;margin-right:20px;padding:4px 10px; background:url(images/title-bg.pngui-bg.png);border:none;color:#000;font-weight:600;cursor:pointer;}</style>
	<%@include file="header.jsp" %>
	<body>
			<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h3 class="text-center">
				用户注册
			</h3>
			<div class="row clearfix">
				<div class="col-md-2 column">
				</div>
				<div class="col-md-8 column">
					<form class="form-horizontal" enctype="multipart/form-data" role="form" id="regForm" action="${pageContext.request.contextPath }/addStudent.do" method="post">
						
						<div class="form-group">
							 <label for="inputText3" class="col-sm-2 control-label">用户名:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="stunickname" id="inputText3" />
							</div>
						</div>
						<div class="form-group">
							 <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
							<div class="col-sm-10">
								<input type="password" class="form-control" name="stupsw" id="inputPassword3" />
							</div>
						</div>
						<div class="form-group">
							 <label for="inputPassword4" class="col-sm-2 control-label">确认密码:</label>
							<div class="col-sm-10">
								<input type="password" name="repsw" class="form-control" id="inputPassword4" />
							</div>
						</div>
						<div class="form-group">
							 <label for="inputNumber" class="col-sm-2 control-label">手机号:</label>
							<div class="col-sm-10">
								<input type="number" class="form-control" name="stuphone" id="inputNumber" />
							</div>
						</div>
						<div class="form-group">
							 <label for="inputEmail3" class="col-sm-2 control-label">邮箱:</label>
							<div class="col-sm-10">
								<input type="email" class="form-control" name="stumail" id="inputEmail3" />
							</div>
						</div>
						<div class="form-group">
							<label for='mySchool' class="col-sm-2 control-label">学校名称:</label>
							<div class="col-sm-10">
								<select class="form-control" name="stuschool">
								<c:forEach items="${school}" var="s" >
									<option value="${s.schoolname }">${s.schoolname }</option>
								</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for='mypic' class="col-sm-2 control-label">头像:</label>
							<div class="col-sm-10">
								<input type="file" class="form-control" name="file" id="mypic" />
							</div>
						</div>	 
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								 <button type="button" class="btn btn-default btn-block btn-success" onclick="document.getElementById('regForm').submit()">注册</button>
							</div>
						</div>
					</form>
					<center><h3 style="color: red;">${mes }</h3></center>
				</div>
				<div class="col-md-2 column">
				</div>
			</div>
		</div>
	</div>
</div>
		<!-- <script src="js/school.js" type="text/javascript" charset="utf-8"></script> -->
	</body>
	
</html>

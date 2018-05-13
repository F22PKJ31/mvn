<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form role="form" action="fileUpload.do" 
					enctype="multipart/form-data" method="post">
					<div class="form-group">
						<label for="coursename">课程名称：</label><input type="text"
							name="coursename" class="form-control" id="coursename" />
					</div>
					<div class="form-group">
						<label for="coursemajor">所属专业：</label><input type="text"
							name="coursemajor" class="form-control" id="coursemajor" />
					</div>
					<div class="form-group">
						<label for="name" >选择列表</label> <select class="form-control" name="courseteacher">
						<c:forEach items="${allTeacher }" var="t">
							<option value="${t.teachername }">${t.teachername }</option>
						</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label for="coursedesc">课程简介：</label><input type="text"
							name="coursedesc" class="form-control" id="coursedesc" />
					</div>
					<div class="form-group">
						<label for="exampleInputFile">附件：</label><input type="file"
							id="exampleInputFile" name="file" />
						<p class="help-block">请上传您的附件！</p>
					</div>
					<button type="submit" class="btn btn-default"
						>提交</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
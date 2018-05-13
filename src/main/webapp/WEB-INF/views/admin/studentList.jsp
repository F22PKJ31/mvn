<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp"%>
<div class="right">
	<div class="location">
		<strong>你现在所在的位置是:</strong> <span>学生管理页面</span>
	</div>
	<div class="search">
		<form id="search" action="${pageContext.request.contextPath}/admin/showStudentList.do" method="post">
		<span>用户名：</span>
			<input type="text" name="un" placeholder="请输入用户名" /> 
			<input type="button" value="查询" onclick="document.getElementById('search').submit();"/> 
		<a href="showStudentAdd.do">添加用户</a>
		</form>
		
	</div>
	<!--用户-->
	<table class="providerTable" cellpadding="0" cellspacing="0">
		<tr class="firstTr">
			<th width="10%">序列号</th>
			<th width="15%">学生昵称</th>
			<th width="10%">学校</th>
			<th width="15%">联系方式</th>
			<th width="15%">邮箱</th>
			<th width="15%">头像</th>
			<th width="20%">操作</th>
		</tr>
		<c:forEach items="${showStudentList }" var="s" varStatus="ss">
			<tr>
				<td>${ss.count }</td>
				<td>${s.stunickname }</td>
				<td>${s.stuschool }</td>
				<td>${s.stuphone }</td>
				<td>${s.stumail }</td>
				<td><img width="100%" src="${pageContext.request.contextPath }/${s.stuheadpic}" /> </td>
				
				<td><!--  <a href="studentView.do"><img src="${pageContext.request.contextPath }/img/read.png" alt="查看"
					title="查看" /></a>--> 
					<a href="showStudentView.do?stuid=${s.stuid }"><img src="${pageContext.request.contextPath }/img/read.png" alt="查看" title="查看"/></a>
					<a href="showStudentUpdate.do?stuid=${s.stuid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改" /></a> 
					<a href="#" class="removeStudent" data-id="${s.stuid }"><img src="${pageContext.request.contextPath }/img/schu.png"  alt="删除" title="删除" /></a>
			</td>
			</tr>
		</c:forEach>
	</table>

</div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removeStudent').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeStudent.do?stuid=' + id,
                method: 'get',
                dataType : "json",
                success: function(res) {
                    var selector = "[data-id=" + id + "]";
                    if (res.ret == 1) {
                    	location.reload();
                    } else {
                        alert("失败");
                    }
                }
            })
        }
        
    })
})
</script>

</body>
</html>
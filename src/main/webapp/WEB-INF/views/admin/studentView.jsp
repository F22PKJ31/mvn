<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp" %>
    <div class="right">
        <div class="location">
		<strong>你现在所在的位置是:</strong> <span>学生管理页面>> 学生数据管理页面</span>
	</div>
	<!--用户-->
	<div>
		<div class="left" style="float: left; background: #ffffff;" >
		 <ul class="list" >
	         <li><a href="${pageContext.request.contextPath }/admin/showStudentView.do?index=1&stuid=${param.stuid}">已选课程</a></li>
	         <li><a href="${pageContext.request.contextPath }/admin/showStudentView.do?index=2&stuid=${param.stuid}">他的帖子</a></li>
	         <li><a href="${pageContext.request.contextPath }/admin/showStudentView.do?index=3&stuid=${param.stuid}">他的评论</a></li>
	         
	     </ul>
	     </div>
	     <div class="right" style="float: right;">
	     	<c:if test="${CourseList.isEmpty()==false }">
			<table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">课程编码</th>
                    <th width="10%">课程名称</th>
                    <th width="10%">授课教师</th>
                    <th width="10%">所属专业</th>
                    <th width="10%">课程简介</th>
                    <th width="10%">是否首页推荐</th>
                    <th width="10%">课程图片</th>
                    <th width="20%">首页图片</th>
                    <th width="10%">操作</th>
                </tr>
                <c:forEach var="v" items="${CourseList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td>${v.coursename }</td>
	                    <td>${v.courseteacher }</td>
	                    <td>${v.coursemajor }</td>
	                    <td>${v.coursedesc }</td>
	                    <td>${v.ishome }</td>
	                    <td><img width="95%" alt="" src="${pageContext.request.contextPath }/${v.coursepic }"></td>
	                    <td><img width="95%" alt="" src="${pageContext.request.contextPath }/${v.homepic }"></td>
	                    <td>
	                        <a href="showCourseView.do?courseid=${v.courseid }"><img src="${pageContext.request.contextPath }/img/read.png" alt="查看" title="查看"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
            </c:if>
            <c:if test="${PostList.isEmpty()==false }">
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">帖子编码</th>
                    <th width="15%">帖子标题</th>
                    <th width="20%">帖子内容</th>
                    <th width="10%">发帖人</th>
                    <th width="10%">发帖时间</th>
                    <th width="10%">帖子简介</th>
                    <th width="15%">操作</th>
                </tr>
                <c:forEach var="v" items="${PostList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td>${v.posttitle }</td>
	                    <td>${fn:substring(v.postcontent,0,30) }</td>
	                    <td>${v.postername }</td>
	                    <td>${v.postdate }</td>
	                    <td>${v.postdesc }</td>
	                    <td>
	                    	<a href="showPostView.do?postid=${v.postid }"><img src="${pageContext.request.contextPath }/img/read.png" alt="查看" title="查看"/></a>
	                        <a href="#" data-id="${v.postid }" class="removePost"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
            </c:if>
             <c:if test="${CommentList.isEmpty()==false }">
             <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">评论编码</th>
                    <th width="25%">评论内容</th>
                    <th width="15%">评论人</th>
                    <th width="25%">评论时间</th>
                    <th width="25%">操作</th>
                </tr>
                <c:forEach var="v" items="${CommentList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td>${fn:substring(v.commentcontent,0,30) }</td>
	                    <td>${v.studentname }</td>
	                    <td>${v.commentdate }</td>
	                    <td>
	                    	<a href="#" data-id="${v.commentid }" class="removeComment"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
             </c:if>
		</div>
    </div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removePost').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removePost.do?postid=' + id,
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
$(document).ready(function() {
    $('.removeComment').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeComment.do?commentid=' + id,
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
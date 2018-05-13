<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp" %>
<!--主体内容-->

    <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>课程管理页面>> 课程视频管理页面</span>
            </div>
            <form action="showCourseView.do?courseid=${param.courseid }" method="post" id="search">
	            <div class="search">
	                <span>视频名称：</span>
		                <input type="text" name="ln" placeholder="请输入视频的名称"/>
		                <input type="button" value="查询" onclick="document.getElementById('search').submit(); "/>
	                <a href="showLessonAdd.do?courseid=${param.courseid }">添加视频</a>
	            </div>
            </form>
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">视频编码</th>
                    <th width="30%">视频名称</th>
                    <th width="40%">视频</th>
                    <th width="20%">操作</th>
                </tr>
                <c:forEach var="v" items="${allLessonList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td style="text-align: left;">${v.lessonname }</td>
	                    <td>
		                    <video controls width="60%" style="margin: 0 auto;">
					            <source src="${pageContext.request.contextPath }/${v.lessonsrc }" type="video/mp4">
					       		   	 您的浏览器不支持 video 标签。
		            		</video>
	            		</td>
	                    <td>
	                        <a href="showLessonUpdate.do?lessonid=${v.lessonid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a>
	                        <a href="#" data-id="${v.lessonid }" class="removeLesson"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
        </div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removeLesson').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeLesson.do?lessonid=' + id,
                method: 'get',
                dataType : "json",
                success: function(res) {
                    var selector = "[data-id=" + id + "]";
                    if (res.ret == 1) {
                    	location.reload();
                    } else {
                        alert("失败")
                    }
                }
            })
        }
        
    })
})
</script>
</body>
</html>
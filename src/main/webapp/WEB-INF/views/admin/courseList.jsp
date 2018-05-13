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
                <strong>你现在所在的位置是:</strong>
                <span>课程管理页面</span>
            </div>
            <div class="search">
	            <form id="search" action="${pageContext.request.contextPath}/admin/showCourseList.do" method="post">
	                <span>课程名称：</span>
	                <input type="text" name="cn" placeholder="请输入课程的名称"/>
	                
	                <span>授课教师：</span>
	                <select name="teacher" >
	                    <option value="">--请选择--</option>
	                	<c:forEach items="${teachers }" var="t">
	                    <option value="${t.teachername }">${t.teachername }</option>
	                		
	                    </c:forEach>
	                </select>
	
	                <span>是否首页推荐：</span>
	                <select name="ishome">
	                    <option value="">--请选择--</option>
	                    <option value="0">0</option>
	                    <option value="1">1</option>
	                </select>
	
	                <input type="button" value="查询" onclick="document.getElementById('search').submit(); "/>
	                <a href="showCourseAdd.do">添加课程</a>
                </form>
            </div>
            <!--账单表格 样式和供应商公用-->
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
                <c:forEach var="v" items="${allCourseList }" varStatus="vs">
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
	                        <a href="showCourseUpdate.do?courseid=${v.courseid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a>
	                        <a href="#" data-id="${v.courseid }" class="removeCourse"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
        </div>
    </section>

<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removeCourse').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeCourse.do?courseid=' + id,
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
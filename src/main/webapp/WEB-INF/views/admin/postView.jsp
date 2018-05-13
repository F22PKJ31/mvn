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
                <span>帖子管理页面>> 评论管理页面</span>
            </div>
            <div class="search">
	            <form id="form" action="${pageContext.request.contextPath}/admin/showCommentList.do" method="post">
	               
	                <span>评论人：</span>
	                <input type="text" name="sn" placeholder="请输入评论人的昵称"/>

	                <input type="button" value="查询" onclick="document.getElementById('form').submit();"/>
                </form>
            </div>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">评论编码</th>
                    <th width="25%">评论内容</th>
                    <th width="15%">评论人</th>
                    <th width="25%">评论时间</th>
                    <th width="25%">操作</th>
                </tr>
                <c:forEach var="v" items="${allCommentList }" varStatus="vs">
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
        </div>
    </section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
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
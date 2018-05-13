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
                <span>帖子管理页面</span>
            </div>
            <div class="search">
	            <form id="form" action="${pageContext.request.contextPath}/admin/showPostList.do" method="post">
	                <span>帖子标题：</span>
	                <input type="text" name="pt" placeholder="请输入帖子的标题"/>
	                
	                <span>发帖人：</span>
	                <input type="text" name="pn" placeholder="请输入发帖人的昵称"/>

	                <input type="button" value="查询" onclick="document.getElementById('form').submit();"/>
                </form>
            </div>
            <!--账单表格 样式和供应商公用-->
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
                <c:forEach var="v" items="${allPostList }" varStatus="vs">
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
</script>
</body>
</html>
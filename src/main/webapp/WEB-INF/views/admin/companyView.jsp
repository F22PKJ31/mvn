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
                <span>企业管理页面>> 消息管理页面</span>
            </div>
            <form action="showCompanyView.do?companyid=${param.companyid }" method="post" id="search">
	            <div class="search">
	                <span>消息标题：</span>
		                <input type="text" name="mt" placeholder="请输入消息的标题"/>
		                <input type="button" value="查询" onclick="document.getElementById('search').submit(); "/>
	                <a href="showMessageAdd.do?companyid=${param.companyid }">发布消息</a>
	            </div>
            </form>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">消息编码</th>
                    <th width="20%">消息标题</th>
                    <th width="25%">消息内容</th>
                    <th width="10%">发布时间</th>
                    <th width="20%">消息简介</th>
                    <th width="15%">操作</th>
                </tr>
                <c:forEach var="v" items="${MessagesList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td>${v.messagetitle }</td>
	                    <td>${fn:substring(v.messagecontent,0,30) }</td>
	                    <td>${v.messagedate }</td>
	                    <td>${v.messagedesc }</td>
	                    <td>
	                 	   <a href="showMessageUpdate.do?messageid=${v.messageid }&companyid=${param.companyid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a>
	                    	<a href="#" data-id="${v.messageid }" class="removeMessage"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
        </div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removeMessage').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeMessage.do?messageid=' + id,
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
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
                <span>学校管理页面 >> 校企合作管理页面</span>
            </div>
	            <div class="search">
	                <a href="showCooperationAdd.do?schoolid=${schoolid}">添加合作</a>
	            </div>
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="30%">合作编码</th>
                    <th width="40%">合作企业</th>
                    <th width="30%">操作</th>
                </tr>
                <c:forEach var="v" items="${allCooperationList }" varStatus="vs">
	                <tr>
	                    <td>${vs.count }</td>
	                    <td>${v.companyname }</td>
	                    <td>
	                        <a href="showCooperationUpdate.do?cooperationid=${v.cooperationid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a>
	                        <a href="#" data-id="${v.cooperationid }" class="removeCooperation"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a>
	                    </td>
	                </tr>
                </c:forEach>
            </table>
        </div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
$(document).ready(function() {
    $('.removeCooperation').click(function() {
        var that = $(this);
        var id = that.attr('data-id');
        var cfm = confirm("确认要删除吗?");
        if (cfm == 1) {
            $.ajax({
                url: 'removeCooperation.do?cooperationid=' + id,
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
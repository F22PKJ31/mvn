<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
</head>
<%@include file="header.jsp"%>
<!--主体内容-->
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>学校管理页面</span>
            </div>
                 <form action="showSchoolList.do" method="post" id="search">
	            <div class="search">
	                <span>学校名称：</span>
		                <input type="text" name="tn" placeholder="请输入学校的名称"/>
		                <input type="button" value="查询" onclick="document.getElementById('search').submit(); "/>
               		<a href="showSchoolAdd.do">添加学校</a>
	            </div>
            </form>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="20%">学校编码</th>
                    <th width="20%">学校姓名</th>
                    <th width="30%">学校简介</th>
                    <th width="30%">操作</th>
                </tr>
                <c:forEach var="t" items="${allSchoolList }" varStatus="ts">
	                <tr>
	                    <td>${ts.count }</td>
	                    <td>${t.schoolname }</td>
	                    <td>${t.schooldesc }</td>
	                    <td>
	                    <a href="showSchoolView.do?schoolid=${t.schoolid }"><img src="${pageContext.request.contextPath }/img/read.png" alt="查看" title="查看"/></a>
	                       <a href="showSchoolUpdate.do?schoolid=${t.schoolid }"><img src="${pageContext.request.contextPath }/img/xiugai.png" alt="修改" title="修改"/></a>
	                         <a href="#" data-id="${t.schoolid }"class="removeSchool"><img src="${pageContext.request.contextPath }/img/schu.png" alt="删除" title="删除"/></a> 
	                    </td>
	                </tr>
                </c:forEach>
            </table>
        </div>
    </section>
	
<!--点击删除按钮后弹出的页面-->


<%@include file="footer.jsp" %>
    <script type="text/javascript">
    $(document).ready(function() {
        $('.removeSchool').click(function() {
            var that = $(this);
            var id = that.attr('data-id');
            var cfm = confirm("确认要删除吗?");
            if (cfm == 1) {
                $.ajax({
                    url: 'removeSchool.do?schoolid=' + id,
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
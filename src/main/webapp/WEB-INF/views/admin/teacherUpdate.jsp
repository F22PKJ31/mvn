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
            <strong>你现在所在的位置是:</strong>
            <span>教师管理页面 >> 教师修改页</span>
        </div>
        <div class="providerAdd">
            <form id="form" action="updateTeacher.do" method="post" enctype="multipart/form-data">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <input type="hidden"
					name="teacherid"  value="${teacher.getTeacherid() }" required />
                <div class="">
                    <label for="teacherName">教师姓名：</label>
                    <input type="text" name="teachername" id="teachername" value="${teacher.getTeachername() }" required/>
                    <span>*</span>
                </div>
                <div>
                    <label for="teacherDesc">教师简介：</label>
                    <input type="text" name="teacherdesc" id="teacherdesc" value="${teacher.getTeacherdesc() }" required/>
                    <span >*</span>
                </div>
                <div>
                    <label for="teacherPic">教师图片：</label>
                    <input type="file" name="file" id="exampleInputFile" /><br>
                    <img style="margin-left: 200px;margin-top: 10px; width: 283px;"
                     alt="" src="${teacher.getTeacherpic() }">
                    <span>*</span>

                </div>
               
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="providerList.html">返回</a>-->
                    <input type="button" value="提交" onclick="document.getElementById('form').submit(); "/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<%@include file="footer.jsp" %>
</body>
</html>
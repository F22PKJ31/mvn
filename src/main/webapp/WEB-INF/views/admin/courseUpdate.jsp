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
            <span>课程管理页面 >> 课程修改页面</span>
        </div>
        <div class="providerAdd">
            <form id="form" action="updateCourse.do" method="post"
			enctype="multipart/form-data">
			<!--div的class 为error是验证错误，ok是验证成功-->
			<input type="hidden"
					name="courseid"  value="${course.get(0).getCourseid() }" required />
			<div class="">
				<label for="coursename">课程名称：</label> <input type="text"
					name="coursename" id="coursename" value="${course.get(0).getCoursename() }" required /> <span>*</span>
			</div>
			<div>
				<label for="courseteacher">授课教师：</label> 
				 <select name="courseteacher">
				 <c:forEach items="${allteacher}" var="t" >
                        <option value="${t.teachername }" >${t.teachername }</option>	
                   			 
				 </c:forEach>
                    </select>
				<span>*</span>
			</div>
			<div>
				<label for="coursemajor">所属专业：</label> <input type="text"
					name="coursemajor" id="coursemajor" value="${course.get(0).getCoursemajor() }" required /> <span>*</span>

			</div>
			<div>
				<label for="coursedesc">课程介绍：</label>
				<input type="text" name="coursedesc" id="coursedesc" value="${course.get(0).getCoursedesc() }" required/>
				<span>*</span>
			</div>
			<div>
				<label>主页推荐：</label> 
					<input type="radio" name="ishome" value="0" />否 
					<input type="radio" name="ishome" value="1" />是 <span>*</span>
			</div>
			
			<div>
				<label>图片</label> 
				<input type="file" id="exampleInputFile" name="file" /> <br>
				<img style="margin-left: 200px;margin-top: 10px; width: 283px;" alt="" src="${course.get(0).getCoursepic() }">
				<span>*</span>
			</div>
			<div>
				<label>首页图片</label> 
				<input type="file" id="exampleInputFile" name="file2" /> <br>
				<img style="margin-left: 200px;margin-top: 10px; width: 283px;" alt="" src="${course.get(0).getHomepic() }">
				<span>*</span>
			</div>
			<div>
				<label>是否删除首页图片：</label> 
					<input type="radio" name="ishomepic" value="1" checked="checked"/>否
					<input type="radio" name="ishomepic" value="0" />是 <span>*</span>
			</div>
			<div class="providerAddBtn">
				<!--<a href="#">保存</a>-->
				<!--<a href="billList.html">返回</a>-->
				<input type="button" value="保存" onclick="document.getElementById('form').submit(); "/> <input type="button" value="返回"
					onclick="history.back(-1)" />
			</div>
		</form>
        </div>

    </div>
</section>
<%@include file="footer.jsp" %>
<script type="text/javascript">
 $(document).ready(function() {
		
		if ('${course.get(0).getIshome()}' =='1') {
			$("input[name='ishome']").eq(1).attr('checked','checked');
		}else{
			$('input[name="ishome"]').eq(0).attr('checked','checked');
		}
		var teacher ='${course.get(0).getCourseteacher() }';
		
		for(var i=0 ; i<'${allteacher.size()}' ;i++){
			if($('select[name="courseteacher"]').children().get(i).getAttribute('value') == teacher){
				$('select[name="courseteacher"]').children().get(i).setAttribute("selected","selected");
			}
		}
	})
</script>
</body>
</html>
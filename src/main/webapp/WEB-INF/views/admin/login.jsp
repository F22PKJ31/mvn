<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生互助平台管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/stylee.css"/>
</head>
<body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>学生互助平台管理系统</h1>
        </header>
        <section class="loginCont">
            <form class="loginForm"  action="${pageContext.request.contextPath }/welcome.do" method="post">
           
                <div class="inputbox">
                    <label for="user">用户名：</label>
                    <input id="user" type="text" name="adminUn" placeholder="请输入用户名" required/>
                </div>
                <div class="inputbox">
                    <label for="mima">密码：</label>
                    <input id="mima" type="password" name="adminPsw" placeholder="请输入密码" required/>
                </div>
                <center>
            	 <h6 style="color: red;">${msg }</h6>
            </center>
                <div class="subBtn">
                    <input type="submit" value="登录" />
                    <input type="reset" value="重置"/>
                </div>

            </form>
        </section>
    </section>

</body>
</html>
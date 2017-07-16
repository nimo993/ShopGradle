<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>密码</title>
</head>
<body>
<h1>${sessionScope.user.username},您好！</h1>
<h1>您的密码是${sessionScope.user.password}</h1>
<a href="loginForm">返回登陆页面</a>
</body>
</html>
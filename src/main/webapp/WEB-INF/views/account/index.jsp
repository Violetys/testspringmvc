<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Hello</title>
</head>
<body>
<form action="Login" method="get" >
<label style="width:50px;float:left;text-align:right;">用户名</label>
<input name="username" type="text"/><br/>
<label style="width:50px;float:left;text-align:right;">密码</label>
<input name="password" type="text"/>
<br>
<input type="submit" value="登录"/>
</form>
<span style="color:red;">${errorMsg}</span>
</body>
</html>
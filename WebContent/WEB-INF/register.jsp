<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>???????</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/register_do" method="post">
用户名:<input type="text" name="username"/><br/>
密码:<input type="password" name="password"/><br/>
年龄:<input type="text" name="age"/><br/>
性别:男<input type="radio" name="sex" value="男" checked="checked"/><br/>女<input type="radio" name="sex " value="女"/><br/>
<input type="submit" value="注册"></input>
</body>
</html>
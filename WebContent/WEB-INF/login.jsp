<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎访问人事管理系统</title>
</head>
<body>
<% if(request.getAttribute("msg")!=null)
	out.println(request.getAttribute("msh")+"</br>");
%>
登录
<hr/>
<form action="<%=request.getContextPath() %>/login_do" method="post">
用户名:<input type="text" name="username"/><br/>
密码:<input type="text" name="password"/><br/>
<input type="submit" value="登录" />
</form>
</body>
</html>
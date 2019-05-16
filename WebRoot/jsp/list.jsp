<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String username = (String)request.getAttribute("USERNAME");

if(username==null){
	Cookie[] cook =  request.getCookies();
	if(cook!=null){
		for(Cookie c:cook){
			if(c.getName().equals("USERNAME")){
				username = c.getValue();
			}
		}
	}
}

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title> 
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
           欢迎<%=username %>
    <a href="studentAction!preAdd.action">增加</a><br>
    <s:property value="number" /><br>
    <s:property value="name" /><br>
    <s:property value="sex" /> 
  </body>
</html>

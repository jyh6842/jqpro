<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{
		color : blue;
	}
	p{
		font-size : 30px;
		color : red;
	}
</style>
</head>
<body>
<%
	// 전송 요청시 입력된(선택된) 값을 전달한다.
	request.setCharacterEncoding("UTF-8");
	
	//request.getParameter("hobby"); // 값이 한개일 경우에
	String[] str = request.getParameterValues("hobby");
	out.print("<h2>당신의 취미는? ");
	for(int i = 0; i< str.length; i++){
		out.print(str[i] + "<br>");
	}
	out.print("입니다.</h2>");
	
%>
<br>
<br>
<p>당신의 취미는?<%=str[0] %></p>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: PC-14
  Date: 2020-04-24
  Time: 오전 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h2{
            color: aquamarine;
        }
    </style>
</head>
<body>
<h1>JSP : Java Server Page</h1>
웹을 통해 실행되는 자바<br>
스크립트릿 안에서 자바 문장을 기술 <br>
<%
    request.setCharacterEncoding("UTF-8");
    String user = request.getParameter("name");
    out.print("<h2>" + user + "님 환영합니다.<h2>");
%>
스크립트릿 밖에서 자바 문장을 기술
<h2>반갑습니다.</h2>
<%=user%>님
</body>
</html>

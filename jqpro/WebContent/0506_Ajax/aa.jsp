<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link href="../css/mystyle.css" rel="stylesheet">
</head>
<body>
<h1>JSP : Java Server Page</h1>
<%
    request.setCharacterEncoding("utf-8");

    String userId = request.getParameter("id");
    String userPw = request.getParameter("pw");
    out.print(userId + "님 반갑습니다.");

%>
<div class="box">
    <h2>환영합니다</h2>
    <div>
        <%= userId %>님 !! <br>
        모두들 안녕하세요~~~~
    </div>
</div>
</body>
</html>
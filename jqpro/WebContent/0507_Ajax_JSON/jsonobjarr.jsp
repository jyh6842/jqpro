<%--
  Created by IntelliJ IDEA.
  User: PC-14
  Date: 2020-05-07
  Time: 오전 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 요청시 전송되는 값은 없다.
    // 전송되는 값이 있다면?
    // 그 값을 받아서 그 값으로 처리(CRUD) 한다.
    // CRUD 결과값으로 응답데이터를 만든다.
    // 응답데이터는 text, json, xml 일 수도 있다.


    // jsonObj(객체)Arr(배열) 데이터를 응답데이터로 생성한다.
    // 실제 처리한 내용이 없기 때문에 임의의 문자열로 데이터를 생성하겠다.
%>
[
    {
    "name" : "홍길동",
    "id" : "a001",
    "tel" : "010-1234-5678",
    "addr" : "대전 중구 대흥동",
    "mail" : "kk@naver.com"
    },

    {
    "name" : "개나리",
    "id" : "a002",
    "tel" : "010-5678-9012",
    "addr" : "대전 중구 선화동",
    "mail" : "ll@naver.com"
    },

    {
    "name" : "진달래",
    "id" : "a003",
    "tel" : "010-3456-7890",
    "addr" : "대전 동구 판암동",
    "mail" : "aa@naver.com"
    },

    {
    "name" : "성춘향",
    "id" : "a004",
    "tel" : "010-1357-2468",
    "addr" : "대전 대덕구 송촌동",
    "mail" : "bb@naver.com"
    },

    {
    "name" : "이몽룡",
    "id" : "a005",
    "tel" : "010-2468-1357",
    "addr" : "대전 서구 등산동",
    "mail" : "jj@naver.com"
    }
]


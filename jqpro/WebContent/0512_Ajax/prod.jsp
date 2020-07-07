<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
   // request에 저장된 값을 가져온다
   List<ProdVO> list = (List<ProdVO>) request.getAttribute("whatName");

   // 하나씩 꺼내서 json데이터 배열 만들기
   int i = 0;
   for(ProdVO vo : list) {
      if(i > 0) {
         out.print(",");
      }
%>
   {
      "id" : "<%= vo.getProd_id() %>",
      "name" : "<%= vo.getProd_name() %>"
   }   
<%
   i++;
   }
%>
]

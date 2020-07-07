<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
	List<LprodVO> lp = (List<LprodVO>)request.getAttribute("reslist"); // controller 에서 쓴 reslist 사용
	
	// 결과 lp로 json object 배열을 생성한다.
	int i = 0;
	for(LprodVO vo : lp){
		if( i > 0) out.print(",");
		%>
		{<%--json 데이터가 들어갈 자리--%>
		"id" : "<%= vo.getLprod_id()%>",
		"gu" : "<%= vo.getLprod_gu()%>",
		"nm" : "<%= vo.getLprod_nm()%>"
		}
		<%
		i++;
	}
%>
]
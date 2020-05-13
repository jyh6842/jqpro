<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

[
<%
	// request에 저장된 값을 가져온다.
	List<BuyerVO> buyerList = (List<BuyerVO>) request.getAttribute("nameList");

// 하나씩 꺼내서 json 데이터 배열 만들기
int i = 0;
for(BuyerVO vo : buyerList){
	if( i > 0) out.print(",");
	%>
	{<%--json 데이터가 들어갈 자리--%>
		"id" : "<%= vo.getBuyer_id() %>",
		"name" : "<%= vo.getBuyer_name()%>"
	}
	<%
	i++;
}


%>
]

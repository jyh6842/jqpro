<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// request 에 저장된 값을 가져온다.
ProdVO pVO = (ProdVO)request.getAttribute("VO");

// 꺼내서 json VO 데이터 만들기

%>
{
	"id" : "<%= pVO.getProd_id() %>",
	"name" : "<%= pVO.getProd_name() %>",
	"lgu" : "<%= pVO.getProd_lgu() %>",
	"buyer" : "<%= pVO.getProd_buyer() %>",
	"cost" : "<%= pVO.getProd_cost( )%>",
	"price" : "<%= pVO.getProd_price() %>",
	"sale" : "<%= pVO.getProd_sale() %>",
	"outline" : "<%= pVO.getProd_outline() %>",
	"size" : "<%= pVO.getProd_size() %>",
	"color" : "<%= pVO.getProd_color() %>",
	"unit" : "<%= pVO.getProd_unit() %>"

}

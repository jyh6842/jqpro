<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    	// servlet에서 수행된 결과값 가져오기
    	BuyerVO vo = (BuyerVO)request.getAttribute("buyerVO");
    
    // json object 만들기
    %>
    
    {
    "id" : "<%= vo.getBuyer_id() %>",
    "lgu" : "<%= vo.getBuyer_lgu() %>",
    "name" : "<%= vo.getBuyer_name() %>",
    "mail" : "<%= vo.getBuyer_mail() %>",
    "comtel" : "<%= vo.getBuyer_comtel() %>",
    "bank" : "<%= vo.getBuyer_bank() %>",
    "bankname" : "<%= vo.getBuyer_bankname() %>",
    "bankno" : "<%= vo.getBuyer_bankno() %>",
    "zip" : "<%= vo.getBuyer_zip() %>",
    "add1" : "<%= vo.getBuyer_add1() %>",
    "add2" : "<%= vo.getBuyer_add2() %>"
    }
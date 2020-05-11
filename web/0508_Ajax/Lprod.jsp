<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
<%
//Lprod 테이블의 전체 데이터를 조회한다. 그 값을 받아서 그 값으로 처리(CRUD) 한다.
//조회한 결과값으로 응답데이터를 만든다.
//json Object Array 데이터를 응답데이터로 생성


// SqlMapClient 객체 얻어오기 => 어디서? SqlMapClientFactory에서 가져온다.
	SqlMapClient smc = SqlMapClientFactory.getInstance();
List<LprodVO> list = smc.queryForList("lprod.selectAll"); 

// 실행
int i = 0;
for(LprodVO vo : list){
	if(i > 0) out.print(",");
	%>
	{
		"id" : "<%= vo.getLprod_id() %>",
		"gu" : "<%= vo.getLprod_gu() %>",
		"nm" : "<%= vo.getLprod_nm() %>"
	}
<%
i++;
}
// JSON 데이터가 들어가 자리


%>
]
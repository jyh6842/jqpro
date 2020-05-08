<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

[
<%
// 요청시 전송되는 값은 없다.
// 전송되는 값이 있다면?
// member 테이블의 전체 데이터를 조회한다. 그 값을 받아서 그 값으로 처리(CRUD) 한다.
// 조회한 결과값으로 응답데이터를 만든다.
// json Object Array 데이터를 응답데이터로 생성


	// SqlMapClient 객체를 얻어온다.
	SqlMapClient smc = SqlMapClientFactory.getInstance();

	// 그 객체를 가지고  mapper를 실행한다. mapper 의 sql 쿼리문을 수행한다.
	List<MemberVO> list = smc.queryForList("member.selectAllMember");
	
	// 쿼리 수행 결과로  json_object_array 데이터를 생성
	int i = 0;
	for(MemberVO vo : list){
		// 배열이면 for 문 수행하기 전에 대괄호가 나와야 한다.
		if(i > 0) out.print(',');
%>

{
    "name" : "<%= vo.getMem_name() %>",
    "id" : "<%= vo.getMem_id() %>",
    "tel" : "<%= vo.getMem_hp() %>",
    "addr" : "<%= vo.getMem_add1() %>",
    "mail" : "<%= vo.getMem_add2() %>"
    }
<%
i++;
}
%>
 ]
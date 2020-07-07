package kr.or.ddit.lprod.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.lprod.vo.LprodVO;

/**
 * Servlet implementation class LProdServelet
 */
@WebServlet(name = "LProdServlet", urlPatterns = "/LProdServlet")
public class LProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
//		PrintWriter out = response.getWriter(); //  out.print를 쓰려면 생성한다.
		
		// 0. 클라이언트 전송(요청시) 파라미터 값을 전달 받는다.
		
		// 1. service 객체를 얻어온다.
		ILprodService service = LprodServiceImpl.getInstance();
		
		// 2. service method 호출
		List<LprodVO> list = service.selectAll();
		
//		int i = 0;
//		out.print("<table>");
//		for(LprodVO vo : list) {
//			out.print("<tr>");
//			out.print("<td>아이디 : " + vo.getLprod_id() + "</td>");
//			out.print("<td>구분 :  " + vo.getLprod_gu() + "</td>");
//			out.print("<td>이름 : " + vo.getLprod_nm() + "</td>");
//			out.print("<tr>");
//		}
//		out.print("</table>");
//		
//		out.print("<style>");
//		out.print("td")
		

		// 3. request에 저장 - forword
		request.setAttribute("reslist", list); // reslist 매개변수는 아무거나 주어도 된다. 진짜 값은 list이다. 
												//reslist는 view(jsp) 페이지에서 사용할 이름이다.
		
		RequestDispatcher disp = request.getRequestDispatcher("/0508_Ajax/Lprod2.jsp"); // 매개변수로 jsp 페이지를 주는 것이다.
		
		// 4. 출력을 위한 view(jsp) 페이지로 이동
		disp.forward(request, response);
		
		 
		
	}

}

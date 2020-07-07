package kr.or.ddit.prod.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.prod.vo.ProdVO;

/**
 * Servlet implementation class ProdServlet
 */
@WebServlet(name = "Prod.do", urlPatterns = "/Prod.do")
public class ProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// lprod에 해당하는 상품들 가져오기
		
		// 0. 요청시 전송되는 데이터를 받는다.
		String gu = request.getParameter("prod_gu");
		
		// 1. service 객체 얻어오기
		IProdService service = ProdServiceImpl.getInstance();
		
		// 2. service 메소드 호출하기 - 결과값 가져오기
		List<ProdVO> pVO= service.selectProd(gu);
		
		// 3. 결과를 request 에 저장하기
		request.setAttribute("whatName", pVO); // jsp에서 사용할 이름 whatName
		
		// 4. jsp로 forword 하기
		request.getRequestDispatcher("0512_Ajax/prod.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// prod 상품의 상세정보 가져오기
		
		// 0. 요청시 전송되는 데이터를 받는다.
		
		// 1. service 객체 얻어오기
		
		// 2. service 메소드 호출하기 - 결과값 가져오기
		
		// 3. 결과를 request 에 저장하기
		
		// 4. jsp로 forword 하기
		request.getRequestDispatcher("0512_Ajax/prod2.jsp").forward(request, response);
	}

}

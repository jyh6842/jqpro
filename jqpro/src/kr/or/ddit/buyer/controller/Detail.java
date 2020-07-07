package kr.or.ddit.buyer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;

/**
 * Servlet implementation class Detail
 */
@WebServlet("/Detail.do")
public class Detail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 클라이언트 전송(요청시) 파라미터값을 전달받는다.

		String id = request.getParameter("id");
		
		// 1. service 객체 얻어온다.
		IBuyerService service = BuyerServiceImpl.getInstance();

		// 2. service 메소드 호출 - 결과 값 가져오기
		BuyerVO vo = service.buyerDetail(id);
		
		// 3. 결과값을 request 에 저장하기
		request.setAttribute("buyerVO", vo); // buyerVO 는 jsp 에 사용할 것이다.
		

		// 4.  출력(json 데이터 생성)을 위한 view 페이지(jsp)로 이동
		RequestDispatcher disp = request.getRequestDispatcher("0511_Ajax/detail.jsp");
		disp.forward(request, response);

		// servelt에서도 출력이 가능하나 out.print 해야 한다.
		
	}

}

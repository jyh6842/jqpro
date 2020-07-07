package kr.or.ddit.buyer.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class BuyerNameList
 */
@WebServlet("/NameList.do")
public class BuyerNameList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerNameList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 0. 클라이언트 전송(요청시) 파라미터 값을 전달받는다.
		
		// 1. service 객체 얻어오기
		IBuyerService service = BuyerServiceImpl.getInstance();
		
		// 2. service 메솧드 호출하기 - 결과값 가져오기
		List<BuyerVO> list = service.selectBuyerList();
		
		// 3. 결과값을 request 에 저장하기
		request.setAttribute("nameList", list);
		
		
		// 4. 출력(json 데이터 생성)을 위한 view 페이지 (jsp) 로 이동
		RequestDispatcher disp = request.getRequestDispatcher("0511_Ajax/nameList.jsp");
		
		//4. 출력(json 데이터 생성)을 위한 view 페이지 (jsp) 로 이동
		disp.forward(request, response);
		
		
		
	}

}

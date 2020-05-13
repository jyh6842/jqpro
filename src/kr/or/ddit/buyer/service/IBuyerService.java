package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerService {
	/**
	 * 모든 Buyer의 id와 name을 가져올 수 있도록 한다.
	 * @return
	 */
	public List<BuyerVO> selectBuyerList();
	
	/**
	 * 아이디를 누르면 더 자세히 나오도록 한다.
	 * @param id를 받아서 
	 * @return BuyerVO로 준다.
	 */
	public BuyerVO buyerDetail(String id);
}

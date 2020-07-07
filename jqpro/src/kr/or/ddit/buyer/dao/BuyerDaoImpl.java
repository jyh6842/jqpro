package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;

public class BuyerDaoImpl implements IBuyerDao{

	// 여기서 필요한 것
	private SqlMapClient smc;
	
	// 자기자신의 객체 - service 가 사용
	private static IBuyerDao dao;
	
	// 생성자 - 필요한 것 가져오기
	private BuyerDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	// 자기 자신의 객체를 생성하고 리턴
	public static IBuyerDao getInstance() {
		if(dao == null) {
			dao = new BuyerDaoImpl();
		}
		return dao;
	}
	
	
	@Override
	public List<BuyerVO> selectBuyerList() {
		List<BuyerVO> list = null;
		try {
			list = smc.queryForList("buyer.selectBuyerList");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public BuyerVO buyerDetail(String id) {
		BuyerVO vo = null;
		
		try {
			vo = (BuyerVO) smc.queryForObject("buyer.buyerDetail", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
}

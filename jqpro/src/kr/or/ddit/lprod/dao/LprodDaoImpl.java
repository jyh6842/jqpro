package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodDaoImpl implements ILprodDao{
// db 수행 - SqlMapClient
// 자기 자신의 객체 생성 리턴하기
	private SqlMapClient smc;
	private static ILprodDao dao; // service가 dao를 사용할 것이다.
	
	// 생성자
	private LprodDaoImpl() {
		// 생성자는 자신이 필요한 객체를 만드는 것이다.
		smc = SqlMapClientFactory.getInstance();
	}
	public static ILprodDao getInstance() { //service에서 dao를 사용할 것이다.
		if(dao == null) {
			dao = new LprodDaoImpl();
		}
		return dao;
	}
	
	
	@Override
	public List<LprodVO> selectAll() {
		List<LprodVO> list = null;
		
		try {
			list = smc.queryForList("lprod.selectAll");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}

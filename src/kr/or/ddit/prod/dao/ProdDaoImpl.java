package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao{
	
	private SqlMapClient smc;

	private static IProdDao dao;
	
	private ProdDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IProdDao getInstance() {
		if(dao == null) {
			dao = new ProdDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<ProdVO> selectProd(String lgu) throws SQLException{
		List<ProdVO> list = null;
		
			list = smc.queryForList("prod.selectProd", lgu);
	
		return list;
	}

	@Override
	public ProdVO ProdDetail(String id) throws SQLException{
		ProdVO pVO = null;
		
			pVO = (ProdVO) smc.queryForObject("prod.ProdDetail", id);
		
		return pVO;
	}
	
	
}

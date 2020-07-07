package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdDao {
	
	public List<ProdVO> selectProd(String lgu) throws SQLException;
	public ProdVO ProdDetail(String id) throws SQLException;
}

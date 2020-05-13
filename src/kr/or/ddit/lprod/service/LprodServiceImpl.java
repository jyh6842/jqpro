package kr.or.ddit.lprod.service;

import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodServiceImpl implements ILprodService{
// service 에서 필요한 것 - dao 객체가 필요
	private ILprodDao dao;
// 자신의 객체를 생성해야 한다. 그리고 리턴 한다.
	private static ILprodService service;
	
	// 생성자에서 하는 일  - 자기가 필요한 객체를 가져오는 것이다. 얻어오는 것이다. dao
	private LprodServiceImpl() {
		dao = LprodDaoImpl.getInstance();
	}
	
	public static ILprodService getInstance() {
		if(service == null) {
			service = new LprodServiceImpl();
		}
		return service;
	}
	
	
	
	@Override
	public List<LprodVO> selectAll() {
		//List<LprodVO> list = null;
		//list = dao.selectAll();
		//return list;
		
		return dao.selectAll();
	}

}

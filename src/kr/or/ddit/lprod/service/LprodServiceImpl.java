package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;
import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;

public class LprodServiceImpl implements ILprodService{
	private ILprodDao dao;
	private static ILprodService service;
	
	private LprodServiceImpl() {
		dao = LprodDaoImpl.getDao();
	}
	
	public static ILprodService getService() {
		if(service == null) service = new LprodServiceImpl();
		
		return service;
	}
	@Override
	public List<LprodVO> getall() {
		List<LprodVO> list =null;
		
			try {
				list = dao.getall();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		return list;
	}
}

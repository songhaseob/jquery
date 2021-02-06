package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.lprod.vo.LprodVO;
import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;

public class LprodDaoImpl implements ILprodDao{
	private SqlMapClient smc;
	private static ILprodDao dao;
	
	private LprodDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static ILprodDao getDao() {
		if(dao == null) dao = new LprodDaoImpl();
		
		return dao;
	}
	
	@Override
	public List<LprodVO> getall() throws SQLException {
		
		return smc.queryForList("lprod.getall");
		
	}
	

}

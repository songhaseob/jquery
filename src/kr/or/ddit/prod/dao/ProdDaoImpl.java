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
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IProdDao getDao() {
		if(dao == null) dao = new ProdDaoImpl();
		
		return dao;
	}

	@Override
	public List<ProdVO> getall() throws SQLException {
		
		return smc.queryForList("prod.getall");
	}

	@Override
	public List<ProdVO> getSelect(String prod_lgu) throws SQLException {
		
		return  smc.queryForList("prod.getSelect",prod_lgu);
	}

	@Override
	public List<ProdVO> getDetail(String prod_lgu) throws SQLException {
		return smc.queryForList("prod.getdetail",prod_lgu);
	}
}

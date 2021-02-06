package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;
/*
 *  SqlmapClient객체 얻어오기 - mapper를 수행하기 위함
 *  자신의 객체를 생성하고 return 하기 - service를 위해서
 */

public class BuyerDaoImpl implements IBuyerDao {

	private SqlMapClient smc;
	private static IBuyerDao dao;

	private BuyerDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	public static IBuyerDao getDao() {
		if (dao == null)
			dao = new BuyerDaoImpl();

		return dao;
	}

	@Override
	public List<BuyerVO> getByuerNames() throws SQLException {

		return smc.queryForList("buyer.getByuerNames");
	}

	@Override
	public BuyerVO getDetail(String id) throws SQLException {

		return (BuyerVO) smc.queryForObject("buyer.getDetail",id);
	}

}

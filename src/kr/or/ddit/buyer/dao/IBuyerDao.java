package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerDao {
		// 전체 이름과 id를 가져오기
		public List<BuyerVO> getByuerNames() throws SQLException;
		
		// id를 조건으로 조회
		public BuyerVO getDetail(String id) throws SQLException;
}

package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdDao {
	public List<ProdVO> getall() throws SQLException;
	
	public List<ProdVO> getSelect(String prod_lgu) throws SQLException;
	public List<ProdVO> getDetail(String prod_lgu) throws SQLException;
	
}

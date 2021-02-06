package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {

	public List<ProdVO> getall();
	
	public List<ProdVO> getSelect(String prod_lgu);
	public List<ProdVO> getDetail(String prod_lgu);
}

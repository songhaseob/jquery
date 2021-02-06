package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerService {
	// 전체 이름과 id를 가져오기
	public List<BuyerVO> getByuerNames();
	
	// id를 조건으로 조회
	public BuyerVO getDetail(String id);
	
}

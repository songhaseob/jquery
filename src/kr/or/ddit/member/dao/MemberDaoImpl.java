package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;
/*
 * SqlMapClient 객체 얻어오기
 * 자신의 daoImpl객체 생성 하고 리턴 하는 메서드 - service에서 사용하기 위함
 */
public class MemberDaoImpl implements IMemberDao {
	private SqlMapClient smc;
	private static IMemberDao dao;
	
	//다른곳에서 생성을 못하게..
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IMemberDao getDao() {
		if(dao == null) dao = new MemberDaoImpl();
		
		return dao;
	}
	@Override
	public List<MemberVO> getAllMember() throws SQLException {
		
		return smc.queryForList("mymember.getAllMember"); // 모두다 출력
		//queryForObject 결과값 하나만 출력
	}

	@Override
	public String selectById(String id) throws SQLException {
		return (String) smc.queryForObject("mymember.selectById",id);
	}

	@Override
	public List<ZipVO> selectByDong(String dong) throws SQLException {
		return smc.queryForList("mymember.selectByDong", dong);
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		return (String)smc.insert("mymember.insertMember", vo);
	}

}

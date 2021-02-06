package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.vo.LprodVO;
import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService{

		private IProdDao dao;
		private static IProdService service;
		
		private ProdServiceImpl() {
			dao = ProdDaoImpl.getDao();
		}
		
		public static IProdService getService() {
			if(service == null) service = new ProdServiceImpl();
			
			return service;
		}

		@Override
		public List<ProdVO> getall() {
			List<ProdVO> list = null;
			
			try {
				list = dao.getall();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return list;
		}

		@Override
		public List<ProdVO> getSelect(String prod_lgu) {
		
			List<ProdVO> list = null;
			try {
				list = dao.getSelect(prod_lgu);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		@Override
		public List<ProdVO> getDetail(String prod_lgu) {
			List<ProdVO> list = null;
			try {
				list = dao.getDetail(prod_lgu);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}

		
}

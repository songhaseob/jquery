package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/List.do")
public class MemberList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /*
        * 0. 클라이언트 요청(전송)시 전송되는 데이터를 받는다.
        * 1. service객체 얻어오기 service -> dao -> controller
        * 2. service 메소드 호출 - 결과를 받는다
        * 3. request객체에 결과를 저장한다
        * 4. 결과로 출력하거나 json데이터 생성한다.
        * jsp페이지로 forward
        */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IMemberService service = MemberServiceImpl.getService();
		
		List<MemberVO> list = service.getAllMember();
		
		request.setAttribute("listvalue", list);
		request.getRequestDispatcher("1127/memberList.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

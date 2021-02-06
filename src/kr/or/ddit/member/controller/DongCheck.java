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
import kr.or.ddit.member.vo.ZipVO;

@WebServlet("/DongCheck")
public class DongCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DongCheck() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post로 전송시 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//0. 클라이언트 전송시 데이터 받는다 - 입력한 id
		String inputDong = request.getParameter("dong");
		//1. Service 객체 얻기
		IMemberService service = MemberServiceImpl.getService();
		
		//2. Service 메소드 호출 - 결과값 얻기
		List<ZipVO> list = service.selectByDong(inputDong);
		
		//3. 결과값 request에 저장
		request.setAttribute("listvalue", list);
		
		//4. jsp로 forward
		request.getRequestDispatcher("1130/dongResult.jsp").forward(request, response);
		
		
	}

}

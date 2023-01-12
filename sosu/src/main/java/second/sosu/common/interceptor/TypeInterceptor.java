package second.sosu.common.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//회원 유형별 접근 가능한 url을 설정한 인터셉터
public class TypeInterceptor extends HandlerInterceptorAdapter{
	protected Log log = LogFactory.getLog(TypeInterceptor.class);
//
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//			Object handler) throws Exception {
//		HttpSession session = request.getSession();
//		//m_type이 일반:0, 사업주:1, 관리자: 2
//		String m_type = (session.getAttribute("m_type")==null)?null:session.getAttribute("m_type").toString();
//		String msg = null;//출력 메세지
//		String re_url = null;//리다이렉트 경로
//		boolean flag = true;
//		//접근 경로
//		String req_url = request.getRequestURI();
//		String start_url = req_url.split("/")[1];//시작 경로
//		log.debug(req_url);//로그 찍기
//		if(m_type != null) {//세션에 타입이 있다면 == 로그인을 했다면
//			switch (m_type) {
//			case "2": //m_type이 관리자:2 일 때 /admin/~로 시작하는 경로만 접근 가능
//				if(!(
//						start_url.equals("admin")
//						
//						)) {
//					msg = "admin페이지만 접근 가능합니다!";
//					re_url = "/admin/userList";
//					flag = false;
//				}
//				break;
//			case "0": //m_type이 일반:0 일 때 /admin/~, /owner/~ 로 시작하는 모든 경로는 접근 불가
//				if(start_url.equals("admin") || start_url.equals("owner")) {
//					msg = "admin 페이지와 사업주 페이지는 접근이 불가한 회원 유형입니다!";
//					flag = false;
//					re_url = "/main";
//				}
//				break;
//			case "1": //m_type이 사업주:1 일 때 /admin/~로 시작하는 모든 경로는 접근 불가
//				if(start_url.equals("admin")) {
//					msg = "admin 페이지는 접근이 불가한 회원 유형입니다!";
//					flag = false;
//					re_url = "/main";
//				}
//				break;
//			}
//		}else if(start_url.equals("admin") || start_url.equals("user") || start_url.equals("owner")){//로그인을 안했다면
//			//url이 /admin~, /user~, /owner~ 로 시작하는 모든 경로는 접근 불가
//			msg = "미 로그인시 접근할 수 없는 페이지 입니다!";
//			re_url = "/login";
//			flag = false;
//		}
//		if(!flag && !(
//				start_url.equals("login")
//				|| start_url.equals("logout")
//				|| start_url.equals("resources")
//				|| start_url.equals("include"))) {
//			//뒤로가기 처리
//			response.setContentType("text/html; charset=utf-8");
//			PrintWriter w = response.getWriter();
//			w.println("<html>"
//					+ "<head>"
//					+ "<title>접근 불가 페이지</title>"
//					+ "<script>alert('"+msg+"'); location.href='"+re_url+"';</script>"
//					+ "</head><body></body>"
//					+ "</html>");
//			w.close();
//			return false;
//		}
//		return super.preHandle(request, response, handler);
//	}
}
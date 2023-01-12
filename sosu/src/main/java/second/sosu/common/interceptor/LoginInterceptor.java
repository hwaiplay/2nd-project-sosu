package second.sosu.common.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//url이 /login~, /join~ 로 시작하는 경로에 대한 인터셉터
public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		HttpSession session = request.getSession();
		Object m_type_obj = session.getAttribute("m_type");
		String re_url = null;//리다이렉트 경로
		if(m_type_obj != null) {//세션에 타입이 있다면 == 로그인을 했다면
			if(Integer.parseInt(m_type_obj.toString()) == 2) re_url = "location.href='/admin/userList';";
			else re_url = "location.href='/main';";
			//뒤로가기 처리
			response.setContentType("text/html; charset=utf-8");
			PrintWriter w = response.getWriter();
			w.println("<html>"
					+ "<head>"
					+ "<title>접근 불가 페이지</title>"
					+ "<script>"
					+ "alert('로그인 중 접근할 수 없는 페이지 입니다!');"
					+ re_url
					+ "</script>"
					+ "</head><body></body>"
					+ "</html>");
			w.close();
			return false;
		}
		return super.preHandle(request, response, handler);
	}
}
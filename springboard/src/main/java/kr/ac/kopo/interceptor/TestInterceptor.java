package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.kopo.member.vo.MemberVO;

@Component
public class TestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        System.out.println("TestInterceptor preHandle()");
        // 로그인 안되어 있는 경우에는 return false를 하고,
        // redirect를 해서 login.jsp로 보낸다.
        // http://localhost:8080/springboard/login

        System.out.println(request.getContextPath());
        System.out.println(request.getServletPath());
        System.out.println(request.getRequestURI());

        HttpSession session = request.getSession();
        // 정상 login시에 등록했음. POST /login
        MemberVO memberVO = (MemberVO) session.getAttribute("currentUser");

        session.setAttribute("dest", request.getServletPath());

        if (memberVO != null) { // 로그인 되어 있는 경우. true를 return 하여 handler에게 넘김
            return true;
        } else {
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

}

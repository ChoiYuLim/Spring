package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle 동작입니다.");
        
    }

    // loginInterceptorㄹ는 이름으로 instance를 생성함
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        System.out.println("prewHandle 동작입니다.");
        //로그인 안했으면, 로그인 하세요
        //login.jsp 화면으로 이동
        return true;
    }

}

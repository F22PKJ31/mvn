package com.sac.filter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sac.dao.SacStudentMapper;
import com.sac.pojo.SacStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogFilter implements HandlerInterceptor {

    @Autowired
    private SacStudentMapper studentMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // TODO Auto-generated method stub
        Cookie[] cookies = request.getCookies();
        if (cookies!=null) {
            for (Cookie cookie : cookies) {
                if ("session".equals(cookie.getName())) {
                    SacStudent student = studentMapper.selectByPrimaryKey(Integer.valueOf(cookie.getValue()));
                    HttpSession session = request.getSession();
                    session.setAttribute("Login", student);
                    return true;
                }
            }
        }
        String contextPath = request.getServletPath();
        if (contextPath.startsWith("/mes")){
            response.sendRedirect(contextPath + "/mes.do?mes=您还未登录，请登录");
            return false;
        }
        return true;


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }


}

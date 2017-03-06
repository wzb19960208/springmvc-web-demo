package com.binbin.filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by weizhibin on 2017/3/3.
 */
//@WebFilter(filterName="myFilter",urlPatterns="/*")
public class ErrorFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {


        System.out.println("执行过滤操作");
        //重定向
//        request.getRequestDispatcher("/WEB-INF/views/errorPage.jsp")
//                .forward(request, response);


//        try {
//            filterChain.doFilter(request, response);
//            System.out.println("执行过滤操作");
//        } catch (Exception ex) {
//            System.out.println("页面出问题了");
//            ex.printStackTrace();
//            request.setAttribute("errorMessage", ex);
//            request.getRequestDispatcher("/WEB-INF/views/errorPage.jsp")
//                    .forward(request, response);
//        }


    }

    @Override
    public void destroy() {

        System.out.println("过滤器销毁");

    }


}

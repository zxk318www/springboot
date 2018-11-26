package example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: test
 * @description: 自定义拦截器2
 * @author: Zhangxike
 * @create: 2018-11-02 16:50
 **/

public class MyInterceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println(">>>MyInterceptor2>>>>>>>>>>>在请求处理之前调用（Controller方法调用之前）");
        //只有返回true才会继续向下执行，返回false取消当前请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println(">>>MyInterceptor2>>>>>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println(">>>MyInterceptor2>>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet渲染了对应的视图之后执行，主要进行资源清理工作");
    }
}

package example.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: test
 * @description: 自定义过滤器
 * @author: Zhangxike
 * @create: 2018-11-02 16:20
 **/
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
public class MyFilter implements Filter {

    /**
     * 使用注解标注过滤器
     * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
     * 属性filterName声明过滤器的名称，可选
     * 属性urlPatterns指定要过滤的URL模式，也可以使用属性value声明（指定要过滤的URL模式是必选属性）
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}

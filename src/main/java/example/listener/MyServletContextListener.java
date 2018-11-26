package example.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @program: test
 * @description: ServletContext监听文件
 * @author: Zhangxike
 * @create: 2018-11-02 16:33
 **/
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext初始化");
        System.out.println(servletContextEvent.getServletContext().getServerInfo());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext销毁");
    }
}

package example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @program: test
 * @description: springboot启动入口
 * @author: Zhangxike
 * @create: 2018-11-02 14:32
 **/
@SpringBootApplication
@ServletComponentScan
@MapperScan("example.object.dao")
public class DemoApplcation {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplcation.class);
    }

    /**
     * 修改DispatcherServlet默认配置
     * 开启拦截器时需要禁用代码
     * @param dispatcherServlet
     * @return
     */
//    @Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean(dispatcherServlet);
//        registrationBean.getUrlMappings().clear();
//        registrationBean.addUrlMappings("*.do");
//        registrationBean.addUrlMappings("*.json");
//        return registrationBean;
//    }
}

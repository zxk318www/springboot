package example.config;

import example.interceptor.MyInterceptor1;
import example.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: test
 * @description: configuration
 * @author: Zhangxike
 * @create: 2018-11-02 16:51
 **/

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //多个拦截器组成一个拦截器链
        //addPathPatterns 用于添加拦截器规则
        //excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myresPic/");
        //使用外部资源文件时 需要添加file：
        registry.addResourceHandler("/pic/**").addResourceLocations("file:C:/Users/Zhangsnke/Pictures/Saved Pictures/");
        super.addResourceHandlers(registry);
    }
}

package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * @program: test
 * @description: 测试Controller
 * @author: Zhangxike
 * @create: 2018-11-02 15:13
 **/
@RequestMapping("page")
@Controller
public class PageController {

    @Value("${application.hello:Hello Zhangsnke}")
    private String hello = "Hello，Snke Zhang";

    /**
     * 默认页
     * @RequestMapping("/")和@RequestMapping 区别：
     *      如果不写参数，则为全局默认页面，加入输入404页面，也会自动访问到这个页面
     *      如果家里参数"/" 只认为是根页面
     * @param model
     * @return
     */
    @RequestMapping(value = {"/","/hi"})
    public String index(Map<String,Object> model){
        //直接返回字符串，默认回去spring.view.prefix目录下 index拼接spring.view.suffix
        // 本例 /WEB-INF/jsp/index.jsp
        model.put("time",new Date());
        model.put("message",this.hello);
        return "index";
    }

    @RequestMapping("/page1")
    public ModelAndView page1(){
        ModelAndView model = new ModelAndView("page/page1");
        model.addObject("content",hello);
        return model;
    }

    @RequestMapping("/page2")
    public String page2(Model model){
        model.addAttribute("content",hello+"(第二种)");
        return "page/page1";
    }
}

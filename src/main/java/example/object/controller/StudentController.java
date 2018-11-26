package example.object.controller;

import example.model.AjaxReturn;
import example.object.entry.Student;
import example.object.service.StudentService;
import example.object.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: test
 * @description: 学生事物Controller
 * @author: Zhangxike
 * @create: 2018-11-26 14:30
 **/
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/index")
    public String studentIndex(){
        return "studentIndex";
    }


    /**
     * 根据学生姓名获取学生
     * @param name 学生姓名
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getData",produces = "application/json; charset=utf-8")
    public AjaxReturn<Student> getData(String name){
        Student vo = studentService.findStudentByName(name);
        if (vo!=null){
            return new AjaxReturn<Student>(true,"获取成功",vo);
        }else {
            return new AjaxReturn<Student>(false,"未查到该用户",null);
        }

    }
}

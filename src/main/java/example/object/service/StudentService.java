package example.object.service;

import example.object.entry.Student;

/**
 * @program: test
 * @description: 学生业务逻辑接口类
 * @author: Zhangxike
 * @create: 2018-11-26 14:38
 **/
public interface StudentService {

    /**
     * 根据学生姓名查找学生
     * @param name 学生姓名
     * @return
     */
    Student findStudentByName(String name);
}

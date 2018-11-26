package example.object.service.impl;

import example.object.entry.Student;
import example.object.dao.StudentDao;
import example.object.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: test
 * @description: 学生业务逻辑实现类
 * @author: Zhangxike
 * @create: 2018-11-26 14:40
 **/
@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    /**
     * 根据学生姓名获取学生信息
     * @param name 学生姓名
     * @return
     */

    @Override
    public Student findStudentByName(String name) {
        return studentDao.findStudentByName(name);
    }
}

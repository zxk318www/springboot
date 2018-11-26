package example.object.dao;

import example.object.entry.Student;
import org.apache.ibatis.annotations.Param;

/**
 * 学生Dao 接口类
 */
public interface StudentDao {

    /**
     * 根据学生姓名获取
     * @param name 学生姓名
     * @return
     */
    Student findStudentByName(@Param("name") String name);
}

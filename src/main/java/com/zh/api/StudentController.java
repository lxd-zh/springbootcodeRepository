package com.zh.api;

import com.zh.annotation.SwaggerUIAnncation;
import com.zh.pojo.Student;
import com.zh.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *此控制的所有方法都给前端提供API方法
 *
 */
//@Controller
//@ResponseBody
@RestController //这个注解相当于上面两个
@RequestMapping("/student")
public class StudentController {

    /**
     *根据id查询用户信息
     *
     * @param id
     * @return
     */
//    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("/selectById")
    @SwaggerUIAnncation
    public Student selectById(Integer id){

        return new Student(id,"玄翦","123","123456");
    }

    @PostMapping("/insert")
    public Student insert(Student student){
        return student;
    }

    @PostMapping("/update")
    public Student update(Student student){
        return student;
    }

}

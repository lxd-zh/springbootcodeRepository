package com.zh.controller;

import com.zh.pojo.Student;
import com.zh.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *此控制的所有方法都给前端提供API方法
 *
 */
//@Controller
//@ResponseBody
@RestController //这个注解相当于上面两个
@RequestMapping("/user")
@Api(value = "用户api",tags = {"用户","用户的api信息"})
public class UserController {

    /**
     *根据id查询用户信息
     *
     * @param id
     * @return
     */
//    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @GetMapping("/selectById")
    public User selectById(@ApiParam(value = "记住是id",example = "100",required = true) Integer id){

        return new User(id,"纵横","123","123456");
    }

    @PostMapping("/insert")
    @ApiOperation(value = "根据主键id查询用户信息",notes = "这都看不懂你还搞什么开发")
    @ApiIgnore//忽略生成API文档
    public User insert(User user){
        return user;
    }
}

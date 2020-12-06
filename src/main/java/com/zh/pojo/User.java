package com.zh.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "这是学生对象",description = "这是学生对象")
public class User {
    private Integer id;
    @ApiModelProperty(name = "",value = "姓名")
    private String username;
    private String  password;
    private String phone;
}

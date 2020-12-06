package com.zh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//表示这个注解只能贴在方法使用
@Retention(RetentionPolicy.RUNTIME)//表示注解保留在运行时
public @interface SwaggerUIAnncation {

}

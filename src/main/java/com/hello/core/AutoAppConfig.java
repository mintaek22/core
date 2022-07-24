package com.hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
//@Component 붙은 클래스를 자동으로 빈 등록
@ComponentScan(
        //특정 패키지 정하기
        //default는 현재 클래스의 패키지
        basePackages = "hello.core",
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))
public class AutoAppConfig{
}

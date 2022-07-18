package com.hello.core;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {

        //스프링 컨테이너(스프링 빈 관리)
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
        //parameter 메서드이름,반환타입
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member=new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+member.getName());
        System.out.println("find Member = "+findMember.getName());
    }

}

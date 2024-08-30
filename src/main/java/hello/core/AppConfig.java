package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//객체의 생성과 연결 담당
public class AppConfig {//실제 동작에 필요한 구현 객체를 생성

    @Bean
    public MemberService memberService() {//생성자 주입
        return new MemberServiceImpl(MemberRepository());
    }

    @Bean
    private static MemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(MemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {//할인 정책역할을 담당하는 구현객체를 변경
        return new RateDiscountPolicy();
//        return new FixDiscountPolicy();
    }
}

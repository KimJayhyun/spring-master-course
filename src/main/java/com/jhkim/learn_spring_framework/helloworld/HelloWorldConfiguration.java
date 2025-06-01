package com.jhkim.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Java Bean을 만들 때의 반복적인 코드를 제거합니다.
// Public accessor methods, constructor, equals, hashCode, toString 메서드가 자동으로 생성됩니다.
// JDK 16에서 도입되었습니다.

record Person(String name, int age, Address address) {}
record Address(String city, String street) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Kimjayhyun";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("jhkim", 20, new Address("Seoul", "SeoDaemon-gu"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3MParameterSet(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }
    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Seoul", "Gangnam-gu");
    }
    @Bean(name = "address3")
    public Address address3() {
        return new Address("Seoul", "SeoCho-gu");
    }
}

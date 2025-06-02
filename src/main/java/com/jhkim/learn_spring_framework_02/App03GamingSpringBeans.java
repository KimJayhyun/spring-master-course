package com.jhkim.learn_spring_framework_02;

import com.jhkim.learn_spring_framework_02.game.GamingConsole;
import com.jhkim.learn_spring_framework_02.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jhkim.learn_spring_framework_02.game")
public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            var gameRunner = context.getBean(GameRunner.class);

            gameRunner.run();
        }
    }
}

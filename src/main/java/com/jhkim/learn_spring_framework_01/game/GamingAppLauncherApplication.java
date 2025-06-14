package com.jhkim.learn_spring_framework_01.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jhkim.learn_spring_framework_01.game")
public class GamingAppLauncherApplication{

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            var gameRunner = context.getBean(GameRunner.class);

            gameRunner.run();
        }
    }
}

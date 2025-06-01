package com.jhkim.learn_spring_framework;

import com.jhkim.learn_spring_framework.game.GameRunner;
import com.jhkim.learn_spring_framework.game.GamingConfiguration;
import com.jhkim.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            var gameRunner = context.getBean(GameRunner.class);

            gameRunner.run();
        }
    }
}

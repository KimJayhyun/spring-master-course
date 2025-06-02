package com.jhkim.learn_spring_framework_01;

import com.jhkim.learn_spring_framework_01.game.GameRunner;
import com.jhkim.learn_spring_framework_01.game.PackmanGame;

public class App01GamingBasic {

    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PackmanGame(); // 1: Object Creation

        // 2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        var gameRunner = new GameRunner(game);


        gameRunner.run();
    }
}

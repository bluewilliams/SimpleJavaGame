package com.velsoft;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        initGame();
    }

    static void initGame() {
        boolean gameActive = true;

        initFormComponent();

        // main game loop
        while (gameActive) {
            // do stuff
            System.out.print(GameLogic.helloGame());
        }
    }

    static void initFormComponent() {
        // do any layout and event wire-up here
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(500, 500);
        frame.add(panel);
        frame.setVisible(true);
    }
}
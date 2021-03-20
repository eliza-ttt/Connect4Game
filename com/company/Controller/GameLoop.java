package com.company.Controller;

import com.company.View.GUI;

public class GameLoop {

    public GameLoop() {
        Connect4Game game = new Connect4Game("R", "Y", 6, 7);
        GUI ourGUI = new GUI(game.isIs1playing(), game, 6, 7);
    }

}

package model.managers;

import model.games.Craps;

public class BetManager {
    private Craps currentGame;

    public BetManager(Craps game) {
        this.currentGame = game;
    }

    public void squareUpBets() {
        int wins = currentGame.getWins();
        int losses = currentGame.getLosses();
        System.out.println("Betting is all good!");
    }

}

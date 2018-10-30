package model.games;

import model.components.Die;

public class Craps {
    private Long id;
    private static final String NAME = "craps";
    private Die dice;
    private int point;
    private int wins;
    private int losses;
    private int minBet;

    //constructors
    public Craps(Die dice) {
        this.dice = dice;

    }

    public Craps() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getMinBet() {
        return minBet;
    }

    public void setMinBet(int minBet) {
        this.minBet = minBet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getNAME() {
        return NAME;
    }

    public Die getDice() {
        return dice;
    }

    public void setDice(Die dice) {
        this.dice = dice;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}




package model.dealers;

import model.games.Craps;

public class GameReporter {

    private final Craps game;
    private int wins;
    private int losses;

    public GameReporter(Craps game) {
        this.game = game;
        this.wins = game.getWins();
        this.losses = game.getLosses();
    }

    public void report() {

        finalReport();
    }

    public Craps getGame() {
        return game;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    //game reporting methods - finish game methods
    private void signOff() {
        System.out.println("Thank you for playing!");
        if (wins > losses) {
            System.out.println("You did so well tonight!");
        }

        if (losses > wins) {
            System.out.println("Better luck next time!");
        }

        if (wins == losses) {
            System.out.println("You broke even!");
        }
    }

    private void gameResults() {
        System.out.println("---Game Report---");
        System.out.printf("Wins: %s%n Losses: %s%n", wins, losses);
    }

    private void finalReport() {
        gameResults();
        signOff();
    }
}

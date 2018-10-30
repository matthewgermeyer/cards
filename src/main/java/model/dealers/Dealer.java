package model.dealers;

import model.components.Die;
import model.games.Craps;

public class Dealer {

    private Long id;

    private String betLog;
    private Die dice;
    private Craps game;
    private int point;

    private int wins;
    private int losses;
    private static final int MIN_BET = 5;

    //constructors

    public Dealer(Craps game) {

        this.betLog = new String("");
        this.dice = new Die("craps");
        this.game = new Craps(dice);


    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBetLog() {
        return betLog;
    }

    public void setBetLog(String betLog) {
        this.betLog = betLog;
    }

    public Craps getGame() {
        return game;
    }

    public void setGame(Craps game) {
        this.game = game;
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

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void dealCraps(int rounds) {

        playCraps(rounds);
    }

    private void playCraps(int roundsToPlay) {
        int roundsPlayed = 0;

        while (roundsPlayed < roundsToPlay) {

            //comeOutRoll handles its own resolution for craps and winners.
            int result = comeOutRoll();

            if (result > 0) {
                pointSetStage(result);
            }

            roundsPlayed++;
        }

        System.out.println("game ends!");

    }

    private void pointSetStage(int point) {
        System.out.printf("> Point Set: %s%n", point);
        this.point = point;
        boolean endCondition = false;

        while (!endCondition) {
            int roll = dice.cast();

            //  7 Out
            if (roll == 7) {
                endCondition = true;
                sevenOut();
            }
            //Point hit
            if (roll == point) {
                endCondition = true;
                pointHit();
            }
            //new roll
            if (roll != 7 && roll != point) {
                resolvePoint(roll);
            }
        }
    }

    //returns  -1 for craps
    //returns   0 for win  || > 0 for point
    public int comeOutRoll() {
        System.out.println("> Coming out!");
        int roll = dice.cast();

        System.out.printf("=======%s=======%n", roll);

        if (roll == 2 || roll == 3 || roll == 12) {
            comeOutLoss(roll);
            return -1;
        }

        if (roll == 7 || roll == 11) {
            comeOutWin(roll);
            return 0;

        } else {
            point = roll;
            return point;
        }
    }

    //Come Out Winners/Losers
    //7, 11   && 2, 3, 12
    private void comeOutWin(int point) {
        System.out.printf("%s! : Come out win!%n%n", point);
        wins++;
    }

    private void comeOutLoss(int point) {
        System.out.printf("%s : Come out loss!%n%n", point);
        losses++;
    }

    //point resolution
    private void resolvePoint(int point) {
        System.out.printf("%s : game continues%n%n", point);
        //pay bets?

    }

    private void pointHit() {
        System.out.println("We hit our point!");
        System.out.println("All Come line bets are Winners!");
        //resolve betting
        wins++;
    }

    private void sevenOut() {
        System.out.println("Seven Out!");
        System.out.println("All Come line bets are Losers!");
        //resolve betting
        losses++;
    }




}

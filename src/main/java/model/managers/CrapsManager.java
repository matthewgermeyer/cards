package model.managers;

import model.dealers.Dealer;
import model.dealers.GameReporter;
import model.games.Craps;

public class CrapsManager {

    private Long id;

    private final Craps game;
    //responsible for managing the dice.
    private final Dealer dealer;
    //responsible for settling bets
    private final BetManager bm;
    //  Manages decks, dice, minis, etc
    private final ComponentManager cm;
    private final GameReporter gr;

    public CrapsManager() {
        Craps newGame = new Craps();
        this.game = newGame;
        this.dealer = new Dealer(newGame);
        this.bm = new BetManager(newGame);
        this.cm = new ComponentManager(newGame);
        this.gr = new GameReporter(newGame);
    }


    public void playAutoCraps(int rounds){
        dealer.dealCraps(rounds);
        //TODO: reformat so the gr takes the betlog from the dealer/bettor manager.
        gr.setLosses(dealer.getLosses());
        gr.setWins(dealer.getWins());
        gr.report();
    }

}

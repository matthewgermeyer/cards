package model.managers;

import model.games.Craps;

public class ComponentManager {
    private Craps game;

    public ComponentManager(Craps game) {
        //TODO Make an enum out of this:
        this.game = game;
    }


    public Craps getGame() {
        return game;
    }

    public void setGame(Craps game) {
        this.game = game;
    }

}

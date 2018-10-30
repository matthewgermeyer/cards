package model.components;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Die {

    private int sides;
    private int number;

    //constructors
    public Die(int number) {
        this.sides = 6;
        this.number = 2;
    }

    public Die() {
    }

    public Die(String gameName) {
        //TODO: make an enum out of this
        if (gameName.toLowerCase().equals("craps")) {
            this.sides = 6;
            this.number = 2;
        }
    }

    //getters and setters
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //returns 1-6 randomly
    //TODO: Modify this to take any sided die number, but default to 6.
    public static int dieRoll() {
        Integer roll = (int) floor(random() * 6) + 1;

        return roll;
    }

    //returns the combined total of the number of die.
    public int cast() {
        System.out.println("===========");
        int total = 0;
        for (int i = 0; i < this.number; i++) {
            int roll = dieRoll();
            total += roll;
            System.out.printf("%s%n", roll);

        }
        return total;
    } //cast


} //class


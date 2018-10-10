package model;

import static java.lang.Math.*;

import java.util.Objects;

public class Card {

  private String suit;
  private int rank;

  public Card(String suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public String getSuit() {
    return suit;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return rank == card.rank &&
        Objects.equals(suit, card.suit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suit, rank);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("");
    sb.append(rank);
    sb.append(suit);
    return sb.toString();
  }

  public static void deck() {
    int count = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {

        Card c = new Card(s.toString(), r.getRank());
        System.out.println(c.toString());
        count++;
      }
    }
    System.out.printf("Total cards: %s%n ", count);
  }

  public static void dieRoll() {
    Integer roll = (int)floor(random() * 6) + 1;

    System.out.println(roll);
  }

  public static void dealTwo() {

  }
}


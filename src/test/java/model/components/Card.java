package model.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import model.cardEnums.Rank;
import model.cardEnums.Suit;

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

  public static LinkedList<Card> shuffledDeck() {
    List<Card> completedDeck = new LinkedList<>();
    LinkedList<Card> shuffled;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {

        Card c = new Card(s.toString(), r.getRank());
        completedDeck.add(c);
      }
    }
    Collections.shuffle(completedDeck);
    shuffled = new LinkedList<>(completedDeck);
    return shuffled;

  }

  public static List<Card> dealTwo(LinkedList<Card> deck) {
    List<Card> yourHand = new ArrayList<>();
    yourHand.add(deck.pollFirst());
    yourHand.add(deck.pollFirst());
    return yourHand;
  }

  public static void dealTwo() {

  }
}


package model;

public enum Rank {

  DEUCE(2, "2"),
  THREE(3, "3"),
  FOUR(4, "4"),
  FIVE(5, "5"),
  SIX(6, "6"),
  SEVEN(7, "7"),
  EIGHT(8, "8"),
  NINE(9, "9"),
  TEN(10, "10"),
  JACK(11, "J"),
  QUEEN(12, "Q"),
  KING(13, "K"),
  ACE(14, "A");

  public final int rank;
  public final String name;

  Rank(int rank, String name) {
    this.rank = rank;
    this.name = name;
  }

  public int getRank() {
    return rank;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("name");
    return sb.toString();
  }
}

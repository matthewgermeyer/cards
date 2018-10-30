package model.cardEnums;

public enum Suit {
  DIAMONDS("Diamonds"),
  HEARTS("Hearts"),
  CLUBS("Clubs"),
  SPADES("Spades");

  private final String name;

  Suit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(name);
    sb.substring(0,1).toLowerCase();
    return sb.toString();
  }
}

package model;

import java.util.Objects;

public class Player {

    private Long id;
    private String name;
    private int seatNumber;
    private int chips;
    private boolean isActive;

    //Constructors (2)
    public Player() {
    }

    public Player(String name, int chips) {
        this.name = name;
        this.chips = chips;
        this.seatNumber = takeAvailableSeat();
        this.isActive = true;

    }


    private int takeAvailableSeat() {
       return 1;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //Overriden Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return seatNumber == player.seatNumber &&
            chips == player.chips &&
            isActive == player.isActive &&
            Objects.equals(id, player.id) &&
            Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, seatNumber, chips, isActive);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", seatNumber=").append(seatNumber);
        sb.append(", chips=").append(chips);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}

package model.components;

import java.util.Objects;

public class Seat {
    private Long id;
    private int position;


    public Seat(int position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Seat seat = (Seat) o;
        return position == seat.position &&
            Objects.equals(id, seat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }
}

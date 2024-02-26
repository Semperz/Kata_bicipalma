package edu.badpals.domain.bicicleta;

public class Bicicleta {

    private final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return Integer.toString(getId());
    }
}


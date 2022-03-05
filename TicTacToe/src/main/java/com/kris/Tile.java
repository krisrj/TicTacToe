package com.kris;

public class Tile {

    private String value;

    public Tile () {
        this.value = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setToX () {

       if (value != null) {
           value = "X";
        }
    }
    public void setToO () {

        if (value != null) {
            value = "O";
        }
    }

    public String toString () {
        return "[" + getValue() + "]";
    }


}

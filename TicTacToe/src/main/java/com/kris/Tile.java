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

       if (value.equals("")) {
           value = "X";
        }
    }
    public void setToO () {

        if (value.equals("")) {
            value = "O";
        }
    }

    public String toString () {

        if (getValue().equals("")) {
            return "[ ]";
        } else {
            return  "[" + getValue() + "]";
        }
    }

}

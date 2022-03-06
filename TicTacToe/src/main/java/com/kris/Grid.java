package com.kris;

public class Grid {

    private Tile[][] grid = new Tile[3][3];
    boolean playerOne = true;

    public Tile[][] getGrid() {
        return grid;
    }

    public Grid () {
        Tile tile0 = new Tile();
        Tile tile1 = new Tile();
        Tile tile2 = new Tile();
        Tile tile3 = new Tile();
        Tile tile4 = new Tile();
        Tile tile5 = new Tile();
        Tile tile6 = new Tile();
        Tile tile7 = new Tile();
        Tile tile8 = new Tile();

        grid[0][0] = tile0;
        grid[0][1] = tile1;
        grid[0][2] = tile2;
        grid[1][0] = tile3;
        grid[1][1] = tile4;
        grid[1][2] = tile5;
        grid[2][0] = tile6;
        grid[2][1] = tile7;
        grid[2][2] = tile8;

    }

    public void setTile (int x, int y) {

        if (playerOne == true) {
            grid[x][y].setToX();
             playerOne = false;
        } else {
            grid[x][y].setToO();
            playerOne = true;
        }
    }

    public void printGrid() {
        for (Tile[] tiles : getGrid()) {

            for (Tile tilesToo : tiles) {

                System.out.print(tilesToo);
            }
            System.out.println();
        }
    }

    public boolean isEmpty(int x, int y) {

        if (grid[x][y].getValue() == "") {
           return true;
        }
        return false;
    }

    public boolean youWon () {

        if (grid[0][0].getValue().equals("X") && grid[0][1].getValue().equals("X") &&
                grid[0][2].getValue().equals("X")) {
            return true;
        } else if (grid[0][0].getValue().equals("O") && grid[0][1].getValue().equals("O") &&
                grid[0][2].getValue().equals("O")) {
            return true;
        } else if (grid[1][0].getValue().equals("O") && grid[1][1].getValue().equals("O") &&
                grid[1][2].getValue().equals("O")) {
            return true;
        } else if (grid[1][0].getValue().equals("X") && grid[1][1].getValue().equals("X") &&
                grid[1][2].getValue().equals("X")) {
            return true;
        } else if (grid[2][0].getValue().equals("X") && grid[2][1].getValue().equals("X") &&
                grid[2][2].getValue().equals("X")) {
            return true;
        } else if (grid[2][0].getValue().equals("O") && grid[2][1].getValue().equals("O") &&
                grid[2][2].getValue().equals("O")) {
            return true;
        } else if (grid[0][0].getValue().equals("O") && grid[1][0].getValue().equals("O") &&
                grid[2][0].getValue().equals("O")) {
            return true;
        }  else if (grid[0][0].getValue().equals("X") && grid[1][0].getValue().equals("X") &&
                grid[2][0].getValue().equals("X")) {
            return true;
        } else if (grid[0][1].getValue().equals("X") && grid[1][1].getValue().equals("X") &&
                grid[2][1].getValue().equals("X")) {
            return true;
        } else if (grid[0][1].getValue().equals("O") && grid[1][1].getValue().equals("O") &&
                grid[2][1].getValue().equals("O")) {
            return true;
        } else if (grid[0][2].getValue().equals("X") && grid[1][2].getValue().equals("X") &&
                grid[2][2].getValue().equals("X")) {
            return true;
        } else if (grid[0][2].getValue().equals("O") && grid[1][2].getValue().equals("O") &&
                grid[2][2].getValue().equals("O")) {
            return true;
        } else if (grid[0][0].getValue().equals("O") && grid[1][1].getValue().equals("O") &&
                grid[2][2].getValue().equals("O")) {
            return true;
        } else if (grid[0][0].getValue().equals("X") && grid[1][1].getValue().equals("X") &&
                grid[2][2].getValue().equals("X")) {
            return true;
        } else if (grid[0][2].getValue().equals("X") && grid[1][1].getValue().equals("X") &&
                grid[2][0].getValue().equals("X")) {
            return true;
        } else if (grid[0][2].getValue().equals("O") && grid[1][1].getValue().equals("O") &&
                grid[2][0].getValue().equals("O")) {
            return true;
        }
        return false;
    }

    public boolean gridFull() {

        for (Tile[] tiles : getGrid()) {

            for (Tile tilesToo : tiles) {

              if (tilesToo.getValue().equals("")) {
                  return false;
              }

            }

        }
        return true;
    }



}

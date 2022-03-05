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
        } else {
            grid[x][y].setToO();
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





}

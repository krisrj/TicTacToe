package com.kris;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Grid gameBoard = new Grid();
        Main program = new Main();

        program.displayMainMenu();
        System.out.println("");

        System.out.print("Would the first player like to be X's or O's?  ");
        String XorO = userInput.nextLine().strip().toUpperCase();

        if (XorO.equals("X")) {
            gameBoard.playerOne = true;
        } else if (XorO.equals("O")) {
            gameBoard.playerOne = false;
        }

        System.out.println("");
        System.out.println("");

        gameBoard.printGrid();

        System.out.println("");
        System.out.println("Please select a tile for your first move");



        boolean winner = false;
    while (winner == false) {
        System.out.print("Choose row 1, 2, or 3  ");
        String selectRow = userInput.nextLine().strip();

        System.out.print("Choose column 1, 2, or 3  ");
        String selectColumn = userInput.nextLine().strip();

        if (gameBoard.isEmpty(Integer.parseInt(selectRow) -1, Integer.parseInt(selectColumn) - 1)) {
            gameBoard.setTile(Integer.parseInt(selectRow) - 1, Integer.parseInt(selectColumn) - 1);
            gameBoard.printGrid();
            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("That tile is taken. Please choose a different one.");
            gameBoard.printGrid();
        }


            if (gameBoard.youWon() == false && gameBoard.gridFull() == false) {
                System.out.println("Next player's turn.");
            } else if (gameBoard.youWon() == true && gameBoard.gridFull() ==false){
                winner = true;
                System.out.println("** CONGRATULATIONS!  You Won! **");
            } else if (gameBoard.youWon() == false && gameBoard.gridFull() == true) {
                System.out.println("Nice try! You are both brilliant! Better luck next time!");
                System.out.println("");
                System.out.println("Please try again");
                gameBoard = new Grid();
                gameBoard.printGrid();

            }
        }
    userInput.close();

    }


    public void displayMainMenu () {

        System.out.println("");
        System.out.println("");

        System.out.println("*************************************************************");
        System.out.println("        Welcome to this Amazing Game of TicTacToe!");
        System.out.println("*************************************************************");
        System.out.println("");


    }

}

package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    private static char[] board = new char[10];
    private static char playerLetter;
    private static char computerLetter;

    static Scanner sc = new Scanner(System.in);

    public static void createBoard(){
        for(int i = 1; i < 10; i++){
            board[i] = ' ';
        }
    }

    /*
    * UC-2 -> get userLetter from user
    * */
    public static void playerInput(){
        System.out.println("Select the symbol (X/O) : ");
        char tmp = sc.next().toUpperCase().charAt(0);
        if( tmp == 'X' || tmp == 'O' ){
            playerLetter = tmp;
            System.out.println("Player symbol : "+ playerLetter);
            if( playerLetter == 'X')
                computerLetter = 'O';
            else
                computerLetter = 'X';
        }else{
            System.out.println("Invalid symbol. only choose X or O ");
            playerInput();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game!");

        createBoard();

        playerInput();

    }
}

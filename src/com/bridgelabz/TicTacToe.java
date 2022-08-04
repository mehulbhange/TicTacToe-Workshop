package com.bridgelabz;

public class TicTacToe {
    private static char[] board = new char[10];

    public static void createBoard(){
        for(int i = 1; i < 10; i++){
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game!");

        createBoard();
    }
}

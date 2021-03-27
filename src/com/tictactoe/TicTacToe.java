package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		initializeBoard();
		chooseMove();

	}

	public static void initializeBoard() {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("-+-+-");
	}
 public static void chooseMove()
 {
	 System.out.println("Enter your Move");
	 Scanner sc=new Scanner(System.in);
	 String Move=sc.nextLine();
	 if(Move.equalsIgnoreCase("X") || Move.equalsIgnoreCase("O"))
	 {
		 System.out.println("Eneter Row Number :");
		 int row =sc.nextInt();
		 System.out.println("Enter column Number");
		 int col = sc.nextInt();
		 if (board[row - 1][col - 1] == 'X' || board[row - 1][col - 1] == 'O') {
				System.out.println("The place is already is filled");
				chooseMove();
			} else
				board[row - 1][col - 1] = Move.toUpperCase().toCharArray()[0];
		} else {
			System.out.println("Enter your valid move,either X or O");
		}
			 
		 
	 }
 }


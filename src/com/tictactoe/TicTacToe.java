package com.tictactoe;

import java.util.Scanner;

	public class TicTacToe {
		public static char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
		private static Scanner in = new Scanner(System.in);
		private static Board board = new Board();

		private static boolean gameEnded = false;
		private static boolean player = playerturn();
		private static boolean sessionEnded = false;

		public static void main(String[] args) {
			System.out.println("Welcome to TicTacToe");
			initializeBoard();
			chooseMove();
			playerTurn();
			displayBoard();
			selectBoard();
		}
			System.out.println(board);
			while (!sessionEnded) {
				while (!gameEnded) {
					Position position = null;
					if (player) {
						position = makeMove();
						board = new Board(board, position, PlayerSign.Cross);
					}
					player = !player;
					System.out.println(board);

		public static void initializeBoard() 
		{
			System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
			System.out.println("-+-+-");
			System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
			System.out.println("-+-+-");
			System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
			System.out.println("-+-+-");
				}

			}
		}

		public static void chooseMove() {
			System.out.println("Enter your move:");
			Scanner sc = new Scanner(System.in);
			String Move = sc.nextLine();
			if (Move.equalsIgnoreCase("X") || Move.equalsIgnoreCase("O")) {
				System.out.println("Enter row number:");
				int row = sc.nextInt();
				System.out.println("Enter column number:");
				int col = sc.nextInt();
				if (board[row - 1][col - 1] == 'X' || board[row - 1][col - 1] == 'O') {
					System.out.println("The place is already is filled");
					chooseMove();
				} else
					board[row - 1][col - 1] = Move.toUpperCase().toCharArray()[0];
		private static boolean playerturn() {
			int turn = (int) (Math.random() * 10 % 2);
			if (turn == 0) {
				System.out.println("Player first");
				return true;
			} else {
				System.out.println("Enter your valid move,either X or O");
				System.out.println("Computer first");
				return false;
			}

		}

		public static void displayBoard() {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					/*
					 * if (j == board[i].length - 1) System.out.print(board[i][j]); else
					 */
					System.out.print(board[i][j] + "   ");
				}
				System.out.println();
		public static Position makeMove() {
			Position position = null;
			while (true) {
				System.out.print("Pick 1,2 or 3 for row: ");
				int row = getColOrRow();
				System.out.print("Pick 1,2 or 3 for column: ");
				int column = getColOrRow();
				position = new Position(column, row);
				if (board.isMarked(position))
					System.out.println("Already marked!");
				else
					break;
			}
			return position;
		}
		public static void selectBoard() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Where would you like to play? (1-9)");
			String userInput = sc.nextLine();
			System.out.println(userInput);
			switch(userInput) {
				case "1":
					board[0][0] = 'X';
					break;
				case "2":
					board[0][1] = 'X';
					break;
				case "3":
					board[0][2] = 'X';
					break;
				case "4":
					board[1][0] = 'X';
					break;
				case "5":
					board[1][1] = 'X';
					break;
				case "6":
					board[1][2] = 'X';
					break;
				case "7":
					board[2][0] = 'X';
					break;
				case "8":
					board[2][1] = 'X';
					break;
				case "9":
					board[2][2] = 'X';

		private static int getColOrRow() {
			int ret = -1;
			while (true) {
				try {
					ret = Integer.parseInt(in.nextLine());
				} catch (NumberFormatException e) {
				}
				if (ret < 1 | ret > 3)
					System.out.print("\nInvalid input. Please pick 1,2 or 3: ");
				else
					break;
					default:
						System.out.println(" ");
					}
			displayBoard();
			}
			return ret - 1;
		}
	}

		public static boolean playerTurn() {
			int turn = (int) Math.random()*1+1;
			if(turn==0) {
				System.out.println("Your turn first");
	final class Position {
		private final int column;
		private final int row;

		public Position(int column, int row) {
			this.column = column;
			this.row = row;
		}

		public int getRow() {
			return this.row;
		}

		public int getColumn() {
			return this.column;
		}
	}

	enum PlayerSign {
		Cross, Circle
	}

	enum GameState {
		Incomplete, CrossWin, CircleWin, Draw
	}

	class Board {
		private char[][] board; // e = empty, x = cross, o = circle.

		public Board() {
			board = new char[3][3];
			for (int y = 0; y < 3; y++)
				for (int x = 0; x < 3; x++)
					board[x][y] = 'e'; // Board initially empty
		}

		public Board(Board from, Position position, PlayerSign sign) {
			board = new char[3][3];
			for (int y = 0; y < 3; y++)
				for (int x = 0; x < 3; x++)
					board[x][y] = from.board[x][y];
			board[position.getColumn()][position.getRow()] = sign == PlayerSign.Cross ? 'x' : 'o';
		}

		public ArrayList<Position> getFreePositions() {
			ArrayList<Position> retArr = new ArrayList<Position>();
			for (int y = 0; y < 3; y++)
				for (int x = 0; x < 3; x++)
					if (board[x][y] == 'e')
						retArr.add(new Position(x, y));
			return retArr;
		}

		public boolean isMarked(Position position) {
			if (board[position.getColumn()][position.getRow()] != 'e')
				return true;
			}else {
				System.out.println("Computer turn first");
				return false;
			return false;
		}

		public String toString() {
			String retString = "\n";
			for (int y = 0; y < 3; y++) {
				for (int x = 0; x < 3; x++) {
					if (board[x][y] == 'x' || board[x][y] == 'o')
						retString += "[" + board[x][y] + "]";
					else
						retString += "[ ]";
				}
				retString += "\n";
			}
			return retString;
		}

	}
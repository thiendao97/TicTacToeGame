/**
 This program creates a game called Tic-Tac-Toe
*/

import java.util.Scanner;

public class TicTacToe{
	
	public static void main(String[] args) {
		
		boolean switchToPlayer1 = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe\n");
		char board[][] = {{' ', ' ', '1', ' ', '2', ' ', '3',},
				{'A', ' ', ' ', '|', ' ', '|', ' ',},
				{' ', ' ', '-', '-', '-', '-', '-',},
				{'B', ' ', ' ', '|', ' ', '|', ' ',},
				{' ', ' ', '-', '-', '-', '-', '-',},
				{'C', ' ', ' ', '|', ' ', '|', ' ',}};
		printBoard(board);
		while(true) {
		System.out.println("\nEnter coordinates for your move following the X and O prompts");
		String playerInput = in.nextLine(); // instead of in.next().... write a method called getUserInput(). Make it so the next instruction doesn't run until the input is correct.
		
		board = placePiece(board, playerInput, switchToPlayer1);  //board gets updated after every play
		}
	}
		
	
//method for inputing X or O into board		
	public static char[][] placePiece(char[][] board, String playerInput, boolean iswitchToPlayer1) {
		boolean keepLooping = true;
		char symbol = ' ';
		boolean switchToPlayer1 = true;

		if(switchToPlayer1) { //keeps looping to this in stead of player 2
			symbol = 'X';
			System.out.println("The symbol was: " + symbol);
			switchToPlayer1 = false;
		}
		else {
			symbol = 'O';
			System.out.println("The symbol was: " + symbol);
			switchToPlayer1 = true;
		}
		System.out.println("The input was: " + playerInput);
		switch(playerInput) {
		case "A1":
			while(keepLooping) {
				if (board[1][2] == ' ') {
					board[1][2] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "A2":
			while(keepLooping) {
				if (board[1][4] == ' ') {
					board[1][4] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "A3":
			while(keepLooping) {
				if (board[1][6] == ' ') {
					board[1][6] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "B1":
			while(keepLooping) {
				if (board[3][2] == ' ') {
					board[3][2] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "B2":
			while(keepLooping) {
				if (board[3][4] == ' ') {
					board[3][4] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "B3":
			while(keepLooping) {
				if (board[3][6] == ' ') {
					board[3][6] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "C1":
			while(keepLooping) {
				if (board[5][2] == ' ') {
					board[5][2] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "C2":
			while(keepLooping) {
				if (board[5][4] == ' ') {
					board[5][4] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		case "C3":
			while(keepLooping) {
				if (board[5][6] == ' ') {
					board[5][6] = symbol;
					keepLooping = false;
				}
			else {
				System.out.println("This squares is occupied. Try again.\n");
				keepLooping = true;
				break;
			}
		}
			break;
		default:
	    	break;
		}
		printBoard(board);
		return board;
	}


//method for printing out board
	public static void printBoard(char board[][]) {
		for(char[] row : board) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}


// checks for winner
	public static boolean isGameFinished(char[][] board) {
		if (hasPlayerWon(board, 'X')) {
			printBoard(board);
			System.out.println("X Player wins!");
			return true;
		}
		if (hasPlayerWon(board, 'O')) {
			printBoard(board);
			System.out.println("O Player wins!");
			return true;
		}
		for (int i= 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		printBoard(board);
		System.out.println("The game ended in a tie!");
		return true;
	}

	
// checks win conditions
	public static boolean hasPlayerWon(char[][] board, char symbol) {	
		if ((board[1][2] == symbol && board[1][4] == symbol && board[1][6] == symbol) ||
			(board[3][2] == symbol && board[3][4] == symbol && board[3][6] == symbol) ||
			(board[5][2] == symbol && board[5][4] == symbol && board[5][6] == symbol) ||
			
			(board[1][2] == symbol && board[3][2] == symbol && board[5][2] == symbol) ||
			(board[1][4] == symbol && board[3][4] == symbol && board[5][4] == symbol) ||
			(board[1][6] == symbol && board[3][6] == symbol && board[5][6] == symbol) ||
			
			(board[1][2] == symbol && board[3][4] == symbol && board[5][6] == symbol) ||
			(board[1][6] == symbol && board[3][4] == symbol && board[5][2] == symbol)) {
			return true;
		}
		return false;
	}	 
}

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
		String playerInput = in.next(); // instead of in.next().... write a method called getUserInput(). Make it so the next instruction doesn't run until the input is correct.
		
		board = placePiece(board, playerInput, switchToPlayer1);  //board gets updated after every play
		}
	}
	
	
// Checks user validation by making sure user only inputs a positive int and nothing else
	public static String getUserInput() { // name of method for user validation
		Scanner sc = new Scanner(System.in); // implements user input
		String userInput;
		
		userInput = sc.nextLine();
		//TODO: Figure out comparison logic here. If the unput is not A1-C3. Print incorrect and keep looping this. If it is correct stop looping this.
		
		
		return userInput; // only return this if it is correct.
	}
		
//method for inputing X or O into board		
	public static char[][] placePiece(char[][] board, String playerInput, boolean switchToPlayer1) {
		boolean keepLooping = true;
		char symbol = ' ';

		if(switchToPlayer1) {
			symbol = 'X';
			switchToPlayer1 = false;
		}
		else {
			symbol = 'O';
			switchToPlayer1 = true;
		}
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

	
	public TicTacToe() {
		/*
		* Step 1: create an empty board, with an initial value
		* of a space (' ')
		*/
	}
	
	/* 
	 * If s represents a valid move, add the current player's symbol to the board and return true.
	 * Otherwise return false.
	 */
	public boolean play(String s) {
		/* Step 2: Fill in here with your own
		* play logic, and replace the return with you
		* own.
		*/ 
		return false; 
	}
	
	/*
	 * Switches the current player from X to O, or O to X.
	 */
	public void switchTurn() {
		// Step 3: Fill in with your code to toggle between
		// 'X' and 'O'
	}
	
	/*
	 * Returns true if the current player has won the game.
	 * Three in a row, column or either diagonal.
	 * Otherwise, return false.
	 */
	public boolean won() {
		/* Step 5: Fill in the code for the won method. This method
        * should return true if the current player has 3 in-a-row 
		* in any row, column or diagonal. Otherwise, return false.
		*/
		return false; // TODO: replace with your own return statement.
	}
	
	/*
	 * Returns true if there are no places left to move
	 */
	public boolean stalemate() {
	    /*
		 * Step 4: Fill in the code for the stalemate method. It
         * should return true if there are no more places to move 
		 * on the board. Otherwise, return false return false; 
		 */
		 return true;   // replace with your own return 
	}
/*	public char getPlayer() {
		return player;
	}
	public void print() {
		System.out.println();
		System.out.println("\t  1 2 3");
		System.out.println();
		System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("\t  -----");
		System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("\t  "+"-----");
		System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
		System.out.println();
	}
*/
	
	/* 
	 * Step 6: Main Method for Final Step - Delete your main method 
	 * and uncomment this one. 
	 * Runs the game by getting input from the user, making the 
	 * appropriate moves, and prints who won or if it was a stalemate. 
	*/ 
	/*
	
	} */
	
}

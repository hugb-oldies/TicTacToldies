package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import is.ru.tictactoe.Board;



public class TictactoeConsole{

	private static int[] moves;

	public static void main(String[] args) {

		Board.initBoard();
		displayBoard();		
		boolean gameOver = false;
		// main loop
		while (!gameOver) {
			int[] moves;
			moves = getMove();
			Board.markSquare(moves[0],moves[1], Board.getActivePlayer() );
			if (Board.checkWin() != 0)  // winner or tie
				gameOver = true;
			if (Board.getCounter() == 9)
				break;
		}

		//displayBoard();		


	}

	public static int[] getMove() {
		int [] moves = {0,0};
		System.out.println("Player " + Board.getActivePlayer() + " move" + " example: 1 1 [enter]");
		Scanner reader = new Scanner(System.in);

		boolean inputOK = false;
		while (!inputOK) {
			moves[0] = reader.nextInt();
			moves[1] = reader.nextInt();

			if ( (moves[0] >= 0) && (moves[0] <=2) && (moves[1] >= 0) && (moves[1] <=2) ) {
				inputOK = true;
				//System.out.println("here");
			} else { 
				System.out.println("Player " + Board.getActivePlayer() + " move" + " example: 1 1 [enter]");
			}
			System.out.println(moves[0] + "-" + moves[1]);
		}

		return moves;
	}

	public static void displayBoard() {
		System.out.println("-------");
		for (int i=0; i<3; i++) {
			System.out.print("|");
			for (int j=0; j<3; j++) {
				String toPrint = "1";
				if (Board.checkSquare(i,j) == 0 ) toPrint = " ";
				else if (Board.checkSquare(i,j) == 2 ) toPrint = "x";
				System.out.print( toPrint + "|" );
			}
			System.out.println("");
		}
		System.out.println("-------");
	}

}


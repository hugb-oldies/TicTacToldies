package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import is.ru.tictactoe.Board;



public class TictactoeConsole{

	private int[] moves; 	
	private static Board myBoard = new Board();

	public static void main(String[] args) {
		
		myBoard.initBoard();
		displayBoard();		
		boolean gameOver = false;
		// main loop
		while (!gameOver) {
			int[] moves;
			//System.out.println("Player " + myBoard.getActivePlayer() + " move");
			moves = getMove();
			if (myBoard.isEmpty(moves[1], moves[0])) {
				myBoard.markSquare(moves[1],moves[0], myBoard.getActivePlayer() );
			} else  {
				System.out.println("Not a legal move");
			}
			if (myBoard.checkWin() != 0)  // winner or tie
				gameOver = true;
			displayBoard();
			System.out.println("");
			//if (myBoard.getCounter() == 9)
			//	break;
		}
		if (myBoard.checkWin() == -1)
			System.out.println("Tie");
		else if (myBoard.checkWin() == 1) 
			System.out.println("Player 1 wins");
		else if (myBoard.checkWin() == 2) 
			System.out.println("Player 2 wins");
		else
			System.out.println("Error");				


	}

	public static int[] getMove() {

		int [] moves = {0,0};
		System.out.println("Player " + myBoard.getActivePlayer() + " move" + " example: 1 (column) 1 (row)  [enter]");
		Scanner reader = new Scanner(System.in);

		boolean inputOK = false;
		while (!inputOK) {
			moves[0] = reader.nextInt();
			moves[1] = reader.nextInt();

			if ( (moves[0] >= 0) && (moves[0] <=2) && (moves[1] >= 0) && (moves[1] <=2) ) {
				inputOK = true;
			} else { 
				System.out.println("Player " + myBoard.getActivePlayer() + " move" + " example: 1 (column) 1 (row)  [enter]");			
			}
			//System.out.println(moves[0] + "-" + moves[1]);
		}

		return moves;
	}

	public static void displayBoard() {
		
		System.out.println(" 0 1 2");
		System.out.println("-------");
		for (int i=0; i<3; i++) {
			System.out.print("|");
			for (int j=0; j<3; j++) {
				String toPrint = "x";
				if (myBoard.checkSquare(i,j) == 0 ) toPrint = " ";
				else if (myBoard.checkSquare(i,j) == 2 ) toPrint = "o";
				System.out.print( toPrint + "|" );
			}
			System.out.println(" " + i);
		}
		System.out.println("-------");
	}

}


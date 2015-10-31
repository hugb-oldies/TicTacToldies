package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import is.ru.tictactoe.Board;



public class TictactoeConsole{

	private int[] moves;

	private Board Board = new Board();

	public void main(String[] args) {

		Board.initBoard();
		displayBoard();		
		boolean gameOver = false;
		// main loop
		while (!gameOver) {
			int[] moves;
			//System.out.println("Player " + Board.getActivePlayer() + " move");
			moves = getMove();
			if (Board.isEmpty(moves[1], moves[0])) {
				Board.markSquare(moves[1],moves[0], Board.getActivePlayer() );
			} else  {
				System.out.println("Not a legal move");
			}
			if (Board.checkWin() != 0)  // winner or tie
				gameOver = true;
			displayBoard();
			System.out.println("");
			//if (Board.getCounter() == 9)
			//	break;
		}
		if (Board.checkWin() == -1)
			System.out.println("Tie");
		else if (Board.checkWin() == 1) 
			System.out.println("Player 1 wins");
		else if (Board.checkWin() == 2) 
			System.out.println("Player 2 wins");
		else
			System.out.println("Error");				


	}

	public int[] getMove() {
		int [] moves = {0,0};
		System.out.println("Player " + Board.getActivePlayer() + " move" + " example: 1 (column) 1 (row)  [enter]");
		Scanner reader = new Scanner(System.in);

		boolean inputOK = false;
		while (!inputOK) {
			moves[0] = reader.nextInt();
			moves[1] = reader.nextInt();

			if ( (moves[0] >= 0) && (moves[0] <=2) && (moves[1] >= 0) && (moves[1] <=2) ) {
				inputOK = true;
				//System.out.println("here");
			} else { 
				System.out.println("Player " + Board.getActivePlayer() + " move" + " example: 1 (column) 1 (row)  [enter]");			
			}
			//System.out.println(moves[0] + "-" + moves[1]);
		}

		return moves;
	}

	public void displayBoard() {
		System.out.println(" 0 1 2");
		System.out.println("-------");
		for (int i=0; i<3; i++) {
			System.out.print("|");
			for (int j=0; j<3; j++) {
				String toPrint = "1";
				if (Board.checkSquare(i,j) == 0 ) toPrint = " ";
				else if (Board.checkSquare(i,j) == 2 ) toPrint = "x";
				System.out.print( toPrint + "|" );
			}
			System.out.println(" " + i);
		}
		System.out.println("-------");
	}

}


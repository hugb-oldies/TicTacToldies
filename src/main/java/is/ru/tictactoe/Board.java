package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;


public class Board {

	private static int[][] board = new int[3][3];
	private static int counter = 0;	// number of moves
	private static int activePlayer = 1;  

	public Board () {
		// empty
	}

	public static int checkWin() {		
		if ( (board[0][0] == board[0][1]) && ( board[0][1] == board[0][2]) && (board[0][0] != 0) )  
			return board[0][0];
		if ( (board[1][0] == board[1][1]) && ( board[1][1] == board[1][2]) && (board[1][0] != 0) )  
			return board[1][0];
		if ( (board[2][0] == board[2][1]) && ( board[2][1] == board[2][2]) && (board[2][0] != 0))  
			return board[2][0];
		if ( (board[0][0] == board[1][0]) && ( board[1][0] == board[2][0]) && (board[0][0] != 0) )  
			return board[0][0];
		if ( (board[0][1] == board[1][1]) && ( board[1][1] == board[2][1]) && (board[0][1] != 0) )  
			return board[0][1];
		if ( (board[0][2] == board[1][2]) && ( board[1][2] == board[2][2]) && (board[0][2] != 0))  
			return board[0][2];
		if ( (board[0][0] == board[1][1]) && ( board[1][1] == board[2][2]) && (board[0][0] != 0) )  
			return board[0][0];
		if ( (board[0][2] == board[1][1]) && ( board[1][1] == board[2][0]) && (board[0][2] != 0))  
			return board[0][2];
		// no winner - tie if this is the 9th move
		if (counter == 9)
			return -1;
		// default condition - no winner
		return 0;
	}

	public static void initBoard() {
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = 0;
		counter = 0;
	}

	public static boolean isEmpty(int x, int y) {
		return (board[x][y] == 0);
	}

	public static void markSquare(int x, int y, int player ){
		board[x][y] = player;
		counter++;
		if (activePlayer == 1)
			activePlayer = 2;
		else
			activePlayer = 1;
	}

	public static int checkSquare(int x, int y) {
		return board[x][y];
	}

	public static int getActivePlayer() {
		return activePlayer;
	}
}



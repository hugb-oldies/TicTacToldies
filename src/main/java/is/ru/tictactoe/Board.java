package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;


public class Board {	  
	
	private int [][] board;
	private int counter;
	private int activePlayer;

	public Board () {
		board = new int [3][3];
		counter = 0;
		activePlayer = 1;
	}

	public int checkWin() {		
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

	public void initBoard() {
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = 0;
		counter = 0;
	}

	public boolean isEmpty(int x, int y) {
		return (board[x][y] == 0);
	}

	public void markSquare(int x, int y, int player ){
		board[x][y] = player;
		counter++;
		if (activePlayer == 1)
			activePlayer = 2;
		else
			activePlayer = 1;
	}

	public int checkSquare(int x, int y) {
		return board[x][y];
	}

	public int getActivePlayer() {
		return activePlayer;
	}

	public int getCounter() {
		return counter;	
	}

}

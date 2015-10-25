package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;


public class Board {

	private static int[][] board = new int[3][3];

	public Board () {
		//System.out.println("hæ");
		//board = new int[3][3]; // { {0, 0, 0 }, {0, 0, 0 }, {0, 0, 0 } } ;
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
		else
			return 0;
	}

	public static void initBoard() {
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = 0;
	}

	public static boolean isEmpty(int x, int y) {
		return (board[x][y] == 0);
	}

	public static void markSquare(int x, int y, int player ){
		board[x][y] = player;
	}

	public static int checkSquare(int x, int y) {
		return board[x][y];
	}
}



package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;


public class Board{

	private static int[][] board = new int[3][3];

	public Board () {
		//board = new int[3][3]; // { {0, 0, 0 }, {0, 0, 0 }, {0, 0, 0 } } ;
	}

	public static boolean winner() {
		if ( (board[0][0] == board[0][1]) && ( board[0][1] == board[0][2]) )  
			return true;
		else
			return false;
	}

	public static void initBoard() {
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				board[i][j] = 0;
	}

	public static void markSquare(int x, int y, int player ){
		board[x][y] = player;
	}

	public static int checkSquare(int x, int y) {
		return board[x][y];
	}
}



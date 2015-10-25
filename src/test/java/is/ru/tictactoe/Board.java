package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;


public class Board{

	private static int[][] board = new int[3][3];

	public Board () {
		//board = new int[3][3]; // { {0, 0, 0 }, {0, 0, 0 }, {0, 0, 0 } } ;
	}

	public static boolean winner() {
		return true;
	}

	public static void markSquare(int x, int y, int player ){
		board[x][y] = player;
	}

	public static int checkSquare(int x, int y) {
		return board[x][y];
	}
}



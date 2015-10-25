package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class BoardTest {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.BoardTest");
    }


    @Test
    public void checkWinner(){
	Board.initBoard();
	assertEquals(0, Board.checkWin() );
    }


    @Test
    public void TestOneMarkedSquareBoard(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	assertEquals(1, Board.checkSquare(0,0) );
    }



    @Test
    public void TestHorizontalTopWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(0,1,1);
	Board.markSquare(0,2,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestHorizontalMidWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(1,0,1);
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestHorizontalBotWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(2,0,2);
	Board.markSquare(2,1,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestVerticalLeftWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(1,0,1);
	Board.markSquare(2,0,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestVerticalMidWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,1,1);
	Board.markSquare(1,1,1);
	Board.markSquare(2,1,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestVerticalRightWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,2,2);
	Board.markSquare(1,2,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestSlashRightWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,2);
	Board.markSquare(1,1,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestSlashLeftWin(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,2,1);
	Board.markSquare(1,1,1);
	Board.markSquare(2,0,1);
	assertEquals(1, Board.checkWin() );
    }



    @Test
    public void TestWinnerXWithFullBoard(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(0,1,2);
	Board.markSquare(0,2,1);
	Board.markSquare(1,0,2);
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,2);
	Board.markSquare(2,0,2);
	Board.markSquare(2,1,1);
	Board.markSquare(2,2,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestWinnerOWithFullBoard(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,2);
	Board.markSquare(0,1,2);
	Board.markSquare(0,2,2);
	Board.markSquare(1,0,2);
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,1);
	Board.markSquare(2,0,1);
	Board.markSquare(2,1,1);
	assertEquals(2, Board.checkWin() );
    }




}

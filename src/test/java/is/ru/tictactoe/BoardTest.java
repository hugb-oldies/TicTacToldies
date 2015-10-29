package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


/*  Board
-------------------------
| (0,0) | (1,0) | (2,0) |
-------------------------
| (0,1) | (1,1) | (2,1) |
-------------------------
| (0,2) | (1,2) | (2,2) |
-------------------------

*/

public class BoardTest {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.BoardTest");
    }


    @Test
    public void TestEmptyBoardNoWinner(){
	Board.initBoard();
	assertEquals(0, Board.checkWin() );
    }

    @Test
    public void TestEmptySquare(){
	Board.initBoard();
	assertEquals(true, Board.isEmpty(0,0) );
    }

    @Test
    public void TestMarkedSquare(){
	Board.initBoard();
	Board.markSquare(2,2,2);
	assertEquals(false, Board.isEmpty(2,2) );
    }

    @Test
    public void TestNoWinnerWithThreeMarks(){
	Board.initBoard();
	Board.markSquare(0,0,2);
	Board.markSquare(0,1,1);
	Board.markSquare(0,2,1);
	assertEquals(0, Board.checkWin() );
    }

    @Test
    public void TestOneMarkedSquareBoard(){
	Board.initBoard();
	Board.markSquare(0,0,1);
	assertEquals(1, Board.checkSquare(0,0) );
    }

    @Test
    public void TestHorizontalTopWin(){
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(0,1,1);
	Board.markSquare(0,2,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestHorizontalMidWin(){
	Board.initBoard();
	Board.markSquare(1,0,1);
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestHorizontalBotWin(){
	Board.initBoard();
	Board.markSquare(2,0,2);
	Board.markSquare(2,1,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestVerticalLeftWin(){
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(1,0,1);
	Board.markSquare(2,0,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestVerticalMidWin(){
	Board.initBoard();
	Board.markSquare(0,1,1);
	Board.markSquare(1,1,1);
	Board.markSquare(2,1,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestVerticalRightWin(){
	Board.initBoard();
	Board.markSquare(0,2,2);
	Board.markSquare(1,2,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestSlashRightWin(){
	Board.initBoard();
	Board.markSquare(0,0,2);
	Board.markSquare(1,1,2);
	Board.markSquare(2,2,2);
	assertEquals(2, Board.checkWin() );
    }

    @Test
    public void TestSlashLeftWin(){
	Board.initBoard();
	Board.markSquare(0,2,1);
	Board.markSquare(1,1,1);
	Board.markSquare(2,0,1);
	assertEquals(1, Board.checkWin() );
    }

    @Test
    public void TestWinnerXWithFullBoard(){
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

    @Test
    public void TestTie(){
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(0,1,2);
	Board.markSquare(0,2,1);
	Board.markSquare(1,0,2);
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,2);
	Board.markSquare(2,0,2);
	Board.markSquare(2,1,1);
	Board.markSquare(2,2,2);
	assertEquals(-1, Board.checkWin() );
    }


    @Test
    public void TestActivePlayerInBeginning(){
	Board.initBoard();
	assertEquals(1, Board.getActivePlayer() );
    }

    @Test
    public void TestActivePlayerAfterOneMove(){
	Board.initBoard();
	Board.markSquare(1,1,1);
	assertEquals(2, Board.getActivePlayer() );
    }

    @Test
    public void TestActivePlayerAfterTwoMoves(){
	Board.initBoard();
	Board.markSquare(1,1,1);
	Board.markSquare(1,2,2);
	assertEquals(1, Board.getActivePlayer() );
    }


}

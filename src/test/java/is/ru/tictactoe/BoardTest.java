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

    Board myBoard = new Board();

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.BoardTest");
    }


    @Test
    public void TestEmptyBoardNoWinner(){
		myBoard.initBoard();
		assertEquals(0, myBoard.checkWin() );
    }

    @Test
    public void TestEmptySquare(){
		myBoard.initBoard();
		assertEquals(true, myBoard.isEmpty(0,0) );
    }

    @Test
    public void TestMarkedSquare(){
		myBoard.initBoard();
		myBoard.markSquare(2,2,2);
		assertEquals(false, myBoard.isEmpty(2,2) );
    }

    @Test
    public void TestNoWinnerWithThreeMarks(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,2);
		myBoard.markSquare(0,1,1);
		myBoard.markSquare(0,2,1);
		assertEquals(0, myBoard.checkWin() );
    }

    @Test
    public void TestOneMarkedSquareBoard(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		assertEquals(1, myBoard.checkSquare(0,0) );
    }

    @Test
    public void TestHorizontalTopWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		myBoard.markSquare(1,0,1);
		myBoard.markSquare(2,0,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestHorizontalMidWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,1,1);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(2,1,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestHorizontalBotWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,2,2);
		myBoard.markSquare(1,2,2);
		myBoard.markSquare(2,2,2);
		assertEquals(2, myBoard.checkWin() );
    }

    @Test
    public void TestVerticalLeftWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		myBoard.markSquare(0,1,1);
		myBoard.markSquare(0,2,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestVerticalMidWin(){
		myBoard.initBoard();
		myBoard.markSquare(1,0,1);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(1,2,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestVerticalRightWin(){
		myBoard.initBoard();
		myBoard.markSquare(2,0,2);
		myBoard.markSquare(2,1,2);
		myBoard.markSquare(2,2,2);
		assertEquals(2, myBoard.checkWin() );
    }

    @Test
    public void TestSlashRightWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,2);
		myBoard.markSquare(1,1,2);
		myBoard.markSquare(2,2,2);
		assertEquals(2, myBoard.checkWin() );
    }

    @Test
    public void TestSlashLeftWin(){
		myBoard.initBoard();
		myBoard.markSquare(0,2,1);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(2,0,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestWinnerXWithFullBoard(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		myBoard.markSquare(0,1,2);
		myBoard.markSquare(0,2,1);
		myBoard.markSquare(1,0,2);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(1,2,2);
		myBoard.markSquare(2,0,2);
		myBoard.markSquare(2,1,1);
		myBoard.markSquare(2,2,1);
		assertEquals(1, myBoard.checkWin() );
    }

    @Test
    public void TestWinnerOWithFullBoard(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,2);
		myBoard.markSquare(0,1,2);
		myBoard.markSquare(0,2,2);
		myBoard.markSquare(1,0,2);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(1,2,1);
		myBoard.markSquare(2,0,1);
		myBoard.markSquare(2,1,1);
		assertEquals(2, myBoard.checkWin() );
    }

    @Test
    public void TestTie(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		myBoard.markSquare(0,1,2);
		myBoard.markSquare(0,2,1);
		myBoard.markSquare(1,0,2);
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(1,2,2);
		myBoard.markSquare(2,0,2);
		myBoard.markSquare(2,1,1);
		myBoard.markSquare(2,2,2);
		assertEquals(-1, myBoard.checkWin() );
    }


    @Test
    public void TestActivePlayerInBeginning(){
		myBoard.initBoard();
		assertEquals(1, myBoard.getActivePlayer() );
    }

    @Test
    public void TestActivePlayerAfterOneMove(){
		myBoard.initBoard();
		myBoard.markSquare(1,1,1);
		assertEquals(2, myBoard.getActivePlayer() );
    }

    @Test
    public void TestActivePlayerAfterTwoMoves(){
		myBoard.initBoard();
		myBoard.markSquare(1,1,1);
		myBoard.markSquare(1,2,2);
		assertEquals(1, myBoard.getActivePlayer() );
    }

	@Test
	public void TestCounterAfterInit(){
		myBoard.initBoard();
		assertEquals(0, myBoard.getCounter() );
	}

	@Test
	public void TestCounterAfterOneMove(){
		myBoard.initBoard();
		myBoard.markSquare(0,0,1);
		assertEquals(1, myBoard.getCounter() );
	}
}

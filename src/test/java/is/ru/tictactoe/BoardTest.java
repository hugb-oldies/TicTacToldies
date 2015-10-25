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
    public void winner(){
	assertEquals(true, Board.winner() );
    }


    @Test
    public void TestOneMarkedSquareBoard(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	assertEquals(1, Board.checkSquare(0,0) );
    }


    @Test
    public void TestTopRowWinner(){
	//Tictactoe.Board board = new Tictactoe.Board();
	Board.initBoard();
	Board.markSquare(0,0,1);
	Board.markSquare(0,1,1);
	Board.markSquare(0,2,1);
	assertEquals(true, Board.winner() );
    }




}

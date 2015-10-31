package is.ru.tictactoe;

import java.util.*;
import java.util.regex.Matcher;
//import is.ru.tictactoe.Board;

/*
public class Player{
	
}*/


public class Tictactoe{

	private Board myBoard = new Board();


	public String HelloWorld() {
		String ret = "Hello World";
		return ret;
	}

/*	private static init() {
	}
*/
	public boolean winner() {
		return true;
	}

	public void main(String[] args) {
		//Board board = new Board();
		myBoard.initBoard();
		myBoard.markSquare(0,0,2);
		myBoard.markSquare(0,1,1);
		myBoard.markSquare(0,2,1);
		System.out.println( myBoard.checkWin() );


		// do something
	}
}

/*
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Tictactoe extends JFrame {

    public Tictactoe() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Tictactoe");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                Tictactoe ex = new Tictactoe();
                ex.setVisible(true);
            }
        });
    }
}
*/


## Design Report for TicTacToe

### Description of TacTacToe initial design.

Tic Tac Toe is a game coded in Java language using Test Drive Development and Travis for Automated Coninuous Integration Server.

Tic Tac Toe has two classes:
 - TictactoeConsole
 - Board

#### class TictactoeConsole
private Board myBoard;
 
public String HelloWorld();

public boolean winner();

pulic void main();

#### class Board
private int [][] board;

private int counter;

private int activePlayer;

public Board();

public int checkWin();

public void initBoard();

public boolean isEmpty();

public void markSquare();

public int checkSquare();

public int getActivePlayer();

public int getCounter();


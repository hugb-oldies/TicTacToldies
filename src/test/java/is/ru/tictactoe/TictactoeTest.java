package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TictactoeTest {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("is.ru.tictactoe.TictactoeTest");
    }


    @Test
    public void firstTest(){
	assertEquals("Hello World", Tictactoe.HelloWorld() );
    }

}

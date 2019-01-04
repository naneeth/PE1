import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {


    @Before
    public void setUp()
    {
        obj=new GuessTheNumber();
    }
    GuessTheNumber obj;

    @Test

    public void numberCheck()
    {
        String expectedValue="Number guessed is less than original number";


       String actualValue=obj.guessNumber(28);

        assertEquals(expectedValue,actualValue);

    }

    @Test

    public void numberCheck2()
    {
        String expectedValue="Number guessed matches the original number";


        String actualValue=obj.guessNumber(37);

        assertEquals(expectedValue,actualValue);

    }
    @After
    public void tearDown(){
        obj = null;
    }

}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenAndOddTest {

    @Before
        public void setUp()
        {
            obj=new EvenAndOdd();
        }
        EvenAndOdd obj;

        @Test
        public void checkEvenOrOdd()
        {
            String expectedValue="Tom",actualValue;
            actualValue=obj.isEvenOdd(25);
            assertEquals(expectedValue,actualValue);

        }

        @After
        public void tearDown()
        {
            obj=null;
        }



    }
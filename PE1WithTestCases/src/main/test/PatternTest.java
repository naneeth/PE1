import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PatternTest {

    @Before
        public void setUp()
        {
            testObj= new Pattern();
        }
        Pattern testObj;

        @Test
        public void testLoopTillNthTerm()
        {

            String expectedValue="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",actualValue;
            actualValue=testObj.pattern(5);
            assertEquals(expectedValue,actualValue);
        }

        @After
        public  void tearDown()
        {
            testObj=null;
        }


    }
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingSumTest {

        @Before
        public void setUp()
        {
            obj = new SortingSum();
        }
        SortingSum obj;

        @Test

        public void sortingSumCheck()
        {
            String expectedValue="43221 Sum of even numbers is : 8 false";


            String actualValue=obj.sortingSum("23412");

            assertEquals(expectedValue,actualValue);

        }

        @Test

        public void sortingSumCheck2()
        {
            String expectedValue="66543 Sum of even numbers is : 16 true";


            String actualValue=obj.sortingSum("43566");

            assertEquals(expectedValue,actualValue);

        }
        @After
        public void tearDown(){
            obj = null;
        }

    }
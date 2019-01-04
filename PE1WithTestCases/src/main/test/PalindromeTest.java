import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

public class PalindromeTest{

    Palindrome obj;
        @Before
        public void setUp()
        {
            obj= new Palindrome();
        }



        @Test

        public void palindromeSumCheck(){
            String expectedValue="12321 is palindrome and sum of even numbers is less than 25";
            String actualValue = obj.palindromeSum(12321);
            assertEquals(expectedValue,actualValue);
        }

        @After
        public void tearDown()
        {
          obj = null;
        }


    }

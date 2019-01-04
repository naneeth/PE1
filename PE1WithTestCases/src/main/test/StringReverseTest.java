import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void stringReverseTest(){
        StringReverse obj = new StringReverse();
        String expectedValue ="nodnol";
        String actualValue = obj.reversedString("london");
        //Assert
        assertEquals(expectedValue,actualValue);
    }


    @After
    public void tearDown() throws Exception {
    }
}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void stringRepeat(){
        StringRepeat obj = new StringRepeat();
        String  expectedValue =  "Stackroutetete";
        String  actualValue   =   obj.stringRepeat("Stackroute",2);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @After
    public void tearDown() throws Exception {
    }
}
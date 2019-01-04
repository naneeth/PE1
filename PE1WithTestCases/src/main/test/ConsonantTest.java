import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantTest {

    @Before

    public void setUp()
    {
        obj=new Consonant();
    }
    Consonant obj;

    @Test

    public void isVowelConsonant()
    {
        String expectedValue="Consonant",actualValue;


        actualValue=obj.consonantAndVowel("p");

        assertEquals(expectedValue,actualValue);

    }

    @Test

    public void isVowelConsonant2()
    {
        String expectedValue="Vowel Consonant",actualValue;


        actualValue=obj.consonantAndVowel("ap");

        assertEquals(expectedValue,actualValue);

    }
    @After
        public void tearDown(){
        obj = null;
    }

}
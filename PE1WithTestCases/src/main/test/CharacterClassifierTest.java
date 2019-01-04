import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CharacterClassifierTest {

    @Test
    public void characterClassifierTest(){
        CharacterClassifier obj = new CharacterClassifier();
        String      expectedValue = "CAPITAL LETTER";
        String      actualValue = obj.characterClassifier('H');
        //assert
        assertEquals(expectedValue,actualValue);

    }

}
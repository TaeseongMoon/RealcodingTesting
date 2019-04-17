import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void nullcheck(){
        String str = null;

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getUpperCasefromString(str);

        assertThat(numberOfUpperCaseCharactersInString, is(0));
        assertTrue(numberOfUpperCaseCharactersInString == 0);
    }

    @Test
    public void emptycheck() {
        String str = "";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getUpperCasefromString(str);

        assertTrue(numberOfUpperCaseCharactersInString == 0);
    }

    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ABCDEFGHIJ() {
        String str = "ABCDEFGHIJ";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getUpperCasefromString(str);

        assertThat(numberOfUpperCaseCharactersInString , is(10));
        assertTrue(numberOfUpperCaseCharactersInString == 10);
        assertFalse(numberOfUpperCaseCharactersInString == 12);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndex() { //??
        new ArrayList<Object>().get(0);
    }

    @Ignore
    @Test(timeout = 5000)
    public void testShouldRunInLimitedTime() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("제한된 시간 내에 수행되면 테스트 Passed!");
    }
}
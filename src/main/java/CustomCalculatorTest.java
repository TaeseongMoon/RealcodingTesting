import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class CustomCalculatorTest {

    CustomCalculator cal = new CustomCalculator();
    @Test
    public void 더하기테스트() {
        cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void 마이너스테스트(){
        cal = new CustomCalculator();
        int result = cal.subtract(7,4);
        assertTrue(result == 3);
    }
    @Test
    public void 곱하기() {
        cal = new CustomCalculator();
        int result = cal.multiply(5,9);
        assertThat("result", result, is(45));
        assertTrue(result == 45);
        System.out.println("result :: " + result);
    }

    @Test
    public void 나누기() {
        cal = new CustomCalculator();
        int result = cal.divide(25,5);
        assertThat("result", result, is(5));
        assertTrue(result == 5);
        System.out.println("result :: " + result);
    }
}
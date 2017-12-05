import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 4/9/2017.
 */
public class EvenFibonacciNumbersTest {
    
    
    @Test
    public void whenTheValueOfTermNotExceed_21_theSumOfEvenValuedTermsIs_10 () throws Exception{
        assertEquals(10,EvenFibonacciNumbers.sumOfEvenValuedTerms(21));
    }

    @Test
    public void whenTheValueOfTermNotExceed_144_theSumOfEvenValuedTermsIs_10 () throws Exception{
        assertEquals(44,EvenFibonacciNumbers.sumOfEvenValuedTerms(144));
    }
}

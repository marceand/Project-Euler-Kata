import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 4/5/2017.
 */
public class MultiplesOf3And5Test {
    
    @Test
    public void whenListAllNumbersBelow_10_OfMultiple_3_Or_5_thenSumOfMultiplesIs_23() throws Exception{
        assertEquals(23,MultiplesOf3And5.sumOfAllMultiples(10));
    }


    @Test
    public void whenListAllNumbersBelow_1000_OfMultiple_3_Or_5_thenSumOfMultiplesIs_233168() throws Exception{
        assertEquals(233168,MultiplesOf3And5.sumOfAllMultiples(1000));
    }


}
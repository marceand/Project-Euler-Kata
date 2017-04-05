import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/30/2017.
 */
public class PrimeFactorizationTest {
    
    @Test
    public void shouldFindPrimeFactorsForNumber2() throws Exception{
        assertEquals(primeFactors(2),PrimeFactorization.findPrimeFactors(2));
    }

    @Test
    public void shouldFindPrimeFactorsForNumber3() throws Exception{
        assertEquals(primeFactors(3),PrimeFactorization.findPrimeFactors(3));
    }

    @Test
    public void shouldFindPrimeFactorsForNumber4() throws Exception{
        assertEquals(primeFactors(2,2),PrimeFactorization.findPrimeFactors(4));
    }

    private List<Integer> primeFactors(int... factors) {

        List<Integer> factorList = new ArrayList<Integer>();

        for(int factor: factors){
            factorList.add(factor);
        }

        return factorList;
    }

}

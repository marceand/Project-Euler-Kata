import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/29/2017.
 */
public class SieveOfEratosthenesPrimeGenerator {

    @Test
    public void firstPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(3));
    }

    @Test
    public void firstTwoPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(4));
    }
    @Test
    public void firstThreePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(6));
    }

    @Test
    public void firstFourPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(8));
    }

    @Test
    public void firstFivePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(12));
    }

    @Test
    public void firstSixPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(14));
    }

    @Test
    public void firstSevenPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(18));
    }

    @Test
    public void firstEightPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(20));
    }

    @Test
    public void firstNinePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19,23);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(24));
    }

    @Test
    public void firstTenthPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19,23,29);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(30));
    }

    @Test
    public void firstTwentyPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
        assertEquals(expectedPrime,SieveOfEratosthenes.primeNumberGenerator(72));
    }


    private List<Integer> generateExpectedPrimeNumbers(int... primeNumber) {
        List<Integer> primeList = new ArrayList<Integer>();

        for(int prime : primeNumber) {
            primeList.add(prime);
        }
        return primeList;
    }


}

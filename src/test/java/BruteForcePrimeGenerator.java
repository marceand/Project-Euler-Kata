import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcel on 3/27/2017.
 */
public class BruteForcePrimeGenerator {


    @Test
    public void firstPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(2));
    }

    @Test
    public void firstTwoPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(3));
    }
    @Test
    public void firstThreePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(5));
    }

    @Test
    public void firstFourPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(7));
    }

    @Test
    public void firstFivePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(11));
    }

    @Test
    public void firstSixPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(13));
    }

    @Test
    public void firstSevenPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(17));
    }

    @Test
    public void firstEightPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(19));
    }

    @Test
    public void firstNinePrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19,23);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(23));
    }

    @Test
    public void firstTenthPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers(2,3,5,7,11,13,17,19,23,29);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(29));
    }

    @Test
    public void firstTwentyPrimeNumber() throws Exception{
        List<Integer> expectedPrime = generateExpectedPrimeNumbers( 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
        assertEquals(expectedPrime, TrivialPrimeGenerator.bruteForcePrimeNumberGenerator(71));
    }


    private List<Integer> generateExpectedPrimeNumbers(int... primeNumber) {
        List<Integer> primeList = new ArrayList<Integer>();

        for(int prime : primeNumber) {
            primeList.add(prime);
        }
        return primeList;
    }


    private List<Integer> generateFirstExpectedPrime() {
        List<Integer> primeNumber = new ArrayList<Integer>();
        primeNumber.add(2);
        return primeNumber;
    }


}

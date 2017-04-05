import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marcel on 3/27/2017.
 */
public class TrivialPrimeGenerator {

    public static List<Integer> bruteForcePrimeNumberGenerator(int n) {

        List<Integer> primeList = new ArrayList<Integer>();

        long initialTime = System.currentTimeMillis();
        if(n >= 2) {

            for(int i = 2; i <= n; i++){
                if(isPrime(i)){
                    primeList.add(i);
                }
            }

        }

        long timeElapsed = System.currentTimeMillis()-initialTime;
        System.out.printf("It took %d millisecond to generate all prime numbers less than or equal to %d",timeElapsed,n);

        return primeList;
    }

    private static boolean isPrime(int n) {

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

}

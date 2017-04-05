import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marcel on 4/5/2017.
 */
public class SieveOfEratosthenes {

    public static List<Integer> primeNumberGenerator(int n) {

        List<Integer> primeList = new ArrayList<Integer>();
        boolean[] primes = new boolean[n];

        Arrays.fill(primes,true);

        // 0 and 1 are not prime numbers
        primes[0] = false;
        primes[1] = false;

        long initialTime = System.currentTimeMillis();

        for(int i = 2; i < n; i++){
            if(primes[i]){
                for(int j = 2; i*j < n; j++){
                    primes[i*j] = false;
                }
                primeList.add(i);
            }
        }

        long timeElapsed = System.currentTimeMillis()-initialTime;
        System.out.printf("It took %d millisecond to generate all prime numbers less than or equal to %d",timeElapsed,n);

        return primeList;
    }

}

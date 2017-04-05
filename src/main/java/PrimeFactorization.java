import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel on 3/30/2017.
 */
public class PrimeFactorization {

    public static List<Integer> findPrimeFactors(int n) {

        List<Integer> factorList = new ArrayList<Integer>();

        for(int i = 2; i <= n; i++){
            System.out.println(n);
            if(n%i == 0){
                factorList.add(i);
                n = i;
            }
        }

        return factorList;
    }
}

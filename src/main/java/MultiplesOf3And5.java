/**
 * Created by Marcel on 4/5/2017.
 */
public class MultiplesOf3And5 {
    public static int sumOfAllMultiples(int n) {

        int sum = 0;
        int total_multiple_of_three = n/3;
        int total_multiple_of_five = n/5;

        for(int i = 1; i <= total_multiple_of_three; i++){
                sum = sum + 3*i;
        }

        for(int i = 1; i < total_multiple_of_five; i++){
            if(i%3 != 0) {
                sum = sum + 5*i;
            }
        }

        return sum;
    }
}

/**
 * Created by Marcel on 4/9/2017.
 */
public class EvenFibonacciNumbers {
    public static int sumOfEvenValuedTerms(int lastTerm) {

        int firstTerm = 1;
        int secondTerm = 2;
        int sumOfEvenTerm = 0;

        while(secondTerm < lastTerm){

            if(secondTerm % 2 == 0) {
                sumOfEvenTerm = sumOfEvenTerm + secondTerm;
            }

            int temp = firstTerm;
            firstTerm = secondTerm;
            secondTerm = temp + secondTerm;
        }


        return sumOfEvenTerm;
    }
}

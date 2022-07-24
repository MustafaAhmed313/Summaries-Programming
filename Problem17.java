/*
10.17: (Square numbers) Find the first ten square numbers that are greater than
Long.MAX_VALUE. A square number is a number in the form of n^2
. For example, 4, 9, and 16 are square numbers. Find an efficient approach to run your
program fast.
*/
import java.math.BigInteger;
public class Problem17 {
    public static void main(String[] args){
        BigInteger bigSquare = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;
        while (count < 10) {
            bigSquare = bigSquare.add(BigInteger.ONE);
            System.out.println(bigSquare.pow(2));
            count++;
        }
    }
}

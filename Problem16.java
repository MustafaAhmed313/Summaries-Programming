/*
10.16: (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
divisible by 2 or 3.
*/
import java.math.BigInteger;
public class Problem16 {
    public static void main(String[] args) {
        BigInteger bigNumber = new BigInteger("10000000000000000000000000000000000000000000000000");
        bigNumber.add(BigInteger.ONE);
        int finish = 0;
        while (finish <= 10) {
            if (bigNumber.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    bigNumber.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigNumber);
                finish++;
            }
            bigNumber = bigNumber.add(BigInteger.ONE);
        }
    }
}

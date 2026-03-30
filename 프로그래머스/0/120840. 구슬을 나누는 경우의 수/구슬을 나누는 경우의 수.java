import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger numerator = new BigInteger("1");
        for (int i = share + 1; i <= balls; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        BigInteger denominator = new BigInteger("1");
        for (int i = 1; i <= balls - share; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }
        return (numerator.divide(denominator)).intValue();
    }
}
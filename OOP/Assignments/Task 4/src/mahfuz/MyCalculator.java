package mahfuz;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {

  @Override
  public int divisorSum(int n) {
    int res = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        res += i;
      }
    }
    return res;
  }

  @Override
  public BigInteger findFactorial(int n) {
    BigInteger res = BigInteger.valueOf(1);

    for (int i = 1; i <= n; i++) {
      res = res.multiply(BigInteger.valueOf(i));
    }
    return res;
  }
}

    /*
        Name: Mahfuzur Rahman Chowdhury
        ID: 2012020117
        Section: C
        Email: cse_2012020117@lus.ac.bd
        Date: 12th October, 2021
    */

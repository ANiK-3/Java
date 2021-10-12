package mahfuz;

import java.util.Scanner;

public class M {
  public static void main(String[] args) {
    int num;
    char ch;
    Scanner in = new Scanner(System.in);
    MyCalculator myCal = new MyCalculator();

    do {
      System.out.println("\n1. Divisor Sum \n2. Factorial");
      System.out.print("\n=> Enter a number(Enter e to exit)- ");

      boolean isAnInt = in.hasNextInt();
      if (isAnInt) {
        num = in.nextInt();

        if (num == 1) {
          DS(myCal);
        } else if (num == 2) {
          FF(myCal);
        } else {
          System.out.println("=> Enter a valid number");
        }
      } else {
        ch = in.next().charAt(0);
        if (ch == 'e' || ch == 'E') {
          break;
        } else
          System.out.println("=> Invalid Number.");
      }
      in.nextLine();
    } while (true);

  }

  public static void DS(AdvancedArithmetic myCal) {
    Scanner in = new Scanner(System.in);
    System.out.print("=> Enter a number: ");
    boolean isAnInt = in.hasNextInt();
    if (isAnInt) {
      int n = in.nextInt();
      if (n > 0 && n <= 100) {
        System.out.println("=> Divisor Sum of " + n + " is = " + myCal.divisorSum(n));
      } else
        System.out.println("=> Number should be less than or equal to 100");
    } else
      System.out.println("=> Invalid Number.");
  }

  public static void FF(AdvancedArithmetic myCal) {
    Scanner in = new Scanner(System.in);
    System.out.print("=> Enter a number: ");
    boolean isAnInt = in.hasNextInt();
    if (isAnInt) {
      int n = in.nextInt();
      if (n >= 0 && n <= 50) {
        System.out.println("=> Factorial of " + n + " is = " + myCal.findFactorial(n));
      } else
        System.out.println("=> Number should be less than or equal to 50");
    } else
      System.out.println("=> Invalid Number.");
  }
}

    /*
        Name: Mahfuzur Rahman Chowdhury
        ID: 2012020117
        Section: C
        Email: cse_2012020117@lus.ac.bd
        Date: 12th October, 2021
    */
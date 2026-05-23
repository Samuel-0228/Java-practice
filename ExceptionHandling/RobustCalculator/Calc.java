package RobustCalculator;

import java.util.Scanner;

public class Calc {
    public class division {
        public int num, den;

        Scanner sc = new Scanner(System.in);

        public void getData() {
            System.out.println("Enter the numerator: ");
            num = sc.nextInt();
            System.out.println("Enter the denominator: ");
            den = sc.nextInt();
        }

        public double divide(int num, int den) throws ArithmeticException {
            if (den == 0) {
                throw new ArithmeticException("denominator can not be zero");
            }
            return (double) num / den;

        }
    }

    public static void main(String[] args) {
        division d = new Calc().new division();
        d.getData();
        try {
            System.out.println("The result of the division is: " + d.divide(d.num, d.den));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

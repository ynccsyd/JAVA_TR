package Methods;

import java.util.Scanner;

public class RecursiveExponentiation {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter base number:");
        double base = inp.nextDouble();
        System.out.println("Enter Exponent number:");
        int expo = inp.nextInt();
        double result = calculatePower(base, expo);
        System.out.println(base + "^" + expo + " = " + result);

        inp.close();
    }

    public static double calculatePower(double base, int expo) {
        if (expo == 0) {
            return 1;
        } else if (expo < 0) {
            base = 1 / base; // (a^-n=1/a^n)
            expo = -expo;
        }
        return base * calculatePower(base, expo - 1);
    }
}

// static int power(int base, int exp) {
// int result = 1;

// for (int i = 1; i <= exp; i++) {
// result *= base;
// }
// return result;
// }

// public static void main(String[] args) {
// // f(x)=a^b

// System.out.println(power(2, 5));

// }

package Nivell3.entities;

public class Calculator {

    public int mySum(int a, int b) {
        return a + b;
    }

    public int mySubstraction(int a, int b) {
        return a - b;
    }

    public int myMultiplier(int a, int b) {
        int c = 0;

        if (a > 0 && b < 0) {
            b = b * (-1);
            for (int i = 0; i < b; i++) {
                c += a;
            }
            return c * (-1);
        }

        if (a < 0 && b < 0) {
            b = b * (-1);
            a = a * (-1);
        }

        for (int i = 0; i < b; i++) {
            c += a;
        }
        return c;
    }

    public int myDivider(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Dividing by zero is forbidden by the gods.");
        }

        int c = 0;

        if (a < 0 && b > 0) {
            a = a * (-1);
            while (a >= b) {
                a -= b;
                c++;
            }
            return c * (-1);
        }

        if (a > 0 && b < 0) {
            b = b * (-1);
            while (a >= b) {
                a -= b;
                c++;
            }
            return c * (-1);
        }

        if (a < 0 && b < 0) {
            b = b * (-1);
            a = a * (-1);
        }

        while (a >= b) {
            a -= b;
            c++;
        }
        return c;
    }
}

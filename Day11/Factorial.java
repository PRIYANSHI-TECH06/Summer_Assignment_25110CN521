package Day11;

public class Factorial {
    static long factorial(int n) {

        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num = 5;

        System.out.println("Factorial = " + factorial(num));
    }
}

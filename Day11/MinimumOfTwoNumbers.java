package Day11;

public class MinimumOfTwoNumbers {


    static int minimum(int a, int b) {
        if(a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("Minimum = " + minimum(15, 8));
    }
}


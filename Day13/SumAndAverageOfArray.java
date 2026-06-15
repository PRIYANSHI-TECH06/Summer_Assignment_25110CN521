package Day13;

import java.util.Scanner;

public class SumAndAverageOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double)sum / 5;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        sc.close();
    }
}


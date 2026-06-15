package Day14;

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 2, 4, 2, 5};

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                count++;
        }

        System.out.println("Frequency = " + count);
        sc.close();
    }
}

package Day22;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if(str.isEmpty())
            System.out.println("Words = 0");
        else
            System.out.println("Words = " + str.split("\\s+").length);
        sc.close();
    }
}

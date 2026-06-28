package Day24;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() == str2.length() && (str1 + str1).contains(str2))
            System.out.println("String is Rotation");
        else
            System.out.println("String is Not Rotation");

        sc.close();
    }
}

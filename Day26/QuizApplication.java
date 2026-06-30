package Day26;

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is?");
        System.out.println("1. Language");
        System.out.println("2. Browser");
        System.out.print("Answer: ");
        int ans1 = sc.nextInt();

        if (ans1 == 1)
            score++;

        System.out.println("Q2. 5 + 5 = ?");
        System.out.println("1. 10");
        System.out.println("2. 15");
        System.out.print("Answer: ");
        int ans2 = sc.nextInt();

        if (ans2 == 1)
            score++;

        System.out.println("Your Score = " + score + "/2");

        sc.close();
    }
}

package codechef1000to1400;

import java.util.Scanner;

public class hungryAshish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();    // Ashis has
            int Y = sc.nextInt();    // cost of pizza
            int Z = sc.nextInt();    // cost of burger
            if (X >= Y ) System.out.println("PIZZA");
            else if (X < Y && X >= Z ) System.out.println("BURGER");
            else System.out.println("Nothing");

        }
    }
}

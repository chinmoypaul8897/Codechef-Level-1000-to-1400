package codechef1000to1400;

import java.util.Scanner;

public class electionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int Xa = sc.nextInt();
           int Xb = sc.nextInt();
           int Xc = sc.nextInt();
           if (Xa > 50 ) System.out.println("A");
           else if (Xb > 50 ) System.out.println("B");
           else if (Xc > 50 ) System.out.println("C");
           else System.out.println("NOTA");

        }
    }
}

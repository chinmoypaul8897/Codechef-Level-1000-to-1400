package codechef1000to1400;

import java.util.Scanner;

public class threeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int X = sc.nextInt();   // B-A = X   => A = B - X
            int Y = sc.nextInt();    // C-B = Y   => C = B + Y
            int Z = sc.nextInt();    // A-C = Z
            if (Z == Math.abs(X-Y) || Z == Math.abs(X+Y)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}

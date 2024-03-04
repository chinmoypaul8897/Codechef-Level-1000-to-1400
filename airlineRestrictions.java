package codechef1000to1400;

import java.sql.SQLOutput;
import java.util.Scanner;

public class airlineRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();    // CHECKED IN MAX CAPACITY
            int E = sc.nextInt();    // CARRY ON MAX CAPACITY
            if (D >= A +B && E >= C ) System.out.println("YES");
            else if (D >= C +B && E >= A ) System.out.println("YES");
            else if (D >= A +C && E >= B ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

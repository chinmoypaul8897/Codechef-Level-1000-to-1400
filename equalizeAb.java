package codechef1000to1400;

import java.util.Scanner;

public class equalizeAb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
             if ((B-A) % (2*X) == 0 ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

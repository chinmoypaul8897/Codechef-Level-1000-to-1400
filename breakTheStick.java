package codechef1000to1400;

import java.util.Scanner;

public class breakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // stick length
            int X = sc.nextInt();   // desired length
            if (X % 2== 0 && (N-X) % 2 != 0 )
                System.out.println("NO");
            else System.out.println("YES");

        }
    }
}

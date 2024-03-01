package codechef1000to1400;

import java.util.Scanner;

public class bearAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int  A = sc.nextInt(); //  maximum possible number of candies Limak can eat
            int  B = sc.nextInt();   // maximum possible number of candies Bob can eat
            int limakCount = 1 ;
            int bobCount = 2 ;
            while (A>=limakCount && B>=bobCount )
            {
                A=A-limakCount;
                B=B-bobCount;
                limakCount+=2;
                bobCount+=2;

            }
            if (A  < limakCount) System.out.println("Bob");
            else System.out.println("Limak");
        }
    }
}

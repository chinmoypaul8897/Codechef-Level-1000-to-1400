package codechef1000to1400;

import java.util.Scanner;

public class digitSumParities {
    public  static int digitSum (int N ){
        int sum = 0;
       while (N > 0 ) {
           sum = sum + (N % 10);
            N = N / 10;
        }
       return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (digitSum(N) % 2 == 0 )
            {
                if (digitSum(N+1) % 2 !=0) System.out.println(N+1);
                else System.out.println(N+2);
            }
            else {
                if (digitSum(N+1) % 2 == 0 ) System.out.println(N + 1 );
                else System.out.println(N+2);
            }
        }
    }
}

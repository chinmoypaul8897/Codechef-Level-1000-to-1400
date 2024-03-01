package codechef1000to1400;

import java.util.Scanner;

public class adjacentSumParity {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();    //  the size of the array A .
            int count = 0 ;
            for (int j = 1; j <= N ; j++) {
                int B = sc.nextInt();
                if(B==1) count++;

            }
            if (count%2==0) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}

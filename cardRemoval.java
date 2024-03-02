package codechef1000to1400;

import java.util.Scanner;

public class cardRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] brr = new int[N];
            int [] arr = new int[10];
            for (int j = 0; j < N ; j++) {
                brr[j] = sc.nextInt();
                for (int k = 0; k < 10; k++) {
                    if (brr[j]==k+1) arr[k]++;
                }
            }
            int maxCount = 0 ;
            for (int j = 0; j < 10; j++) {
                maxCount = Math.max(maxCount,arr[j]);
            }
            System.out.println(N-maxCount);
        }
    }
}

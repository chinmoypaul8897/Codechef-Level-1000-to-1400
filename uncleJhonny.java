package codechef1000to1400;

import java.util.Arrays;
import java.util.Scanner;

public class uncleJhonny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j]= sc.nextInt();
            }
            int K = sc.nextInt();    // position of uncle jhony before sorting
            int target = arr[K-1];
            Arrays.sort(arr);
            for (int j = 0; j < N ; j++) {
                if (arr[j]==target)
                    System.out.println(j+1);
            }
        }
    }
}

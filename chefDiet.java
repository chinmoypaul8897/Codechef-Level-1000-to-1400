package codechef1000to1400;

import java.util.Scanner;

public class chefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // no of days
            int K = sc.nextInt();   // amount of protein intake (gm)
            int [] arr = new int[N];
            int [] brr = new int[N];
            boolean flag = false ;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            if (arr[0] < K ) System.out.println("NO" +" " +  1);
            else {
                brr[0] = arr[0];
                for (int j = 1; j < N; j++) {
                    brr[j] = brr[j - 1] - K + arr[j];
                    if (brr[j] < K ) {
                        System.out.println("NO" + " " + (j+1));
                        flag = false ;
                        break;
                    }
                    else flag =  true ;
                }
            }
            if (flag==true) System.out.println("YES");

        }
    }
}

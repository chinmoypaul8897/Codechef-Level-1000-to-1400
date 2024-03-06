package codechef1000to1400;

import java.util.Scanner;

public class makeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the number of bags
            int X = sc.nextInt();  //  maximum limit of coins on each bag
            int C = sc.nextInt();  // cost of each operation
            int [] arr = new int[N];
            int count = 0 ;
            int sum = 0 ;
            for (int j = 0; j < N ; j++) {
                arr[j] = sc.nextInt();
                if (X - arr[j] > C  )
                {
                    arr[j]=X;
                    count++;
                    sum+=X;
                }
                else sum+=arr[j];
            }
            System.out.println(sum - (count*C));

        }
    }
}

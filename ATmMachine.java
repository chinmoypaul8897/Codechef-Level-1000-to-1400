package codechef1000to1400;

import java.util.Scanner;

public class ATmMachine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // no of people
            int K = sc.nextInt();  // total money
            for (int j = 0; j < N ; j++) {
                int A = sc.nextInt();
                if (K>=A) {
                    System.out.print(1);
                    K=K-A;
                }
                else System.out.print(0);


            }
            System.out.println();
        }

    }
}

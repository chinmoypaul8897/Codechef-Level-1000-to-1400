package codechef1000to1400;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class maskPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // total people
            int A = sc.nextInt();    // infected people
            int uninfectedPeople = N - A ;
            if (A > uninfectedPeople) System.out.println(uninfectedPeople);
            else System.out.println(A);
        }
    }
}

package codechef1000to1400;

import java.util.Scanner;

public class chefAndTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            String S1 = sc.next();
            String S2 = sc.next();
            int min = 0 ;
            for (int j = 0; j < S1.length(); j++) {
                if (S1.charAt(i)!=S2.charAt(i) || S1.charAt(i)=='?' || S2.charAt(i)=='?' )
                    min++;
            }
        }
    }
}

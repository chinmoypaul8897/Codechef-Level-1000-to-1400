package codechef1000to1400;

import java.util.Scanner;

public class chefAndTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            String S1 = sc.next();
            char [] ch1 = S1.toCharArray();
            String S2 = sc.next();
            char [] ch2 = S2.toCharArray();
            int max = 0 ;
            int min = 0 ;
            for (int j = 0; j < S1.length(); j++) {
                if (ch2[j]== '?'   ) ch2[j]=1;
            }
            for (int j = 0; j < S1.length(); j++) {
                if ((ch1[j] != '?' &&  ch2[j] != 1 )&& ch1[j] != ch2[j]  ) min++;
            }
            System.out.print(min + " ");
            for (int j = 0; j < S1.length(); j++) {
                if (ch1[j] != ch2[j]  ) max++;
            }
            System.out.println(max);
        }
    }
}

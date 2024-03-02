package codechef1000to1400;

import java.util.Scanner;

public class eventualReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            String S = sc.next();
            int [] arr = new int[26];
            for (int j = 97; j < 123; j++) {
                for (int k = 0; k < N; k++) {
                    if (S.charAt(k)==(char)j) arr[j-97]++;
                }
            }
            boolean flag = true  ;
            for (int j = 0; j < 26; j++) {
               if (arr[j] %  2 != 0 ) {
                   flag = false  ;
                   break;
               }
            }
            if (flag==true ) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}

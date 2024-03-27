package codechef1000to1400;

import java.util.Scanner;

public class mathisonAndPangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int[] arr = new int[26];
            for (int j = 0; j < 26; j++) {
                arr[j] = sc.nextInt();
            }
            String S = sc.next();
            int sum = 0;
            boolean [] present = new boolean[26];
            for (int j = 0; j < S.length() ; j++) {
                int c = S.charAt(j);
                present[c - 97] = true;
            }
            for (int j = 0; j < 26 ; j++) {
                if (present[j]==false)
                    sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}

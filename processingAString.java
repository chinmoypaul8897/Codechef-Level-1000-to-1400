package codechef1000to1400;


import java.util.Scanner;

public class processingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            String S = sc.next();
            int sum = 0 ;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) >= '0' && S.charAt(j) <= '9')
                    sum = sum +( S.charAt(j) -'0' );  // ( S.charAt(j) -'0' ) for getting the int value of the character

            }
            System.out.println(sum);
        }


    }
}

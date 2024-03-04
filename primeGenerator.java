package codechef1000to1400;

import java.util.Scanner;

public class primeGenerator {
    public  static  boolean foundPrime (int N ){
        if (N <= 1 ) return false ;
        else if (N == 2 || N == 3 ) return true ;
        else if (N % 2 == 0 ||  N % 3 == 0  ) return false ;
        for (int i = 5; i *i <= N  ; i+= 6) {     // for checking 6i + 1 and 6i-1 in every iteration
            if (N % i == 0 || N % (i+2)==0) return false ;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            for (int j = m; j <=n ; j++) {
                if (foundPrime(j)==true)
                    System.out.println(j);
            }
            System.out.println();
        }
    }
}

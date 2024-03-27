package codechef1000to1400;

import java.util.Scanner;

public class chefAndCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt(); // no of rounds played
            int chef = 0 ;
            int morty = 0 ;
            for (int j = 0; j < N ; j++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int chefPoints = 0 ;
                int mortyPoints = 0 ;
                while ( A > 0 )
                {
                  chefPoints += A % 10 ;
                  A=A/10;
                }
                while(B > 0 )
                {
                    mortyPoints += B % 10 ;
                    B = B / 10 ;

                }
                if (chefPoints > mortyPoints) chef++;
                else if (mortyPoints > chefPoints) morty++;
                else {
                    chef++;
                    morty++;
                }
            }
            if (chef > morty) System.out.print("0 ");
            else if (morty > chef ) System.out.print("1 ");
            else System.out.print("2 ");
            System.out.println(Math.max(chef,morty));

        }
    }
}

package codechef1000to1400;

import java.util.Scanner;

public class chefAndGlove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // no of chefs finger

            int [] finger = new int[N];
            int [] gloves = new int[N];

            for (int j = 0; j < N ; j++) {
                finger[j] = sc.nextInt();
            }

            for (int j = 0; j < N ; j++) {
                gloves[j] = sc.nextInt();
            }

            int [] backGloves = new int[N];
            for (int j = 0; j < N ; j++) {
                backGloves[j]=gloves[N-1-j];
            }

            boolean front = false;
            boolean back = false;

            for (int j = 0; j < N ; j++) {
                if (finger[j] <= gloves[j])
                    front=true;
                else {
                    front = false;
                    break;
                }
            }
            for (int j = 0; j < N ; j++) {
                if (finger[j] <= backGloves[j])
                    back=true;
                else {
                    back = false;
                    break;
                }
            }
            if (front==true && back==true) System.out.println("both");
            else if (front==true) System.out.println("front");
            else if (back==true) System.out.println("back");
            else System.out.println("none");

        }
    }
}

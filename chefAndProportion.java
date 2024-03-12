package codechef1000to1400;

import java.util.Arrays;
import java.util.Scanner;

public class chefAndProportion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int [] arr = {a,b,c,d};
        Arrays.sort(arr);
        if (arr[0] * arr[3] == arr[1]*arr[2])
            System.out.println("Possible");
        else System.out.println("Impossible");

    }
}

package codechef1000to1400;

import java.util.Scanner;

public class psedoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = 0; j < N-1 ; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    break;
                }
            }
            boolean flag = true ;
            for (int j = 0; j < N-1  ; j++) {
                if (arr[j] > arr[j+1]) flag = false;
            }
            if (flag==false ) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

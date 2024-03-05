package codechef1000to1400;

import java.util.Scanner;

public class magicianVsChef {
    public  static void swap (int [] arr ,int a , int b )
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int N = sc.nextInt();    // total N boxes
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j]=(j+1);
            }
            int X = sc.nextInt();  // places the gold coin into X th box
            int S = sc.nextInt();   // total no of swaps
            for (int j = 0; j < S ; j++) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                swap(arr,A-1,B-1);
            }
            for (int j = 0; j < N ; j++) {
                if (arr[j]==X) System.out.println(j+1);
            }
        }
    }
}

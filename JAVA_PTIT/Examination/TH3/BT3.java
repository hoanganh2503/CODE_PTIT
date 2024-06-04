package TH3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int arr[][] = new int[n][m];
            int a[] = new int[n];
            for(int i = 0; i < n;i++){
                for(int j =0; j < m;j++){
                    arr[i][j] = in.nextInt();
                    if(j == k-1) a[i] = arr[i][j];
                }
            }
            Arrays.sort(a);
            for(int i = 0;i < n;i++){
                for(int j = 0;j < m;j++){
                    if(j == k-1) System.out.print(a[i] + " ");
                    else System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

import java.util.*;
import java.io.*;
public class Sap_xep_ma_tran {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[n][m];
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    if(j == k-1) a[i] = arr[i][j];
                }
            }
            Arrays.sort(a);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++) {
                    if(j == k-1) System.out.printf("%d ", a[i]);
                    else System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Cho_ma_tran_A_co_kich_thuoc_NM {
         public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        int t = sc.nextInt();
        while(sc.hasNext()){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int arr[][] = new int[n][m];
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                for(int j = 0; j <m; j++){
                    arr[i][j] = sc.nextInt();
                    if(j == k-1) a.add(arr[i][j]);
                }
            }
            Collections.sort(a);
            for(int i = 0; i < n; i++){
                for(int j = 0; j <m; j++){
                    if(j == k-1) System.out.print(a.get(i) + " ");
                    else System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}

import java.util.*;
public class Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        while(t-- > 0){
            k++;
            int n = sc.nextInt(), m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + k + ":");
            for(int i = 0; i <n ; i++){
                for(int j = 0 ; j < n ; j++){
                    int temp = 0;
                    for(int l = 0; l < m ; l++){
                        temp += arr[i][l]*arr[j][l];
                    }
                    System.out.print(temp+" ");
                }
                System.out.println();
            }
        }
    }
}

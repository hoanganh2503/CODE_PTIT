import java.util.*;
public class Ma_tran_xoan_oc_tang_dan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n*n];
        int arr[][] = new int[n][n];
        for(int i=0; i<n*n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int cnt = 0;
        int hang = 0, cot = n-1, hang1 = n-1, cot1 = 0;
        while(cnt < n*n){
            for(int i = hang; i <= cot ; i++){
                if(cnt == n*n) break;
                arr[hang][i] = a[cnt++];
            }
            hang++;
            for(int i = hang; i <= hang1 ; i++){
                if(cnt == n*n) break;
                arr[i][hang1] = a[cnt++];
                
            }
            cot--;
            for(int i = cot ; i >= cot1 ; i--){
                if(cnt == n*n ) break;
                arr[hang1][i] = a[cnt++];
                
            }
            hang1--;
            for(int i = hang1 ; i >= hang ; i--){
                if(cnt == n*n) break;
                arr[i][cot1] = a[cnt++];
                
            }
            cot1++;
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

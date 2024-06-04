import java.util.*;
public class Day_con_co_k_phan_tu_tang_dan {
    static int cnt = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int arr[] = new int[n+1];
            int a[] = new int[n+1];
            for (int i = 1; i <= n; i++){
                arr[i] = i;
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Try(arr, a, n, k, 1);
        }

    }

    static void Try(int[] arr, int a[], int n, int k, int j){
        for(int i = arr[j-1] + 1 ; i <= n - k + j ; i++){
            arr[j] = i;
            if(j == k){
                show(arr, a, k);
                cnt++;
            }else Try(arr, a, n, k, j+1);
        }
    }

    static void show(int[] arr, int a[], int k){
        for(int i = 1; i <= k; i++){
            System.out.print(a[arr[i]] + " ");
        }
        System.out.println();
    }
}

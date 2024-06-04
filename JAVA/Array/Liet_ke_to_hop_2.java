import java.util.*;
public class Liet_ke_to_hop_2 {
    static int cnt = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++){
            arr[i] = i;
        }
        Try(arr, n, k, 1);
        System.out.println("\nTong cong co "+cnt+" to hop");
    }

    static void Try(int[] arr, int n, int k, int j){
        for(int i = arr[j-1] + 1 ; i <= n - k + j ; i++){
            arr[j] = i;
            if(j == k){
                show(arr, k);
                cnt++;
            }else Try(arr, n, k, j+1);
        }
    }

    static void show(int[] arr, int k){
        for(int i = 1; i <= k; i++){
            System.out.print(arr[i]);
        }
        System.out.print(" ");
    }
}

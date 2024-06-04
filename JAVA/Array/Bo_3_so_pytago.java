import java.util.*;
public class Bo_3_so_pytago {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i = 0; i < n; i++){
                long a = sc.nextInt();
                arr[i] = a*a;
            }
            Arrays.sort(arr);
            if(handle(arr, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static boolean handle(long[] arr, int n){
        for(int i = n-1 ; i >= 2 ; i--){
            int l = 0, r = i-1;
            while(l < r){
                if(arr[l] + arr[r] == arr[i]) return true;
                int a = (arr[l] + arr[r] < arr[i]) ? l++ : r--;
            }
        }
        return false;        
    }

}

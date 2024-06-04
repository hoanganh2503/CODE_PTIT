import java.util.*;
public class So_xa_cach {
    static boolean ok = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            ok = true;
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            for(int i = 1; i <= n; i++){
                arr[i] = i;
            }
            while(ok) {
                if(check(arr, n)){
                    for(int i = 1; i <= n; i++) System.out.print(arr[i]);
                    System.out.println();                    
                }
                sinh(arr, n);
            }
        }
    }

    static void sinh(int[] a, int n){
        int i = n-1;
        while(i >= 1 && a[i] > a[i+1]) i--;
        if(i == 0) ok = false;
        else{
            int j = n;
            while(a[i] > a[j]) j--;
            int tmp = a[j];
            a[j] = a[i];
            a[i] = tmp;
            int l = i +1, r = n;
            while(l < r){
                int temp = a[l];
                    a[l] = a[r];
                    a[r] = temp;
                l++;
                r--;
            }
        }

    }


    static boolean check(int[] arr, int n) {
        for(int i = 1 ; i < n ; i++) {
            if(Math.abs(arr[i] - arr[i+1]) == 1)
            return false;
        }
        return true;
    }
}

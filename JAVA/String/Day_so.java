import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Day_so {
    static Set<String> ans = new TreeSet<>();
    public static void main(String[] args) throws FileNotFoundException{  
        FileInputStream s = new FileInputStream("DAYSO.in");
        Scanner sc = new Scanner(s);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        int a[] = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int k = 2; k < n; k++) {
            for(int i=0; i<=n; i++) {
                a[i] =i;
            }
            handle1(a, arr, n, k);
        }
        for(String it:ans) System.out.println(it);
    }

    static void handle1(int[] arr, int a[], int n, int k){
        boolean check = true;
        show1(arr, a,  k);
        while(check){
            int l = k;
            while(arr[l] == n-k+l) l--;
            if(l > 0){
                arr[l]++;
                for(int j = l+1; j <= k ; j++){
                    arr[j] = arr[j-1]+1;
                }
                show1(arr, a, k);
            }
            else check = false;
        }
    }
    static void show1(int arr[], int a[],  int k) {
        String s = "";
        for(int i = 1 ; i <= k ; i++){
            if(a[arr[i]] > a[arr[i+1]] && i != k) return;
            s+=a[arr[i]] + " ";
        }
        ans.add(s);
    }
}

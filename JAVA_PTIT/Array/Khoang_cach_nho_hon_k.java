import java.util.*;
public class Khoang_cach_nho_hon_k {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long res=0;
            for(int i =0 ; i<n-1; i++){
                int ans = handle1(arr,n,i+1,n-1,arr[i]+k-1);
                res+= ans-i-1;
            }
            System.out.println(res);
        }
    }

    static int handle(int arr[], int n, int k){
        Arrays.sort(arr);
        int ans = 0;    
        for(int i = 0; i < n -1 ; i++){
            int a = handle1(arr,n,i+1,n-1,arr[i]+k-1);
            ans+= a-i-1;
        }
        return ans;
    }

    static int handle1(int arr[], int n, int l, int r, int x){
        int res=n;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] > x){
                res=mid;
                r=mid-1;
            }else{
                l= mid+1;
            }
        }
        return res;
    }
}
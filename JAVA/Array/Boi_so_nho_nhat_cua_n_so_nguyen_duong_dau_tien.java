import java.util.*;
public class Boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static void main(String[] args){
        long arr[] = new long[101];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<=100 ; i++){
            arr[i] = BCNN(arr[i-1], i);
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(arr[n]);
        }

    }  

    
    public static long UCLN(long a, long b){
        if(b == 0) return a;
        return UCLN(b, a%b);
    }

    public static long BCNN(long a, long b){
        return a*b / UCLN(a, b);
    }

}   

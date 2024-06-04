import java.util.Scanner;
public class Kiem_tra_so_Fibonacci {

    static boolean checkFibo(long fibo[], int l, int h, long x){
        if(l <= h){
            int m = l + (h-l)/2;
            if(x == fibo[m]){
                return true;
            }
            if(x < fibo[m]){
                return checkFibo(fibo, l, m-1, x);
            }
            if(x > fibo[m]){
                return checkFibo(fibo, m+1, h, x); 
            }
        }
        return false;
    }
    public static void main(String[] args){
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2 ; i <= 92 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            if(checkFibo(fibo, 0, 92, n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

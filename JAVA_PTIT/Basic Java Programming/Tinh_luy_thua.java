import java.util.Scanner;
public class Tinh_luy_thua {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        long a = 1, b = 1;
        while(true){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 & b == 0) break;
            System.out.println(Pow(a, b));
        }
        
    }

    static long Pow(long a, long b){
        long mod = (long)(Math.pow(10, 9) + 7);  
        if(b == 0) return 1;
        long x = Pow(a, b/2);   
        if(b%2 == 0) return (x*x)%mod;
        return ((x*x)%mod*a)%mod;
    }
}

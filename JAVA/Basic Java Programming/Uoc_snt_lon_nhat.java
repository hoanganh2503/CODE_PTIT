import java.util.Scanner;
public class Uoc_snt_lon_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            System.out.println(checkSnt(n));
        }
    }

    static long checkSnt(long n) {
        long ans = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(ktnt(n/i)) return n/i;
                else if (ktnt(i)) ans = i;
            }
        }

        return ans;
    }

    static boolean ktnt(long n) {
        if(n < 2 || n%2 == 0) return false;
        if(n == 2) return true;
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n%i == 0) return false;
        }
        return true;
    }
}

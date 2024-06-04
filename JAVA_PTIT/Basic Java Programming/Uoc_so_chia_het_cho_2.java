import java.util.Scanner;
public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            long m = n;
            long cnt = 0;
            while(m%2==0){
                m/=2;
                cnt++;
            }
            long ans = cnt;
            if(m >= 3) ans += cnt;
            for(long i=3; i<=Math.sqrt(m); i+=2){
                if(m%i==0){
                    ans+=cnt;
                    if(m%(m/i)==0 && m/i != i) ans += cnt;
                }
            }
            System.out.println(ans);
        }
    }
}
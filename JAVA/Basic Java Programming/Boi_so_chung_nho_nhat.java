import java.util.*;
import java.math.BigInteger;
public class Boi_so_chung_nho_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(lcm(s1, s2));
        }
    }

    static BigInteger lcm(String s1, String s2){
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger ans = a.multiply(b).divide(a.gcd(b));
        return ans;
    }
}
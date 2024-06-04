import java.math.BigInteger;
import java.util.*;
public class Tong_2_so_nguyen_lon_1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger s1 = new BigInteger(sc.next());
            BigInteger s2 = new BigInteger(sc.next());
            String ans  = "";
            ans = s1.add(s2).abs().toString();    
            while(ans.length() < Math.max(s1.toString().length(), s2.toString().length())) {
                ans = '0' + ans;
            }
            System.out.println(ans);
        }

    }
}
import java.util.*;
import java.math.BigInteger;
public class Chia_het {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger s1 = new BigInteger(sc.next());
            BigInteger s2 = new BigInteger(sc.next());
            if(s1.mod(s2).toString() == "0" || s2.mod(s1).toString() == "0") System.out.println("YES");
            else System.out.println("NO"); 
        }
    }
}

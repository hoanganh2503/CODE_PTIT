import java.util.*;
import java.math.BigInteger;
public class Chia_het_cho_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger s1 = new BigInteger(sc.next());
            BigInteger s2 = new BigInteger("11");
            if(s1.mod(s2).toString() == "0") System.out.println(1);
            else System.out.println(0); 
        }
    }
}

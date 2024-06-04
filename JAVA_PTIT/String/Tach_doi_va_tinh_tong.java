import java.util.*;
import java.math.BigInteger;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Tach_doi_va_tinh_tong {
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream f = new FileInputStream("DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            BigInteger s = new BigInteger(sc.nextLine());
            handle(s);
        }
        
    }

    public static void handle(BigInteger str){
        String s = str.toString();
        while(s.length() != 1){
            BigInteger a = new BigInteger(s.substring(0, s.length()/2));
            BigInteger b = new BigInteger(s.substring(s.length()/2));
            s = a.add(b).toString(0);
            System.out.println(s);
        }
    }
}

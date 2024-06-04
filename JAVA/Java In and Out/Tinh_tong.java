import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Tinh_tong {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner( file);
        long tong = 0;
        while(sc.hasNext()){
            String str = sc.next();
            if(isNumeric(str)) tong += Integer.parseInt(str);
        }
        System.out.println(tong);
    }

    public static boolean isNumeric(String str) { 
        try {  
          Integer.parseInt(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }

}

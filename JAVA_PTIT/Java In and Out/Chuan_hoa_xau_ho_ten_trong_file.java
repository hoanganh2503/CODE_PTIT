import java.io.*;
import java.util.*;
public class Chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.equals("END")) break;
            System.out.println(formatName(str));
        }
    }

    public static String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans;
    }

}

import java.util.*;
public class Chuan_hoa_cau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            if(str.isEmpty()) break;
            s+= " " + str;
            if(str.charAt(str.length()-1) != '!' && str.charAt(str.length()-1) != '?' && str.charAt(str.length()-1) != '.')
                s += ".";
        }
        String new_str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split("(?<=\\. |! |\\?)");
        for(String it: new_str){
            it = it.trim();
            char c = it.charAt(it.length()-1);
            int i = it.length()-2;
            while(it.charAt(i) == ' ' && i >= 0) i--;
            it = it.substring(0, i+1) + c;
            System.out.println(it.substring(0, 1).toUpperCase() + it.substring(1, it.length()));
        }
    }
}

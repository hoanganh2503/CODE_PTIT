import java.util.*;
public class Xu_li_van_ban {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()) break;
            s += line + " ";
        }
        String str[] = s.replaceAll("\\s\\s+", " ").replaceAll("\\?", "\\.").replaceAll("\\!", "\\.").toLowerCase().split("\\.");
        for (String it : str){
            it = it.trim();
            if(it.length() > 0){
                it = it.substring(0, 1).toUpperCase() + it.substring(1);
                System.out.println(it);                
            }

        }
    }
}

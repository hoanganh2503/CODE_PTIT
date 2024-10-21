import java.io.*;
import java.util.*;
public class bt3 {

    public static boolean checkStr(String str){
        if(str.contains(".") || str.contains("?") || str.contains(",") || str.contains("!") || str.contains(":")) return false;

        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i)  >= '0' && str.charAt(i) <= '9')return true;

        return false;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        String s = "";
        while(sc.hasNextLine()) {
            s += sc.nextLine() + " ";
        }
        Set<String> set = new TreeSet<String>();
        String str[] = s.trim().replaceAll("\\s+", " ").split(" ");
        for(String it : str) {
            if(checkStr(it)) set.add(it);
        }
        for(String it : set)  System.out.println(it);
    }

}
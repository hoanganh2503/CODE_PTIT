import java.util.*;
import java.io.*;

public class Tong_chu_so {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) sc.readObject();
        for(String it:list){
            String ans = "";
            for(int i=0; i<it.length(); i++){
                if(it.charAt(i) >= '0' && it.charAt(i) <= '9'){
                    if(ans.length() == 0 && it.charAt(i) == '0') continue;
                    ans += it.charAt(i);
                }
            }
            int a = 0;
            for(int i = 0 ; i < ans.length() ; i++){
                a += ans.charAt(i) - '0';
            }
            System.out.println(ans + " " + a);
        }
    }
}

import java.util.*;
public class Rut_gon_xau_ky_tu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length()-1; i++){
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            while((a == b) && str.length() > 0){
                str = str.substring(0, i)+str.substring(i+2);
                i--;
                if(str.length() <= 1 || i < 0) break;
                a = str.charAt(i);
                b = str.charAt(i+1);
            }
        }
        if(str.length() > 0) System.out.println(str);
        else System.out.println("Empty String");
    }
}
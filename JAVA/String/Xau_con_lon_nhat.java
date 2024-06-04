import java.util.*;
public class Xau_con_lon_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int j = 0, i;
        while(j<s.length()){
            char max = s.charAt(j);
            for( i = j ; i < s.length() ; i++){
                if(s.charAt(i) > max){
                    max = s.charAt(i);
                    j = i;
                }
            }

            for( i = j ; i < s.length() ; i++){
                if(s.charAt(i) == max){
                    System.out.print(s.charAt(i));
                    j = i + 1;
                }
            }            
        }


    }
}
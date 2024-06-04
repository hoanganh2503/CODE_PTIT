import java.util.*;
import java.io.*;

public class Tim_vi_tri_xau_con {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            int n = s1.length();
            int m = s2.length();
            boolean check = false;
            for(int i = 0; i < n-m + 1; i++) {
                // System.out.println(s2);
                // System.out.println(i+m);
                if(s2.equals(s1.substring(i, i+m))){
                    System.out.print(i+1 + " ");
                    check = true;
                } 
            }        
            if(check) System.out.println();  
        }
 
    }
}

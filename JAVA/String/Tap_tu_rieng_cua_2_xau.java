import java.util.*;
public class Tap_tu_rieng_cua_2_xau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            Set<String> set1 = new HashSet<String>();
            Set<String> set2 = new HashSet<String>();
            String[] tmp1 = str1.split("\\s");
            String[] tmp2 = str2.split("\\s");
            for(String it: tmp1){
                set1.add(it);
            }
            for(String it: tmp2){
                set2.add(it);
            }
            Set<String> set3 = new HashSet<String>(set1);
            set3.removeAll(set2);
            for(String it: set3){
                 System.out.print(it+" ");
            }
           System.out.println();
        }
    }
}

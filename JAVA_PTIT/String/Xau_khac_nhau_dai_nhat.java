import java.util.*;
public class Xau_khac_nhau_dai_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.equals(s2)) System.out.println("-1");
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}

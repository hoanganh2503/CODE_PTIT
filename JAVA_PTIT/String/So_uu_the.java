import java.util.*;
public class So_uu_the {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            check(str);
        }
    }
    static void check(String str){
        if(str.length() % 2==0){
            int dem1 = 0;
            int dem2 = 0;
            for(int i=0; i<str.length(); i++){
                int a = str.charAt(i) - '0';
                if(a < 0 || a >9){
                    System.out.println("INVALID");
                    return;
                }
                if(a % 2 == 0) dem1++;
                else dem2++;
            }
            if(dem1 > dem2) System.out.println("YES");
            else System.out.println("NO");
        }else{
            int dem1 = 0;
            int dem2 = 0;
            for(int i=0; i<str.length(); i++){
                int a = str.charAt(i) - '0';
                if(a < 0 || a >9){
                    System.out.println("INVALID");
                    return;
                }
                if(a % 2 == 0) dem1++;
                else dem2++;
            }
            if(dem2 > dem1) System.out.println("YES");
            else System.out.println("NO");            
        }
    }
}

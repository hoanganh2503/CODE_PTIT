import java.util.*;
public class Loai_bo_100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int ans = 0, a = 0, is_delete = 0;
            for(int i = 0; i < s.length() ; i++){
                if(i != is_delete){
                    is_delete = i;
                    a = 0;
                }                
                while(i>=0 && (i+2) < s.length() && s.charAt(i) == '1' &&s.charAt(i+1) == '0' && s.charAt(i+2) == '0'){
                    a += 3;
                    ans = Math.max(ans, a);
                    s = s.substring(0, i) + s.substring(i+3);
                    i--;
                    int dem = 0;
                    while(i > 0 && s.charAt(i) == '0' && dem <2){
                        i--;
                        dem++;
                    } 
                }
            }
            System.out.println(ans);
        }
        
    }
}
import java.util.*;
public class Tong_2_so_nguyen_lon_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(add(s1, s2));            
        }

    }

    static String add(String s1, String s2){
        String a = reverse(s1);
        String b = reverse(s2);
        String ans = "";
        int x1 = a.length();
        int y1 = b.length();
        int max = Math.max(x1, y1);
        for(int i = max; i > x1; i--) a += '0';
        for(int i = max; i > y1; i--) b += '0';
        int c = 0;
        for(int i = 0 ; i < max; i++){
            int x = a.charAt(i) - '0' + b.charAt(i) - '0' + c;
            c = x/10;
            ans += x%10;
        }
        if(c > 0) ans+=1;
        String req = reverse(ans);
        // int i = 0;
        // while(req.charAt(i) == '0' && req.length()>1){
        //     req = req.substring(1);
        // }
        return req;
    }

    static String reverse(String s){
        StringBuilder a = new StringBuilder(s);
        return a.reverse().toString();
    }

    
}

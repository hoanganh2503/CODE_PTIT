import java.util.*;
public class Tong_giai_thua {
    public static void main(String[] args){
        long ans = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 1;
        for(int i=2; i<=n; i++){
            s*= i;
            ans += s;
        }
        System.out.println(ans);
    }
}

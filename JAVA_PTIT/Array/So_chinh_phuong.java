import java.util.*;
public class So_chinh_phuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            if(Math.pow(Math.round(Math.sqrt(n)), 2) == n) 
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

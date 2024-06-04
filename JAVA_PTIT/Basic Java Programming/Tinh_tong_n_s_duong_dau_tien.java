import java.util.*;

public class Tinh_tong_n_s_duong_dau_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long n = sc.nextLong();
            System.out.println(n*(n+1)/2);
        }
    }

}

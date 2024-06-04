package Tre_nhat_gia_nhat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info info[] = new Info[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            String str[] = sc.nextLine().split(" ");
            info[i] = new Info(str[0], str[1]);
        }
        Arrays.sort(info, (a, b)->{
            return a.nam.compareTo(b.nam) > 0 ? 1 : a.nam.compareTo(b.nam) == 0 ? a.thang.compareTo(b.thang) > 0 ? 1 : a.thang.compareTo(b.thang) ==0 ? a.ngay.compareTo(b.ngay): -1 : -1; 
        });
        System.out.println(info[n-1].ten);
        System.out.println(info[0].ten);
    }
}

package Liet_ke_xuat_nhap_hang_theo_nhom;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            sp[i] = new SP(sc.nextLine(), sc.nextDouble());
        }
        Arrays.sort(sp, (a, b)->{
            return (int)(b.thue - a.thue);
        });
        sc.nextLine();
        char c = sc.next().charAt(0);
        for(int i = 0; i < n ; i++){
            if(c == sp[i].first)
            System.out.printf("%s %.0f %.0f %.0f %.0f %.0f\n", sp[i].ma, sp[i].nhap, sp[i].xuat, sp[i].don_gia, sp[i].tien, sp[i].thue);
        }
    }
}

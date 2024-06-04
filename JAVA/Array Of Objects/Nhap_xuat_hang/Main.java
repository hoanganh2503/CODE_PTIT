package Nhap_xuat_hang;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            sp[i] = new SP(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            sc.nextLine();
            String ma = sc.next();
            double sl_nhap = sc.nextDouble();
            double gia = sc.nextDouble();
            double sl_xuat = sc.nextDouble();
            for(int j = 0 ; j < n ; j++){
                if(ma.equals(sp[j].ma)){
                    System.out.printf("%s %s %.0f %.0f\n", ma, sp[j].ten, gia*sl_nhap, (gia*sl_xuat + gia*sl_xuat*sp[j].lai));
                }
            }
        }
    }
}

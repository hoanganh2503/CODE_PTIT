package Lap_bang_tinh_cong;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        sc.nextLine();        
        NV nv[] = new NV[n];
        for(int i = 0; i < n; i++){
            String ma = "NV"+df.format(i+1);
            String ten = sc.nextLine();
            double luongngay = sc.nextDouble();
            double ngaycong = sc.nextDouble();
            sc.nextLine();
            String chucvu = sc.nextLine();
            
            nv[i] = new NV(ma, ten, luongngay, ngaycong, chucvu);
        }
        for(int i = 0; i < n ; i ++){
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", nv[i].ma, nv[i].ten, nv[i].luong, nv[i].thuong, nv[i].chucvu, nv[i].tong);
        }
    }
}

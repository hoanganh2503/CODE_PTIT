package Xac_dinh_danh_sach_trung_tuyen;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS hs[] = new HS[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            hs[i] = new HS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(hs, (a, b)->{
            return (a.xt < b.xt) ? 1 : (a.xt == b.xt) ? a.ma.compareTo(b.ma) : -1;
        });
        int m  = sc.nextInt();
        double chuan = hs[m-1].xt;
        System.out.printf("%.1f\n", chuan);
        for(HS it: hs){
            String tt = "";
            if(it.xt >= chuan) tt = "TRUNG TUYEN";
            else tt = "TRUOT";
            System.out.printf("%s %s %s %s %s\n", it.ma, it.ten, it.ut, it.total, tt);
        }
    }
}
/* 
3
KV2A002
Hoang Thanh Tuan
5
6
5
KV3B123
Ly Thi Thu Ha
8
6.5
7.5
KV3B122
Ly Thi Thu Ha
8
6.5
7
2
*/
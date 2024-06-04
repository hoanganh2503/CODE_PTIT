package Bang_diem_tuyen_sinh;
import java.util.*;

import Danh_sach_trung_tuyen.HS;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS hs[] = new HS[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            hs[i] = new HS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        for(HS it: hs){
            System.out.printf("%s %s %s %s %s\n", it.ma, it.ten, it.ut, it.total, it.tt);
        }
    }
}
// 2
// KV2A002
// Hoang Thanh Tuan
// 6.2
// 5.8
// 4.3
// KV3B123
// Ly Thi Thu Ha
// 6.1
// 6.2
// 4.5
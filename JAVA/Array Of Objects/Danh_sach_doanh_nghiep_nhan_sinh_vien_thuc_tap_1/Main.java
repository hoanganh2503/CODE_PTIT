package Danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1;
import java.util.*;

import Danh_sach_doanh_nghiep.DN;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DN dn[] = new DN[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            dn[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(dn, (a, b)->{
            return a.sl > b.sl ? -1 : a.sl == b.sl ? a.ma.compareTo(b.ma) : 1;
        });
        for(int i = 0 ; i < n; i++){
            System.out.printf("%s %s %d\n", dn[i].ma, dn[i].ten, dn[i].sl);
        }
    }
}

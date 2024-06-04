package Danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_2;
import java.util.*;
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
        int q = sc.nextInt();
        while(q-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b +" SINH VIEN:");
            for(int i = 0 ; i < n; i++){
                if(dn[i].sl >= a && dn[i].sl <= b)
                System.out.printf("%s %s %d\n", dn[i].ma, dn[i].ten, dn[i].sl);
            }            
        }

    }
}

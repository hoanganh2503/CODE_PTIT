package Danh_sach_trung_tuyen;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        HS hs[] = new HS[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            hs[i] = new HS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        int tc = sc.nextInt();
        Arrays.sort(hs, (a, b)->{
            return b.tong - a.tong > 0 ? 1 : a.tong == b.tong ? a.ma.compareTo(b.ma) : -1;
        });
        double dc  = hs[tc-1].tong;
        System.out.printf("%.1f\n", dc);
        for(HS it: hs){
            if(it.tong >= dc) it.tt =  "TRUNG TUYEN";
            else it.tt = "TRUOT";
            System.out.printf("%s %s %s %s %s\n", it.ma, it.ten, it.ut, it.total, it.tt);
        }
    }
}

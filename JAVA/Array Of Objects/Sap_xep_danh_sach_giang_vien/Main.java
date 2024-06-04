package Sap_xep_danh_sach_giang_vien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        GV gv[] = new GV[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            gv[i] = new GV("GV"+df.format(i+1), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(gv, (a, b)->{
            return a.ten.compareTo(b.ten) > 0 ? 1 : a.ten.compareTo(b.ten) == 0 ? a.ma.compareTo(b.ma) : -1;
        });
        for(int i=0; i<n; i++){
            System.out.printf("%s %s %s\n", gv[i].ma, gv[i].hoten, gv[i].nganh);
        }
    }
}

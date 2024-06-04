package Hoc_bong_sinh_vien;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        SV sv[] = new SV[n];
        SV sv1[] = new SV[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv[i] = new SV(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sv1[i] = sv[i];
        }
        Arrays.sort(sv1, (a, b)->{
            return a.getDiem() > b.getDiem() ? -1 : 1;
        });
        double diem = sv1[m-1].getDiem();
        for(SV it:sv){
            String tt = "";
            if(it.getDiem() >= diem) tt = it.getLoai();
            else tt = "KHONG";
            System.out.println(it.getTen() + ": " + tt);
        }
    }
}

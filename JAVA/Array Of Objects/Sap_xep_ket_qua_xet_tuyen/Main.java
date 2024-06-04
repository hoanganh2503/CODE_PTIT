package Sap_xep_ket_qua_xet_tuyen;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        PH ph[] = new PH[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            ph[i] = new PH("PH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(ph, (a, b)->{
            return a.diem > b.diem ? -1 : a.diem == b.diem ? a.ma.compareTo(b.ma) : 1;
        });
        for(PH it: ph) {
            System.out.printf("%s %s %.0f %.0f %s\n", it.ma, it.ten, it.tuoi, it.diem, it.xl);
        }
    }
}

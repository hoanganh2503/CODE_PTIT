package Danh_sach_doi_tuong_sinh_vien_3;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        int i = 0;
        SV svs[] = new SV[t];
        DecimalFormat it = new DecimalFormat("000");
        while(t-->0){
            sc.nextLine();
            String maSv = "B20DCCN"+it.format(i+1);
            svs[i++] = new SV(maSv, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        Arrays.sort(svs, (a, b) -> {
            return b.diem.compareTo(a.diem);
        });
        for(int j = 0; j < n ; j++){
            svs[j].ans();
        }
    }
}

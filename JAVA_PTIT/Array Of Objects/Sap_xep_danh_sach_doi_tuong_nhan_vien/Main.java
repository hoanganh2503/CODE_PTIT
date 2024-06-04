package Sap_xep_danh_sach_doi_tuong_nhan_vien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NV nvs[] = new NV[n];
        DecimalFormat df = new DecimalFormat("00000");
        for (int i = 0; i < n; i++) {
            String masv = df.format(i+1);
            nvs[i] = new NV(masv, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(nvs, (a, b)->{
            return a.ngaysinh1.compareTo(b.ngaysinh1);
        });
        for(int i = 0 ; i < n ; i++) {
            nvs[i].ans();
        }
    }
}

package Danh_sach_doi_tuong_sinh_vien_1;
import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        DecimalFormat it = new DecimalFormat("000");
        while(t-->0){
            sc.nextLine();
            String maSv = "B20DCCN"+it.format(i++);
            SV A = new SV(maSv, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            A.ans();
        }
    }
}

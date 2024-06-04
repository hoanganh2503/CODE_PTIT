package Chuan_hoa_danh_sach_sinh_vien;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SV sv[] = new SV[n];
        DecimalFormat df = new DecimalFormat("000");
        for(int i = 0; i < n; i++){
            sv[i] = new SV("B20DCCN" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(SV it:sv) System.out.println(it);
    }
}

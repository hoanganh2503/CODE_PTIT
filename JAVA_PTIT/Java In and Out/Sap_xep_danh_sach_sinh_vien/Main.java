package Sap_xep_danh_sach_sinh_vien;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SV sv[] = new SV[n];
        for (int i = 0; i < n; i++){
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(sv);
        for(SV it:sv) System.out.println(it);
    }
}

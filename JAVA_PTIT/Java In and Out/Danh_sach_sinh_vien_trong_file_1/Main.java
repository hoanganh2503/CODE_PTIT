package Danh_sach_sinh_vien_trong_file_1;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SV sv[] = new SV[n];
        for(int i=0; i<n; i++){
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(sv, (a, b)->{
            return a.getMa().compareTo(b.getMa());
        });
        for(SV it:sv){
            System.out.printf("%s %s %s %s\n", it.getMa(), it.getTen(), it.getLop(), it.getEmail());
        }
    }
}

package Danh_sach_sinh_vien_trong_file_2;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        DecimalFormat df = new DecimalFormat("000");
        SV sv[] = new SV[n];
        for(int i=0; i<n; i++){
            sv[i] = new SV("B20DCCN"+df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(SV it:sv){
            System.out.printf("%s %s %s %s %.2f\n", it.getMa(), it.getTen(), it.getLop(), it.getNs(), it.getDiem());
        }
    }
}

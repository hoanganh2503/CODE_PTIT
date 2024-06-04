package Danh_sach_luu_tru;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        sc.nextLine();
        DS ds[] = new DS[n];
        for(int i = 0; i < n; i++){
            ds[i] = new DS("KH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds, (a, b)->{
            return (int)(b.getNgay()-a.getNgay());
        });

        for(DS it:ds){
            System.out.printf("%s %s %s %d\n", it.getMa(), it.getTen(), it.getPhong(), it.getNgay());
        }
    }
}

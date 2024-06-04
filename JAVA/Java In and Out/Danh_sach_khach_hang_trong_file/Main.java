package Danh_sach_khach_hang_trong_file;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        KH kh[] = new KH[n];
        DecimalFormat df = new DecimalFormat("KH000");
        for(int i=0; i<n; i++){
            kh[i] = new KH(df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(kh);
        for(KH it: kh) System.out.println(it);
    }
}

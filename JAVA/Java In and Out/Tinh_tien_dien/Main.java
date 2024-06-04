package Tinh_tien_dien;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        DecimalFormat df = new DecimalFormat("KH00");
        int n = sc.nextInt();
        sc.nextLine();
        KH kh[] = new KH[n];
        for(int i = 0; i < n; i++){
            kh[i] = new KH(df.format(i+1), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(kh, (a, b)->{
            return b.getTong() - a.getTong() > 0.0 ? 1: -1;
        });
        for(KH it:kh){
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", it.getMa(), it.getTen(), it.getTrong(), it.getVuot(), it.getThue(), it.getTong());
        }
    }
}

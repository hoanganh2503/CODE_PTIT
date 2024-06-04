package Xep_loai;
import java.util.*;

import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        DecimalFormat df = new DecimalFormat("SV00");
        SV sv[] = new SV[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            sv[i] = new SV(df.format(i+1), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(sv, (a, b)->{
            return b.getDiem() - a.getDiem() > 0 ? 1 : -1;
        });
        for(SV it:sv){
            System.out.printf("%s %s %.2f %s\n", it.getMa(), it.getTen(), it.getDiem(), it.getXL());
        }
    }
}

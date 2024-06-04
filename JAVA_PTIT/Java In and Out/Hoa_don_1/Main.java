package Hoa_don_1;
import java.util.*;

import Tinh_toan_hoa_don_ban_quan_ao.HD;

import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        DecimalFormat df = new DecimalFormat("000");
        int n = sc1.nextInt();
        HD hd[] = new HD[n];
        for(int i = 0; i < n; i++){
            sc1.nextLine();
            hd[i] = new HD(sc1.nextLine(), sc1.nextLine(), sc1.nextDouble(), sc1.nextDouble());
        }

        int m = sc2.nextInt();
        for(int i = 0; i < m; i++){
            sc2.nextLine();
            String ma = sc2.next().trim();
            double sl = sc2.nextDouble();
            double giam_gia = 0;
            if(sl >=150) giam_gia = 5.0/10.0;
            else if(sl >= 100) giam_gia = 3.0/10.0;
            else if(sl >= 50) giam_gia = 15.0/100.0;
            String ma1 = ma.substring(0, 2);
            char loai = ma.charAt(2);
            double gia = 0;
            String ten = "";
            for(HD it:hd){
                if(ma1.equals(it.getMa())){
                    ten = it.getTen();
                    if(loai == '1') gia = it.getLoai1();
                    else gia = it.getLoai2();
                    break;
                }
            } 

            // System.out.println(ma +"-" + df.format(i+1) + " " + ten + " " + sl*giam_gia*gia + " " +sl*gia*(1-giam_gia));
            System.out.printf("%s-%s %s %.0f %.0f\n", ma, df.format(i+1), ten, sl*giam_gia*gia, sl*(1-giam_gia)*gia);
        }
    }
}

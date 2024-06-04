package Hoa_don_2;
import java.util.*;

import Quan_ly_ban_hang_2.KH;
import Quan_ly_ban_hang_2.MH;

import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner kh = new Scanner(new File("KH.in"));
        Scanner mh = new Scanner(new File("MH.in"));
        Scanner hd = new Scanner(new File("HD.in"));
        DecimalFormat df1 = new DecimalFormat("KH000");
        DecimalFormat df2 = new DecimalFormat("MH000");
        DecimalFormat df3 = new DecimalFormat("HD000");
        int a = kh.nextInt();
        kh.nextLine();
        KH kh1[] = new KH[a];
        for(int i = 0; i < a; i++) kh1[i] = new KH(df1.format(i+1), kh.nextLine(), kh.nextLine(), kh.nextLine(), kh.nextLine());
        
        int b = mh.nextInt();
        MH mh1[] = new MH[b];
        for(int i = 0; i < b; i++){
            mh.nextLine();
            mh1[i] = new MH(df2.format(i+1), mh.nextLine(), mh.nextLine(), mh.nextInt(), mh.nextInt());
        }
        
        int t = hd.nextInt();
        for(int i = 0 ; i < t ; i++){
            hd.nextLine();
            String maKH = hd.next().trim();
            String maHD = hd.next().trim();
            int sl = hd.nextInt();

            for(KH it1:kh1){
                if(it1.getMa().equals(maKH)){
                    for(MH it2:mh1){
                        if(it2.getMa().equals(maHD)){
                            double gia = (double)sl*(double)it2.getBan();
                            System.out.printf("%s %s %s %s %s %d %d %d %.0f\n", df3.format(i+1), 
                            it1.getTen(), it1.getDC(), it2.getTen(), it2.getDV(), it2.getMua(), it2.getBan(),
                            sl, gia);
                        }
                    }
                }
            }
        }
    }
}

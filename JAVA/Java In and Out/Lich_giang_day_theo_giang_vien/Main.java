package Lich_giang_day_theo_giang_vien;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        MH mh[] = new MH[n];
        for(int i = 0; i < n; i++){
            mh[i] = new MH(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
        }

        int m = sc2.nextInt();
        sc2.nextLine();
        DecimalFormat df = new DecimalFormat("HP000");
        GD gd[] = new GD[m];
        for(int i = 0; i < m; i++){
            gd[i] = new GD(df.format(i+1), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine(), sc2.nextLine());
        }
        Arrays.sort(gd);
        String ten = sc2.nextLine();
        for(MH it:mh){
            for(GD it1:gd){
                if(it.getMa().equals(it1.getMaMH())){
                    it1.setMon(it.getTen());
                }                
            }

        }
        System.out.println("LICH GIANG DAY GIANG VIEN " + ten + ":");
        for(GD it:gd){
            if(it.getTen().equals(ten)){
                System.out.println(it);
            }
        }
    }
}

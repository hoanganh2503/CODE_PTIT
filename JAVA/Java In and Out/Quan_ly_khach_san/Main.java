package Quan_ly_khach_san;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        DecimalFormat df = new DecimalFormat("KH00");
        int n = sc.nextInt();
        Phong p[] = new Phong[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            p[i] = new Phong(sc.next().trim(), sc.next().trim(), sc.nextDouble(), sc.nextDouble());
        }

        int m = sc.nextInt();
        sc.nextLine();
        KH kh[] = new KH[m];
        for(int i = 0; i < m; i++){
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            kh[i] = new KH(df.format(i+1), ten, ma, sc.nextLine(), sc.nextLine());
            for(Phong it:p){
                if(String.valueOf(ma.charAt(2)).equals(it.getMa())){
                    kh[i].setPhi(it.getGiaNgay(), it.getPhi());
                }
            }
        }
        Arrays.sort(kh);
        for(KH it:kh) System.out.println(it);
    }
}

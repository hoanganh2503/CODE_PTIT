package Tinh_diem_trung_binh;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        DecimalFormat df = new DecimalFormat("SV00");
        int n = sc.nextInt();
        SV sv[] = new SV[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            sv[i] = new SV(df.format(i+1), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(sv, (a, b)->{
        // System.out.println(Double.parseDouble(b.getDiem()) - Double.parseDouble(a.getDiem()) > 0);
            return Double.parseDouble(a.getDiem()) - Double.parseDouble(b.getDiem()) > 0 ? -1 : a.getDiem().equals(b.getDiem()) ? a.getMa().compareTo(b.getMa()) : 1;
        });
        for(int i = 0; i < n; i++){
            if(i == 0) {
               sv[i].setStt(1);
               System.out.printf("%s %s %s %d\n", sv[i].getMa(), sv[i].getTen(), sv[i].getDiem(), sv[i].getStt());
               continue;
            }
            if(sv[i].getDiem().equals(sv[i-1].getDiem())) sv[i].setStt(sv[i-1].getStt());
            else sv[i].setStt(i+1);
            System.out.printf("%s %s %s %d\n", sv[i].getMa(), sv[i].getTen(), sv[i].getDiem(), sv[i].getStt());
        }
    }
}

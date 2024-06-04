package Diem_tuyen_sinh;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        DecimalFormat df = new DecimalFormat("TS00");
        int n = sc.nextInt();
        sc.nextLine();
        HS hs[] = new HS[n];
        for(int i = 0; i < n; i++){
            hs[i] = new HS(df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(hs, (a, b)->{
            return b.getDiem() > a.getDiem() ? 1 : b.getDiem() == a.getDiem() ? a.getMa().compareTo(b.getMa()) : -1;
        });

        for(HS it:hs){
            System.out.printf("%s %s %.1f %s\n", it.getMa(), it.getTen(), it.getDiem(), it.getTT());
        }
    }
}

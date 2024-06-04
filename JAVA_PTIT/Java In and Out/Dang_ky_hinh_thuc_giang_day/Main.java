package Dang_ky_hinh_thuc_giang_day;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        GV gv[] = new GV[n];
        for(int i = 0; i < n; i++){
            gv[i] = new GV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(gv, (a, b) ->{
            return a.getMa().compareTo(b.getMa());
        });

        for(GV it:gv){
            if(it.getHTTT().equals("Truc tuyen"))
            System.out.printf("%s %s %s %s %s\n", it.getMa(), it.getTen(), it.getTC(), it.getLT(), it.getTH());
        }
    }    
}

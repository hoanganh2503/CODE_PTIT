package Quan_ly_bai_tap_nhom_1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        SV sv[] = new SV[n];
        String str[] = new String[m];
        for(int i = 0; i < n; i++) {
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for(int i = 0; i < m; i++) {
            str[i] = sc.nextLine();
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String nhom = sc.nextLine();
            System.out.println("DANH SACH NHOM " + nhom + ":");
            for(SV it:sv){
                if(it.getNhom().equals(nhom)){
                    System.out.println(it);
                }
            }
            System.out.println("Bai tap dang ky: " + str[Integer.parseInt(nhom)-1]);
        }
    }
}


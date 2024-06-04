package Sap_xep_sinh_vien_theo_lop;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        SV sv[] = new SV[n];
        for(int i = 0; i < n; i++){
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(sv, (a, b)-> {
            return a.lop.compareTo(b.lop) > 0 ? 1 : a.lop.compareTo(b.lop) == 0 ? (a.ma.compareTo(b.ma)) : -1;
        });    
        for(int i = 0; i < n ; i++) {
            System.out.printf("%s %s %s %s\n", sv[i].ma, sv[i].ten, sv[i].lop, sv[i].email);
        }
    }
}

package Sap_xep_sinh_vien_theo_ma;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SV sv[] = new SV[1001];
        int n = 0;
        while(sc.hasNextLine()){
            String ma = sc.nextLine();
            if(ma.isEmpty()) break;            
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            sv[n++] = new SV(ma, ten, lop, mail);       

        }
        Arrays.sort(sv, 0, n, (a, b)-> {
            return a.ma.compareTo(b.ma);
        });    
        for(int i = 0; i < n ; i++) {
            System.out.printf("%s %s %s %s\n", sv[i].ma, sv[i].ten, sv[i].lop, sv[i].email);
        }
    }
}

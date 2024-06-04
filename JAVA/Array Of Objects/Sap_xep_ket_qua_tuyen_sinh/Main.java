package Sap_xep_ket_qua_tuyen_sinh;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS hs[] = new HS[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            hs[i] = new HS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(hs, (a, b)->{
            return a.xt - b.xt > 0 ? -1 : a.xt == b.xt ? a.ma.compareTo(b.ma) : 1;
        });
        for(HS it: hs){
            System.out.printf("%s %s %s %s %s\n", it.ma, it.ten, it.ut, it.total, it.tt);
        }
    }
}

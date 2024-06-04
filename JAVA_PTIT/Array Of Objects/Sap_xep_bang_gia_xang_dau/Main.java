package Sap_xep_bang_gia_xang_dau;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        XD xd[] = new XD[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            xd[i] = new XD(sc.next(), sc.nextDouble());
        }
        Arrays.sort(xd, (a, b)->{
            return(int)(b.tong-a.tong);
        });
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %.0f %.0f %.0f\n", xd[i].ma, xd[i].ten, xd[i].gia, xd[i].thue, xd[i].tong);
        }
    }
}

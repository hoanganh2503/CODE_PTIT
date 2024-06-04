package Sap_xep_bang_tinh_tien_dien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        TD td[] = new TD[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            td[i] = new TD("KH" + df.format(i+1), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(td, (a, b)->{
            return (int)(b.tong - a.tong);
        });
        for(int i = 0; i < n ; i++){
            System.out.printf("%s %.0f %.0f %.0f %.0f\n", td[i].ma, td[i].he_so, td[i].tien, (td[i].phu_troi), td[i].tong);
        }
    }
}

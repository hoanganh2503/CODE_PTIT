package Tinh_gia_ban_2;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i = 0 ; i < n ; i++){
            sc.nextLine();
            sp[i] = new SP("MH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(sp, (a, b)->{
            return (int)(b.giaban-a.giaban);
        });
        for(int i = 0 ; i < n ; i++){
            System.out.printf("%s %s %s %.0f %.0f %.0f\n", sp[i].ma, sp[i].ten, sp[i].donvi, sp[i].vc, sp[i].thanhtien, sp[i].giaban);
        }

    }
}

package Tinh_gio;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Hour hours[] = new Hour[n];
        for(int i = 0 ; i < n ; i ++){
            hours[i] = new Hour(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(hours, (a, b)->{
            return a.gio < b.gio ? 1 : a.gio == b.gio ? a.phut < b.phut ? 1 : -1 : -1;
        });
        for(int i = 0 ; i < n ; i++){
            System.out.printf("%s %s %d gio %d phut\n", hours[i].ma, hours[i].ten, hours[i].gio, hours[i].phut);
        }
    }

}

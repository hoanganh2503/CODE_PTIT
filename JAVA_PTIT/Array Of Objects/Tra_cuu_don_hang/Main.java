package Tra_cuu_don_hang;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            sp[i] = new SP(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }        
        for(int i = 0; i < n; i++) {
            System.out.printf("%s %s %s %.0f %.0f\n", sp[i].ten, sp[i].ma, sp[i].stt, sp[i].giam_gia, sp[i].tong);
        }
    }
}

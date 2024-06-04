package Tinh_toan_gia_ban;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            sp[i] = new SP(sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        for(int i = 0; i < n; i++){
            System.out.println(sp[i]);
        }
    }
}

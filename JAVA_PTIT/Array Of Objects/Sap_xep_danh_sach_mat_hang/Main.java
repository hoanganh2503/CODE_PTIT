package Sap_xep_danh_sach_mat_hang;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product Ps[] = new Product[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            Ps[i] = new Product(i+1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }  
        Arrays.sort(Ps, (a, b) -> {
            return a.lai-b.lai < 0 ? 1 : -1;
        });   
        for(int i = 0; i < n ; i++){
            System.out.printf("%d %s %s %.2f\n",Ps[i].stt, Ps[i].ten, Ps[i].nhom, Ps[i].lai);
        }   
    }

}

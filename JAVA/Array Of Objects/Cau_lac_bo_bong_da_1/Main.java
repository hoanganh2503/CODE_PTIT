package Cau_lac_bo_bong_da_1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CLB clb[] = new CLB[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            clb[i] = new CLB(sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            sc.nextLine();
            String ma1 = sc.next();
            double d = sc.nextDouble();
            for(int j = 0 ; j < n ;  j++){
                if(ma1.substring(1, 3).equals(clb[j].ma)){
                    System.out.printf("%s %s %.0f\n", ma1, clb[j].ten, clb[j].gia*d);
                }
                
            }
            
        }
    }
}

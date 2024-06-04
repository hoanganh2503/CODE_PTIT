package Cau_lac_bo_bong_da_2;
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
        ArrayList<CLB> clb1 = new ArrayList<CLB>();
        for(int i = 0; i < q; i++){
            sc.nextLine();
            String ma1 = sc.next();
            double d = sc.nextDouble();
            for(int j = 0 ; j < n ;  j++){
                if(ma1.substring(1, 3).equals(clb[j].ma)) {
                    clb[j].ma1 = ma1;
                    clb[j].dt = d*clb[j].gia;
                    clb1.add(clb[j]);  
                }
                                  
            }
        }
        Collections.sort(clb1, (a, b)->{
            return a.dt > b.dt ? -1 : a.dt == b.dt ? a.ten.compareTo(b.ten) : 1;
        });
        for(CLB it:clb1){
            System.out.printf("%s %s %.0f\n", it.ma1, it.ten, it.dt);
        }
    }
}

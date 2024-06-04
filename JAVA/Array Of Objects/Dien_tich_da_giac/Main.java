package Dien_tich_da_giac;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }
            double s = 0;
                for(int j = 1; j < n-1; j++){
                    s += p[0].tinhDienTich(p[j], p[j+1]);
            }
            // System.out.println(1);
            System.out.printf("%.3f\n", s);
        }
    }
}

import java.util.*;
public class Chia_tam_giac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            double total_S = h/2;
            double S = total_S/n;
            for(int i = (int)n - 1 ; i >= 1 ; i--){
                System.out.print(String.format("%.6f", h*Math.sqrt((double)(total_S-S*i)/total_S)));
                if(i != 1) System.out.print(" "); 
            }
            System.out.println();
        }
    }
}

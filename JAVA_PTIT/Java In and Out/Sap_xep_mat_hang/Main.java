package Sap_xep_mat_hang;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            sp[i] = new SP("MH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(sp, (a, b)->{
            return (int)(b.getLai()-a.getLai());
        });
        for(SP it:sp){
            System.out.printf("%s %s %s %.2f\n", it.getMa(), it.getTen(), it.getNhom(), it.getLai());
        }

    }
}

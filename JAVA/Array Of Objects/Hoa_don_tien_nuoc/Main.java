package Hoa_don_tien_nuoc;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        HD hd[] = new HD[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            hd[i] = new HD("KH" + df.format(i+1), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(hd, (a, b)->{
            return a.getTong() > b.getTong() ? -1 : a.getTong() == b.getTong() ? a.getMa().compareTo(b.getMa()) : 1;
        });
        for(HD it: hd){
            System.out.printf("%s %s %.0f\n", it.getMa(), it.getTen(), it.getTong());
        }
    }
}

package Hoa_don_khach_san;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        KH kh[] = new KH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            kh[i] = new KH("KH" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        Arrays.sort(kh, (a, b)->{
            return a.getTong() > b.getTong() ? -1 : 1;
        });     
        for(KH it:kh){
            System.out.printf("%s %s %s %.0f %.0f\n", it.getMa(), it.getTen(), it.getPhong(), it.getNgay(), it.getTong());
        }   
    }

}

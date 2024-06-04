package Tim_thu_khoa_cua_ki_thi;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = 0.0;
        SV svs[] = new SV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double diem1 = sc.nextDouble() + sc.nextDouble() + sc.nextDouble();
            max = Math.max(max, diem1);
            svs[i] = new SV(String.valueOf(i+1), ten, ngaysinh, diem1);
        }
        for(int i = 0; i < n; i++) {
            if(max == svs[i].diem) svs[i].Ans();
        }
    }
}

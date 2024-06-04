package Liet_ke_nhan_vien_theo_chuc_vu;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NV nv[] = new NV[n];
        DecimalFormat df = new DecimalFormat("00");
        for(int i = 0; i < n ; i++){
            sc.nextLine();
            nv[i] = new NV("NV" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        sc.nextLine();
        String s = sc.nextLine();
        for(int i=0; i<n ; i++){
            if(s.equals(nv[i].chucvu))
            System.out.printf("%s %s %.0f %.0f %.0f %.0f\n", nv[i].ma, nv[i].ten, nv[i].luongcv, nv[i].luongchinh, nv[i].tam_ung, nv[i].conlai);
        }

    }
}

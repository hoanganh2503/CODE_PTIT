package Quan_ly_bai_tap_nhom_2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        SV sv[] = new SV[n];
        String str[] = new String[m];
        for(int i = 0; i < n; i++) {
            sv[i] = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
    
        for(int i = 0; i < m; i++) {
            str[i] = sc.nextLine();
            for(int j =0 ; j < n; j ++){
                if(i + 1 == sv[j].getNhom()) sv[j].setDetai(str[i]);
            }
            
        }
        Arrays.sort(sv);
        for(SV it:sv) System.out.println(it);

    }
}


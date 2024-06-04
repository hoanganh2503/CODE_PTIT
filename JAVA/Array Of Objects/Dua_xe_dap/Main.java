package Dua_xe_dap;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TS ts[] = new TS[n];
        for(int i = 0; i < n; i++){
            ts[i] = new TS(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ts, (a, b)->{
            return a.getVT() > b.getVT() ? -1 : 1;
        });
        for(TS it:ts){
            System.out.printf("%s %s %s %.0f Km/h\n", it.getMa(), it.getTen(), it.getDonVi(), it.getVT());
        }
    }
}

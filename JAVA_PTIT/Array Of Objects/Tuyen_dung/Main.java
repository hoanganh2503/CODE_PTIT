package Tuyen_dung;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        NV nv[] = new NV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            nv[i] = new NV("TS" + df.format(i+1), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(nv, (a, b)->{
            return b.getMark()-a.getMark() > 0 ? 1: -1;
        });

        for(NV it:nv){
            System.out.printf("%s %s %.2f %s\n", it.getId(), it.getName(), it.getMark(), it.getHK());
        }
    }
}

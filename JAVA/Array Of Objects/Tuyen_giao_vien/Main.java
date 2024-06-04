package Tuyen_giao_vien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        GV gv[] = new GV[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            gv[i] = new GV("GV" + df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(gv, (a, b)->{
            return b.getMark() - a.getMark() > 0 ? 1 : b.getMark() == a.getMark() ? a.getId().compareTo(b.getId()) : -1;
        });
        for(GV it:gv){
            System.out.printf("%s %s %s %.1f %s\n", it.getId(), it.getName(), it.getSubject(), it.getMark(), it.getTT());
        }
    }
}

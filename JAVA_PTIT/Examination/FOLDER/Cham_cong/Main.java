package Examination.FOLDER.Cham_cong;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NV nv[] = new NV[n];
        for(int i=0; i<n; i++){
            nv[i] = new NV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(nv, (a, b)->{
            return b.getTG() - a.getTG();
        });
        for(NV it:nv){
            System.out.printf("%s %s %d gio %d phut %s\n", it.getMa(), it.getTen(), it.getGIo(), it.getPhut(), it.getTT());
        }

    }
}
// 2
// 01T
// Nguyen Van An
// 08:00
// 17:30
// 06T
// Tran Hoa Binh
// 09:05
// 17:00
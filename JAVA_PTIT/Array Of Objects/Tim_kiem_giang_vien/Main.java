package Tim_kiem_giang_vien;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int n = sc.nextInt();
        GV gv[] = new GV[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            gv[i] = new GV("GV"+df.format(i+1), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(int i=0; i<n; i++){
                if(gv[i].hoten.toLowerCase().contains(s.toLowerCase()))
                System.out.printf("%s %s %s\n", gv[i].ma, gv[i].hoten, gv[i].nganh);
            }
        }

    }
}

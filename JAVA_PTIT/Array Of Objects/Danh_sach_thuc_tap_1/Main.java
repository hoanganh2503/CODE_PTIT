package Danh_sach_thuc_tap_1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Info info[] = new Info[n];
        for(int i=0; i<n; i++){
            info[i] = new Info(String.valueOf(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(info, (a, b)->{
            return a.ten.compareTo(b.ten);
        });
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s = sc.nextLine();
            for(int i=0; i<n; i++){
                if(s.equals(info[i].dn))
                System.out.println(info[i].stt + " " + info[i].ma + " " + info[i].ten + " " + info[i].lop + " " + info[i].email+ " " + s);
                // System.out.printf("%s %s %s %s %s %s\n", info[i].stt, info[i].ma, info[i].ten, info[i].lop, info[i].email, s);
            }
        }
    }
}

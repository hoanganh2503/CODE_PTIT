package Danh_sach_mon_hoc;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        MH mh[] = new MH[n];
        sc.nextLine();
        for (int i = 0; i < n ; i++){
            mh[i] = new MH(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(mh, (a, b)->{
            return a.getTen().compareTo(b.getTen());
        });
        for(MH it:mh){
            System.out.printf("%s %s %s\n", it.getMa(), it.getTen(), it.getTC());
        }
    }
}

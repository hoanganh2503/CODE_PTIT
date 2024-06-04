package Danh_sach_mon_thi;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        Object P[] = new Object[t];
        int i = 0;
        while(t-->0){
            P[i++] = new Object(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(P, (a, b)->{
            return a.getMa().compareTo(b.getMa());
        });
        for(Object o : P){
            o.getInfo();
        }
    }

}

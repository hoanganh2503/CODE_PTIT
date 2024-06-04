package Danh_sach_doanh_nghiep;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        DN dn[] = new DN[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            dn[i] = new DN(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(dn, (a, b)->{
            return a.ma.compareTo(b.ma);
        });
        for(int i = 0 ; i < n; i++){
            System.out.printf("%s %s %d\n", dn[i].ma, dn[i].ten, dn[i].sl);
        }
    }
}

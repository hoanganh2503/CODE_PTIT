package Examination.FOLDER.Bt3;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            sp[i] = new SP(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(sp, (a, b)->{
            return b.getGia() - a.getGia() > 0 ? 1 : b.getGia() == a.getGia() ? a.getMa().compareTo(b.getMa()) : -1;
        });
        for(SP it:sp){
            System.out.printf("%s %s %d %d\n", it.getMa(), it.getTen(), it.getGia(), it.getBH());
        }
    }
}

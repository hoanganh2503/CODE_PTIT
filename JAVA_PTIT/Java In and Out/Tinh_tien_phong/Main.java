package Tinh_tien_phong;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        DecimalFormat df = new DecimalFormat("KH00");
        int n = sc.nextInt();
        Room room[] = new Room[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            room[i] = new Room(df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        }
        Arrays.sort(room, (a, b)->{
            return (int)(b.getTong()-a.getTong());
        });
        for(Room it:room){
            System.out.printf("%s %s %s %.0f %.0f\n", it.getMa(), it.getTen(), it.getPhong(), it.getNgay(), it.getTong());
        }
    }
}

package Examination.FOLDER.Bt2;
import java.util.*;
import java.text.DecimalFormat;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        DecimalFormat df = new DecimalFormat("KH00");
        int n = sc.nextInt();
        sc.nextLine();
        DS ds[] = new DS[n];
        for(int i = 0; i < n; i++){
            ds[i] = new DS(df.format(i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(ds, (a, b)->{
            return a.getNgay() > b.getNgay() ? -1 : 1;
        });     
        for(DS it:ds){
            System.out.printf("%s %s %s %.0f\n", it.getMa(), it.getTen(), it.getPhong(), it.getNgay());
        }   
    }

}


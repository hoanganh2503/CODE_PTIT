package Tinh_gio_chuan_cho_tung_giang_vien;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String, String> mh = new HashMap<String, String>();
        Map<String, String> gv = new HashMap<String, String>();

        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < a; i++) {
            mh.put(sc.next().trim(), sc.nextLine().trim());
        }

        int b = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < b; i++) {
            gv.put(sc.next().trim(), sc.nextLine().trim());
        }

        int n = sc.nextInt();
        ArrayList<KQ> kq = new ArrayList<KQ>();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String maGV = sc.next().trim();
            String maMH = sc.next().trim();
            double diem = sc.nextDouble();

            KQ e = new KQ(gv.get(maGV), mh.get(maMH), diem);
            kq.add(e);

        }
        sc.nextLine();
        String ma = sc.nextLine();
        String ten = gv.get(ma);
        System.out.println("Giang vien: " + ten);
        double diem = 0;
        for(KQ it:kq){
            if(it.getTen().equals(ten)){
                System.out.println(it);
                diem += it.getGio();
            }
        }
        System.out.printf("Tong: %.2f\n", diem);
        
    }
}

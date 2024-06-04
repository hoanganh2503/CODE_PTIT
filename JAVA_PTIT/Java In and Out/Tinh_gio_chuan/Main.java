package Tinh_gio_chuan;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        Map<String, String> mh = new HashMap<String, String>();
        Map<String, String> gv = new HashMap<String, String>();

        int a = sc1.nextInt();
        sc1.nextLine();
        for(int i = 0; i < a; i++) {
            mh.put(sc1.next().trim(), sc1.nextLine().trim());
        }

        int b = sc2.nextInt();
        sc2.nextLine();
        for(int i = 0; i < b; i++) {
            gv.put(sc2.next().trim(), sc2.nextLine().trim());
        }

        int n = sc3.nextInt();
        ArrayList<KQ> kq = new ArrayList<KQ>();
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < n; i++) {
            sc3.nextLine();
            String maGV = sc3.next().trim();
            String maMH = sc3.next().trim();
            double diem = sc3.nextDouble();
            if(set.contains(maGV)){
                for(KQ it:kq){
                    if(it.getTen().equals(gv.get(maGV))) it.setGio(diem);
                }                
            }else{
                KQ ax = new KQ(gv.get(maGV));
                kq.add(ax);
                ax.setGio(diem);
                set.add(maGV);
            }
            

        }

        for(KQ it:kq) System.out.println(it);
        
    }
}

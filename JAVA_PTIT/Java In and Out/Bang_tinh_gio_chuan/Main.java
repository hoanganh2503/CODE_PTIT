package Bang_tinh_gio_chuan;
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
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String maGV = sc.next().trim();
            String maMH = sc.next().trim();
            double diem = sc.nextDouble();
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

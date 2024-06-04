package Examination.FOLDER.Viet_chuong_trinh_liet_ke_danh_sach_mon_hoc;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        Set<String> set = new TreeSet<String>();
        int k = 0;
        ArrayList<MH> mh = new ArrayList<MH>();
        while(sc.hasNextLine()){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ht = sc.nextLine();
            if(set.contains(ma)) continue;
            else set.add(ma);
            MH it = new MH(ma, ten, ht);
            mh.add(it);
        }
        Collections.sort(mh, (a, b)->{
            return a.getMa().compareTo(b.getMa());
        });
        for(MH it:mh){
            System.out.printf("%s %s %s\n", it.getMa(), it.getMon(), it.getHt());
        }
    }
}

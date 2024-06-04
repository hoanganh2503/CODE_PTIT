package Bang_diem_theo_mon_hoc;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner mh = new Scanner(new File("MONHOC.in"));
        Scanner bd = new Scanner(new File("BANGDIEM.in"));
        Map<String, String> map = new HashMap<String, String>();
        int n = sv.nextInt();
        SV sv1[] = new SV[n];
        sv.nextLine();
        for(int i=0; i<n; i++){
            sv1[i] = new SV(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
        }

        int m = mh.nextInt();
        mh.nextLine();
        for(int i=0; i<m; i++){
            map.put(mh.nextLine(), mh.nextLine());
            String tmp = mh.nextLine();
        }

        int k = bd.nextInt();
        bd.nextLine();
        for(int i=0; i<k; i++){
            String msv = bd.next().trim();
            String mamh = bd.next().trim();
            String diem = bd.nextLine().trim();
            for(SV it:sv1){
                if(msv.equals(it.getMa())){
                    it.setDiem(diem);
                    it.setMamh(mamh);
                } 
            }
        }
        int q = bd.nextInt();
        Arrays.sort(sv1);
        bd.nextLine();
        while(q-->0){
            String ma = bd.nextLine();
            System.out.println("BANG DIEM MON " + map.get(ma) + ":");
            for(SV it:sv1){
                if(it.getMamh().equals(ma)) System.out.println(it);
            }
        }

    }
}

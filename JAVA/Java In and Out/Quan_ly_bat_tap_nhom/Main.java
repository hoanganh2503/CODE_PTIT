package Quan_ly_bat_tap_nhom;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner mh = new Scanner(new File("BAITAP.in"));
        Scanner nhom = new Scanner(new File("NHOM.in"));
        Map<Integer, String> map = new HashMap<>();

        int n = sv.nextInt();
        sv.nextLine();
        SV sv1[] = new SV[n];
        for(int i=0; i<n; i++) sv1[i] = new SV(sv.nextLine(), sv.nextLine(), sv.nextLine());

        int m = mh.nextInt();
        mh.nextLine();
        for(int i=0; i<m; i++){
            map.put(i+1, mh.nextLine());
        }
        
        while(nhom.hasNext()){
            String ma = nhom.next().trim();
            int stt = Integer.parseInt(nhom.next().trim());
            for(SV it:sv1){
                if(ma.equals(it.getMa())){
                    it.setDetai(String.valueOf(stt));
                    it.setTendetai(map.get(stt));
                }
            }
        }
        Arrays.sort(sv1);
        for(SV it:sv1) System.out.println(it);
    }
}

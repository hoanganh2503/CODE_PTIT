package Danh_sach_thuc_tap_3;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dn = new Scanner(new File("DN.in"));
        Scanner tt = new Scanner(new File("THUCTAP.in"));

        int n = Integer.parseInt(sv.nextLine());
        SV svs[] = new SV[n];
        for(int i = 0; i < n; i++){
            svs[i] = new SV(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
            // System.out.printf("%s %s %s %s\n", svs[i].getId(), svs[i].getName(), svs[i].getClasss(), svs[i].getEmail());
        }

        int m = Integer.parseInt(dn.nextLine());
        Map<String, String> map = new HashMap<String, String>();
        DN dns[] = new DN[m];
        for(int i = 0; i < m; i++){
            String tat = dn.nextLine();
            String ten = dn.nextLine();
            String sl = dn.nextLine();
            dns[i] = new DN(tat, ten, sl);
            map.put(tat, ten);
        }

        int q = Integer.parseInt(tt.nextLine());
        TT tts[] = new TT[q];
        for(int i = 0; i < q; i++){
            tts[i] = new TT(tt.next(), tt.next());
        }
        Arrays.sort(tts, (a, b)->{
            return a.getID().compareTo(b.getID());
        });

        int t = Integer.parseInt(tt.next());
        for(int i = 0; i < t ; i++){
            String s = tt.next();
            System.out.println("DANH SACH THUC TAP TAI " + map.get(s) + ":");
            for(TT it:tts){
                if(it.getName().equals(s)){
                    for(DN it2:dns){
                        if(it2.getId().equals(s)){
                            if(it2.getCurrent() < it2.getMax()){
                                it2.setCurrent();
                                for(SV it3:svs){
                                    if(it3.getId().equals(it.getID())){
                                        System.out.printf("%s %s %s\n", it3.getId(), it3.getName(), it3.getClasss());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}

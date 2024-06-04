package Bang_thu_nhap_giao_vien;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GV gv[] = new GV[n];
        Map<String, Integer> map = new HashMap<String, Integer>();
        int k = 0;
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            Double d = sc.nextDouble();
            if(map.containsKey(ma.substring(0, 2))) map.put(ma.substring(0, 2), map.get(ma.substring(0, 2)) + 1);
            else  map.put(ma.substring(0, 2), 1);
            if( (ma.substring(0, 2).equals("HT") && map.containsKey("HT") && map.get("HT") > 1) || (ma.substring(0, 2).equals("HP") && map.containsKey("HP")&& map.get("HP") > 2)) continue;
            gv[k++] = new GV(ma, ten, d);
        }
        for(int i = 0; i < k; i++){
            System.out.printf("%s %s %.0f %.0f %.0f\n", gv[i].ma, gv[i].ten, gv[i].heso, gv[i].phucap, gv[i].tong);
        }
    }
}

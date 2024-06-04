package Bang_ke_nhap_kho;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        Map<String, Integer> map = new HashMap<String, Integer>();
        int n = sc.nextInt();
        SP sp[] = new SP[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ten1 = ten;
            String t[] = ten1.toUpperCase().split(" ");
            String ma = t[0].substring(0, 1) + t[1].substring(0, 1);
            String ma1;
            if(map.containsKey(ma)){
                int k = map.get(ma);
                k++;
                ma1 = ma + df.format(k);
                map.put(ma, k);
            }
            else{
                ma1 = ma + df.format(1);
                map.put(ma, 1); 
            }
            sp[i] = new SP(ma1, ten, sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i < n ; i++){
            System.out.printf("%s %s %.0f %.0f\n", sp[i].ma, sp[i].ten, sp[i].ck, sp[i].tong);
        }
    }
}

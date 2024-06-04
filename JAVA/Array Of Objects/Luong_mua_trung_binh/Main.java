package Luong_mua_trung_binh;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<String, String>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double phut = getMinutes(sc.nextLine(), sc.nextLine());
            double luong_mua = sc.nextDouble();
            if(!map.containsKey(ten)){
                map.put(ten, phut + "|" + luong_mua);
            }else{
                String str = map.get(ten);
                String s[] = str.trim().split("\\|");
                phut += Double.parseDouble(s[0]);
                luong_mua += Double.parseDouble(s[1]);
                // System.out.println(phut + "|" + luong_mua);
                map.put(ten, phut + "|" + luong_mua);
            }
        }
        Set<String> set = map.keySet();
        ArrayList<DS> list = new ArrayList<DS>();
        DecimalFormat df = new DecimalFormat("T00");
        int i = 1;
        for(String it:set){
                String str = map.get(it);
                String s[] = str.trim().split("\\|");
                DS a = new DS(df.format(i++), it, Double.parseDouble(s[0]), Double.parseDouble(s[1]));
                list.add(a);

        }

        for(DS it:list) System.out.println(it);
    }

    public static double getMinutes(String s1, String s2) {
        String str1[] = s1.trim().split(":");
        String str2[] = s2.trim().split(":");
        return (Double.parseDouble(str2[0].trim())*60 + Double.parseDouble(str2[1].trim())) - (Double.parseDouble(str1[0].trim())*60 + Double.parseDouble(str1[1].trim()));
    }
}

package Examination.FOLDER.Institution;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/MONHOC.in"));
        Scanner sc1 = new Scanner(new File("D:/MONHOC1.in"));
        DecimalFormat df = new DecimalFormat("team00");
        Map<String, String> map = new HashMap<String, String>();
        ArrayList<DS> list = new ArrayList<DS>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            map.put(sc.next().trim(), sc.nextLine().trim());
        }
        int m = sc1.nextInt();
        sc1.nextLine();
        int l = 1;
        for(int i = 0; i < m; i++){
            String ma = sc1.next().trim();
            int q = sc1.nextInt();
            sc1.nextLine();
            for(int j = 0; j <q; j++){
                String team = sc1.nextLine();
                DS a = new DS(team, map.get(ma));
                list.add(a);
            }
        }
        Collections.sort(list);
        for(DS it:list) System.out.println(df.format(l++) + " " + it);
    }
}

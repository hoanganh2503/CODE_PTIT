package Danh_sach_ca_thi;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        DecimalFormat df = new DecimalFormat("C000");
        int n = sc.nextInt();
        sc.nextLine();
        TS ts[] = new TS[n];
        for(int i = 0; i < n; i++){
            String dateStr = sc.nextLine();
            String timeStr = sc.nextLine();
            String room = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date datetime = dateFormat.parse(dateStr + " " + timeStr);
            ts[i] = new TS(df.format(i+1), datetime, room);
        }
        Arrays.sort(ts);

        for(TS it:ts){
            System.out.printf("%s %s %s\n", it.getMa(), new SimpleDateFormat("dd/MM/yyyy HH:mm").format(it.getDate()), it.getPhong());
        }
    }

    public static int handle(String ngaya,String ngayb,String gioa,String giob){
        String s1[] = ngaya.split("/");
        String s2[] = ngayb.split("/");
        if(Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]) > 0) return -1;
        if(Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]) > 0) return -1;
        if(Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]) > 0) return -1;

        String str1[] = gioa.split("\\:");
        String str2[] = giob.split("\\:");
        System.out.println(gioa);
        if(gioa.compareTo(str1[0]) > 0) return -1;
        // if(Integer.parseInt(str2[1].trim()) - Integer.parseInt(str1[1].trim()) > 0) return -1;

        return 1;
    }
}

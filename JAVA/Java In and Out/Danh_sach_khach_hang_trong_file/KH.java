package Danh_sach_khach_hang_trong_file;
import java.text.SimpleDateFormat;
import java.util.Date;
public class KH implements Comparable<KH>{
    private String ma, ten, gt, dc;
    private Date date;

    public KH(String ma, String ten, String gt, String ns, String dc){
        this.ma = ma;
        this.ten = formatName(ten);
        this.gt = gt;
        this.dc = dc;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            this.date = sdf.parse(ns);
        }catch(Exception e){};
    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans.trim();
    }

    @Override
    public int compareTo(KH o){
        return this.date.compareTo(o.date);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return this.ma + " " + this.ten + " " + this.gt + " " + this.dc + " " + sdf.format(this.date);
    }
}

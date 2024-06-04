package Danh_sach_ca_thi;
import java.util.*;
public class TS implements Comparable<TS> {
    private String ma, phong;
    private Date date;

    public TS(String ma, Date date, String phong) {
        this.ma = ma.trim();
        this.date = date;
        this.phong = phong.trim();
    }

    @Override
    public int compareTo(TS other) {
        if (this.date.equals(other.date)) {
            return this.ma.compareTo(other.ma);
        }
        return this.date.compareTo(other.date);
    }

    public String getMa() {
        return this.ma;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public String getPhong() {
        return this.phong;
    }
}

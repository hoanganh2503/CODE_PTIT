package Danh_sach_luu_tru;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class DS {
    private String ma, ten, phong;
    private long ngay;

    public DS(String ma, String ten, String phong, String vao, String ra){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.ngay = calculateDate(vao, ra);
    }   

    public long calculateDate(String vao, String ra){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(vao, format);
        LocalDate end = LocalDate.parse(ra, format);
        return ChronoUnit.DAYS.between(start, end);
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getPhong(){
        return this.phong;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public long getNgay(){
        return this.ngay;
    }
}

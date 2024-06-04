package Hoa_don_khach_san;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class KH {
    private String ma, ten, phong;
    private double tong, ngay, tang;

    public KH(String ma, String ten, String phong, String nhan, String tra, double phatSinh){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.ngay = tinhNgay(nhan.trim(), tra.trim()) + 1;
        switch(phong.charAt(0)){
            case '1':
                this.tang = 25;
                break;
            case '2':
                this.tang = 34;
                break;
            case '3':
                this.tang = 50;
                break;
            case '4':
                this.tang = 80;
                break;
        }
        this.tong = this.ngay * this.tang + phatSinh;
    }

    public double tinhNgay(String s1, String s2){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(s1, formatter);
        LocalDate endDate = LocalDate.parse(s2, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return (double)daysBetween;
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getPhong(){
        return this.phong;
    }
    
    public double getNgay(){
        return this.ngay;
    }
    
    public double getTong(){
        return this.tong;
    }
}

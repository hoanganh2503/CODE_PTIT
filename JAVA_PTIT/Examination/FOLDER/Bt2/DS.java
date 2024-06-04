package Examination.FOLDER.Bt2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DS {
    private String ma, ten, phong;
    private double tong, ngay;

    public DS(String ma, String ten, String phong,  String nhan, String tra){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.ngay = tinhNgay(nhan.trim(), tra.trim());
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

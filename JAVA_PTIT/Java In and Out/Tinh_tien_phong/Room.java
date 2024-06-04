package Tinh_tien_phong;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
public class Room {
    private String ma, ten, phong;
    private double don_gia, ngay, tong;

    public Room(String ma, String ten, String phong, String nhan, String tra, double ps){
        this.ma = ma;
        this.ten = formatName(ten);
        this.phong = phong;
        if(phong.charAt(0) == '1') this.don_gia = 25.0;
        else if(phong.charAt(0) == '2') this.don_gia = 34.0;
        else if(phong.charAt(0) == '3') this.don_gia = 50.0;
        else this.don_gia = 80.0;
        this.ngay = calculateDay(nhan.trim(), tra.trim());
        this.tong = this.ngay * this.don_gia + ps;
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
    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans;
    }

    public String formatDate(String s){
        String str[] = s.split("\\/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        return str[0] + "/" + str[1] + "/" + str[2];
    }

    public long calculateDay(String nhan, String tra){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(formatDate(nhan), formatter);
        LocalDate end = LocalDate.parse(formatDate(tra), formatter);
        return ChronoUnit.DAYS.between(start, end)+1;

    }
}

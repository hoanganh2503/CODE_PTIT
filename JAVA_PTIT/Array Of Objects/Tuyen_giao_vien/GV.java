package Tuyen_giao_vien;

public class GV {
    private String ma, ten, mon, tt;
    private double diem, uu_tien;

    public GV(String ma, String ten, String ma1, double diem1, double diem2){
        this.ma = ma;
        this.ten = ten;
        if(ma1.charAt(0) == 'A') this.mon = "TOAN";
        else if(ma1.charAt(0) == 'B') this.mon = "LY";
        else this.mon = "HOA";

        if(ma1.charAt(1) == '1') this.uu_tien = 2.0;
        else if(ma1.charAt(1) == '2') this.uu_tien = 1.5;
        else if(ma1.charAt(1) == '3') this.uu_tien = 1.0;
        else this.uu_tien = 0;
        this.diem = diem1*2 + diem2 + this.uu_tien;
        if(this.diem >= 18) this.tt = "TRUNG TUYEN";
        else this.tt = "LOAI";
    }

    public String getId(){
        return this.ma;
    }
    
    public String getName(){
        return this.ten;
    }
    
    public String getSubject(){
        return this.mon;
    }
    
    public String getTT(){
        return this.tt;
    }
    
    public double getMark(){
        return this.diem;
    }
}

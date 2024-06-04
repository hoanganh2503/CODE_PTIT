package Tuyen_dung;

public class NV {
    private String ma, ten, hk;
    private double diem;

    public NV(String ma, String ten, double d1, double d2){
        this.ma = ma;
        this.ten = ten;
        d1 = d1 > 10 ? d1/10 : d1;
        d2 = d2 > 10 ? d2/10 : d2;
        this.diem = (d1+d2)/2;
        if(this.diem >= 9.5) this.hk = "XUAT SAC";
        else if(this.diem >= 8.0) this.hk = "DAT";
        else if(this.diem >= 5.0) this.hk = "CAN NHAC";
        else this.hk = "TRUOT"; 
    }

    public String getId(){
        return this.ma;
    }
    
    public String getName(){
        return this.ten;
    }
    
    public String getHK(){
        return this.hk;
    }
    
    public double getMark(){
        return this.diem;
    }
}

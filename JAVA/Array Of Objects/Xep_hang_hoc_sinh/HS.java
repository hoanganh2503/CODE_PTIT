package Xep_hang_hoc_sinh;

public class HS {
    public String ma, ten, hk;
    public double diem, rank;

    public HS(String ma, String ten, double diem){
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        if(diem >= 9.0) this.hk = "Gioi";
        else if(diem >= 7.0) this.hk = "Kha";
        else if(diem >= 5.0) this.hk = "Trung Binh";
        else this.hk = "Yeu";
    }
}

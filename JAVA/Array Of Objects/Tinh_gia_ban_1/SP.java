package Tinh_gia_ban_1;

public class SP {
    public String ma, ten, donvi;
    public double  vc, thanhtien, giaban;
    public SP(String ma, String ten, String donvi, double dongianhap, double soluong){
        this.ma = ma;
        this.ten=ten;
        this.donvi = donvi;
        this.vc = dongianhap*soluong*0.05;
        this.thanhtien = dongianhap*soluong + this.vc;
        this.giaban = this.thanhtien*1.02;
    }
}

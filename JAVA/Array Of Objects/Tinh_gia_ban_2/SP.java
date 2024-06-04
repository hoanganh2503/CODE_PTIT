package Tinh_gia_ban_2;

public class SP {
    public String ma, ten, donvi;
    public double  vc, thanhtien, giaban;
    public SP(String ma, String ten, String donvi, double dongianhap, double soluong){
        this.ma = ma;
        this.ten=ten;
        this.donvi = donvi;
        this.vc = Math.ceil(dongianhap*soluong*0.05);
        this.thanhtien = Math.ceil((dongianhap*soluong + this.vc));
        this.giaban = Math.ceil(this.thanhtien*1.02/soluong/100)*100;
    }
}

package Liet_ke_xuat_nhap_hang_theo_nhom;

public class SP {
    public String ma;
    public char first, last;
    public double nhap, xuat, gia, don_gia, tien, thue;

    public SP(String ma, double sl){
        this.ma = ma;
        this.nhap = sl;
        char first = ma.charAt(0);
        char last = ma.charAt(ma.length() - 1);
        this.first = first;
        this.last = last;
        if(first == 'A') this.xuat = Math.round(0.6*sl);
        else this.xuat = Math.round(0.7*sl);
        if(last == 'Y') this.don_gia = 110000;
        else this.don_gia = 135000;
        this.tien = this.xuat * this.don_gia;
        if(first == 'A' && last == 'Y') this.thue = 0.08*this.tien;
        else if(first == 'A' && last == 'N') this.thue = 0.11*this.tien;
        else if (first == 'B' && last == 'Y') this.thue = 0.17*this.tien;
        else this.thue = 0.22*this.tien;
    }

}

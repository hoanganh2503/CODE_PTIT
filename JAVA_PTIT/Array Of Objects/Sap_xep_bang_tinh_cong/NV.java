package Sap_xep_bang_tinh_cong;

public class NV {
    public String ma, ten;
    public double luong, thuong, chucvu, tong;
    public NV(String ma, String ten, double luongngay, double ngaycong, String chucvu){
        this.ma = ma;
        this.ten = ten;
        this.luong = luongngay*ngaycong;
        if(ngaycong>=25) this.thuong = this.luong/5;
        else if(ngaycong >=22) this.thuong = this.luong/10;
        else this.thuong = 0;
        if(chucvu.equals("GD")) this.chucvu = 250000;
        else if(chucvu.equals("PGD")) this.chucvu = 200000;
        else if(chucvu.equals("TP")) this.chucvu = 180000;
        else if(chucvu.equals("NV")) this.chucvu = 150000;
        this.tong = this.luong + this.thuong + this.chucvu;
    }
}

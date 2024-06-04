package Tinh_gio_chuan_cho_tung_giang_vien;

public class KQ {
    private String ten, monhoc;
    private double gio;

    public KQ(String ten, String monhoc, double gio) {
        this.ten = ten;
        this.gio = gio;
        this.monhoc = monhoc;
    }

    public String getTen(){
        return this.ten;
    } 

    public double getGio(){
        return this.gio;
    }

    @Override
    public String toString() {
        return this.monhoc + " " +  this.gio;
    }
}

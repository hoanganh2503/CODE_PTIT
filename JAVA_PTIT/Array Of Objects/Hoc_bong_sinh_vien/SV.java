package Hoc_bong_sinh_vien;

public class SV {
    private String ten, loai;
    private double diem;

    public SV(String ten, double ht, double rl) {
        this.ten = ten;
        this.diem = ht;
        if(ht >= 3.6 && rl >= 90) this.loai = "XUATSAC";
        else if(ht >= 3.2 && rl >= 80) this.loai = "GIOI";
        else if(ht >= 2.5 && rl >= 70) this.loai = "KHA";
        else this.loai = "KHONG";
    }

    public double getDiem(){
        return this.diem;
    }

    public String getTen(){
        return this.ten;
    }

    public String getLoai(){
        return this.loai;
    }
}

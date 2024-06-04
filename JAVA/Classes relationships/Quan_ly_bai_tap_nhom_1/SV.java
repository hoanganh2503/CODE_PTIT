package Quan_ly_bai_tap_nhom_1;

public class SV {
    private String ma, ten, sdt, nhom;

    public SV(String ma, String ten, String sdt, String nhom){
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getNhom(){
        return this.nhom;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sdt;
    }
}

package Quan_ly_bai_tap_nhom_2;

public class SV implements Comparable<SV>{
    private String ma, ten, sdt, nhom, detai;

    public SV(String ma, String ten, String sdt, String nhom){
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public int getNhom(){
        return Integer.parseInt(this.nhom);
    }

    public void setDetai(String str){
        this.detai = str;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sdt + " " + this.nhom + " " + this.detai;
    }

    @Override
    public int compareTo(SV o) {
        return this.ma.compareTo(o.ma);
    }
}

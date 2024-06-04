package Luong_mua_trung_binh;

public class DS {
    private String ma, ten;
    private double tb;

    public DS(String ma, String ten, double phut, double mua) {
        this.ma = ma;
        this.ten = ten;
        this.tb = (mua*60)/(phut);
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.tb);
    }
}

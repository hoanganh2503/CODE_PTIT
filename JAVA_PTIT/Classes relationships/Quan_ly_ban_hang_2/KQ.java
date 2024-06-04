package Quan_ly_ban_hang_2;

public class KQ implements Comparable<KQ>{
    private String ma, ten, dc, tenmh;
    private double sl, thanh_tien, lai;

    public KQ(String ma, String ten, String dc, String tenmh, double sl, double thanh_tien, double lai){
        this.ma = ma;
        this.ten = ten;
        this.dc = dc;
        this.tenmh = tenmh;
        this.lai = lai;
        this.sl = sl;
        this.thanh_tien = thanh_tien;
    }

    @Override
    public int compareTo(KQ o){
        return (int)(o.lai - this.lai);
    }

    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.dc + " " + this.tenmh + " " + String.format("%.0f", this.sl) + " " + String.format("%.0f", this.thanh_tien) + " " + String.format("%.0f", this.lai);
    }
}

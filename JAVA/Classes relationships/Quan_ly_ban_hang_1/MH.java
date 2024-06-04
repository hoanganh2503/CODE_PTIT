package Quan_ly_ban_hang_1;

public class MH {
    private String ma, ten, dv;
    private int mua, ban;

    public MH(String ma, String ten, String dv, int mua, int ban) {
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.ban = ban;
        this.mua = mua;
    }

    public String getMa() {
        return this.ma;
    }

    public String getTen() {
        return this.ten;
    }

    public String getDV() {
        return this.dv;
    }

    public int getMua() {
        return this.mua;
    }

    public int getBan() {
        return this.ban;
    }
}

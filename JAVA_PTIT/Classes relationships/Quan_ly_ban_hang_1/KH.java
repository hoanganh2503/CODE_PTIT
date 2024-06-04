package Quan_ly_ban_hang_1;

public class KH {
    private String ma, ten, ns, dc;

    public KH(String ma, String ten,  String gt, String ns, String dc){
        this.ma = ma;
        this.ten = ten;
        this.ns = ns;
        this.dc = dc;
    }

    public String getMa() {
        return this.ma;
    }

    public String getTen() {
        return this.ten;
    }

    public String getNS() {
        return this.ns;
    }

    public String getDC() {
        return this.dc;
    }
}

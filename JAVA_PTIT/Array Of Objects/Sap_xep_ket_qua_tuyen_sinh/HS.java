package Sap_xep_ket_qua_tuyen_sinh;

public class HS {
    public String ma, ten, tt, ut, total;
    public double tong, uu_tien, xt;

    public HS(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = ten;
        this.tong = d1*2 + d2 + d3;
        if(ma.substring(0,3).equals("KV1")) this.uu_tien = 0.5;
        else if(ma.substring(0,3).equals("KV2")) this.uu_tien = 1;
        else this.uu_tien = 2.5;
        this.xt = this.tong + this.uu_tien;
        if(this.xt >= 24) this.tt = "TRUNG TUYEN";
        else this.tt = "TRUOT";
        this.ut = Math.round(this.uu_tien) == this.uu_tien ? String.valueOf(Math.round(this.uu_tien)) : String.format("%.1f", this.uu_tien);
        this.total = Math.round(this.xt) == this.xt ? String.valueOf(Math.round(this.xt)) : String.format("%.1f", this.xt);

    }
}

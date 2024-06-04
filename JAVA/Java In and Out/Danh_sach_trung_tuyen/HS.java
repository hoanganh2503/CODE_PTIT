package Danh_sach_trung_tuyen;

public class HS {
    public String ma, ten, tt, ut, total;
    public double tong, uu_tien, xt;

    public HS(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = formatName(ten);
        this.tong = d1*2 + d2 + d3;
        if(ma.substring(0,3).equals("KV1")) this.uu_tien = 0.5;
        else if(ma.substring(0,3).equals("KV2")) this.uu_tien = 1;
        else this.uu_tien = 2.5;
        this.xt = this.tong + this.uu_tien;
        this.tong = this.tong + this.uu_tien;
        this.ut = Math.round(this.uu_tien) == this.uu_tien ? String.valueOf(Math.round(this.uu_tien)) : String.format("%.1f", this.uu_tien);
        this.total = Math.round(this.tong) == this.tong ? String.valueOf(Math.round(this.tong)) : String.format("%.1f", this.tong);

    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans.trim();
    }
}

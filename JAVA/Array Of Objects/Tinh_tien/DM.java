package Tinh_tien;

public class DM {
    private String ma, ten;
    private double sl_mua, don_gia, ck, tong;

    public DM(String ma, String ten, double sl, double don_gia, double ck) {
        this.ma = ma;
        this.ten = ten;
        this.sl_mua = sl;
        this.don_gia = don_gia;
        this.ck = ck;
        this.tong = sl*don_gia - ck;
    }

    public double getTong(){
        return this.tong;
    }
    
    public double getSLMua(){
        return this.sl_mua;
    }

    public double getDonGia(){
        return this.don_gia;
    }
    
    public double getCK(){
        return this.ck;
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
}

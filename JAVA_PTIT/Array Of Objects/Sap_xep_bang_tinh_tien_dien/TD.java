package Sap_xep_bang_tinh_tien_dien;

public class TD {
    public String ma;
    public double he_so, tien, phu_troi, tong;

    public TD(String ma, String loai, double cu, double moi){
        this.ma = ma;
        double so = moi-cu;
        if(loai.equals("KD")) this.he_so = 3;
        else if(loai.equals("NN")) this.he_so = 5;
        else if(loai.equals("TT")) this.he_so = 4;
        else if(loai.equals("CN")) this.he_so = 2;
        else this.he_so = 1;
        this.tien = so*this.he_so*550;   
        if(so < 50.0) this.phu_troi = 0;
        else if(so <= 100.0) this.phu_troi = (this.tien/20*7);
        else this.phu_troi = (this.tien);
        this.tong = this.tien + this.phu_troi;
    }
}

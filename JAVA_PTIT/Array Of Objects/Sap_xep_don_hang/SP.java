package Sap_xep_don_hang;

public class SP {
    public String ma, ten, stt;
    public double giam_gia, tong;

    public SP(String ten, String ma, double don_gia, double sl){
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1, 4);
        if(ma.charAt(ma.length()-1) == '1') this.giam_gia = don_gia*sl/2;
        else this.giam_gia = don_gia*sl/10*3;
        this.tong = don_gia*sl - this.giam_gia;
    }
}

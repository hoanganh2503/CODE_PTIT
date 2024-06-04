package Sap_xep_bang_gia_xang_dau;

public class XD {
    public String ma, ten;
    public double gia, thue, tong;

    public XD(String ma, double sl){
        this.ma = ma;

        switch (ma.charAt(0)){
            case 'X':
                this.gia = 128000;
                this.thue = 1.0*3/100;
                break;
            case 'D':
                this.gia = 11200;
                this.thue = 1.0*3.5/100;
                break;
            case 'N':
                this.gia = 9700;
                this.thue = 1.0*2/100;
                break;

        }
        if(ma.substring(ma.length()-2).equals("BP")) this.ten = "British Petro";
        else if(ma.substring(ma.length()-2).equals("ES")) this.ten = "Esso";
        else if(ma.substring(ma.length()-2).equals("SH")) this.ten = "Shell";
        else if(ma.substring(ma.length()-2).equals("CA")) this.ten = "Castrol";
        else if(ma.substring(ma.length()-2).equals("MO")) this.ten = "Mobil";
        else {
            this.ten = "Trong Nuoc";
            this.thue = 0;
        }
        this.tong = sl*this.gia + sl*this.gia*this.thue;
        this.thue = sl*this.gia*this.thue;
    }
}

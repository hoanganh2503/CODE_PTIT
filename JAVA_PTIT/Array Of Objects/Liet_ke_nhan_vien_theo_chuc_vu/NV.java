package Liet_ke_nhan_vien_theo_chuc_vu;

public class NV {
    public String ma, ten, chucvu;
    public double luongcv, luongchinh, tam_ung, conlai;

    public NV(String ma, String ten, String chucvu, double luongcoban, double ngaycong){
        this.ma = ma;
        this.ten = ten;
        if(chucvu.equals("GD")) this.luongcv = 500;
        else if(chucvu.equals("PGD")) this.luongcv = 400;
        else if(chucvu.equals("TP")) this.luongcv = 300;
        else if(chucvu.equals("KT")) this.luongcv = 250;
        else this.luongcv = 100;
        this.chucvu = chucvu;
        this.luongchinh = luongcoban*ngaycong;
        if((this.luongchinh + this.luongcv)*2/3 <25000)
             this.tam_ung = Math.round((this.luongchinh+this.luongcv)*2/3/1000)*1000;
        else this.tam_ung = 25000;
        this.conlai = this.luongchinh + this.luongcv - this.tam_ung;
    }
}

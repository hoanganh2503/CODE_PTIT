package Bang_thu_nhap_giao_vien;

public class GV {
    public String ma, ten;
    public double heso, luong, phucap, tong;

    public GV(String ma, String ten, double luong){
        this.ma = ma;
        this.ten = ten;
        this.heso = Double.parseDouble(ma.substring(2));
        if(ma.substring(0, 2).equals("HT")) this.phucap = 2000000;
        else if(ma.substring(0, 2).equals("HP")) this.phucap = 900000;
        else this.phucap = 500000;
        this.tong = luong*this.heso + this.phucap;
    }
}

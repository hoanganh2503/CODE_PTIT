package Nhap_xuat_hang;

public class SP {
    public String ma, ten;
    public double lai;

    public SP(String ma, String ten, String loai){
        this.ma = ma;
        this.ten = ten;
        if(loai.equals("A")) this.lai =  0.08;
        else if(loai.equals("B")) this.lai = 0.05;
        else this.lai = 0.02;
    }
}

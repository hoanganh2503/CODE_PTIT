package Quan_ly_khach_san;

public class Phong {
    private String ma, ten;
    private double giaNgay, phi;

    public Phong(String ma, String ten, double giaNgay, double phi) {
        this.ma = ma;
        this.ten = ten;
        this.giaNgay = giaNgay;
        this.phi = phi;
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public double getGiaNgay(){
        return this.giaNgay;
    }
    
    public double getPhi(){
        return this.phi;
    }
}

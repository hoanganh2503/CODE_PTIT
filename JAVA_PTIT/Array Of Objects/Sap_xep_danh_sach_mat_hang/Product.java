package Sap_xep_danh_sach_mat_hang;

public class Product {
    public String ten, nhom;
    public double lai;
    public int stt;
    public Product(int stt, String ten, String nhom, double giamua, double giaban){
        this.ten = ten;
        this.nhom = nhom;
        this.lai = giaban-giamua;
        this.stt = stt;
    }
}

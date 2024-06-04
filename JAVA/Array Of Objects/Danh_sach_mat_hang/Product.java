package Danh_sach_mat_hang;

public class Product {
    public String ma, ten, donvi;
    public int giamua, giaban, lai;

    public Product(String ma, String ten, String donvi, int giamua, int giaban){
        this.ma = ma;
        this.ten = ten;
        this.giaban = giaban;
        this.giamua = giamua;
        this.donvi = donvi;
        this.lai = giaban - giamua;
    }
}

package Hoa_don_1;

public class HD {
    private String ma, ten;
    private double loai1, loai2;

    public HD(String ma, String ten, double loai1, double loai2){
        this.ma = ma;
        this.ten = ten;
        this.loai1 = loai1;
        this.loai2 = loai2;
    }

    public String getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }

    public Double getLoai1(){
        return this.loai1;
    }

    public Double getLoai2(){
        return this.loai2;
    }
}

package Examination.FOLDER.Bao_hanh_san_pham;

public class SP {
    private String ma, ten;
    private int gia, bao_hanh;

    public SP(String ma, String ten, int gia, int bao_hanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bao_hanh = bao_hanh;
    } 

    public String getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }

    public int getGia(){
        return this.gia;
    }

    public int getBH(){
        return this.bao_hanh;
    }
}



package Examination.FOLDER.Bt3;

public class SP {
    private String ma, ten;
    private int gia, bh;

    public SP(String ma, String ten, int gia, int bh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
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
        return this.bh;
    }
}


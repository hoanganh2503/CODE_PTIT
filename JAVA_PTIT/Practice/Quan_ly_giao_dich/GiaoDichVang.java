package Practice.Quan_ly_giao_dich;

public class GiaoDichVang extends GiaoDich {
    private String loaivang;
    public GiaoDichVang(int ma, int sl, String ngay, double dgia, String lvang){
        super(ma, sl, ngay, dgia);
        this.loaivang=lvang;
    }

    public String getLoaivang() {
        return loaivang;
    }
        
    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;        
    }
    
    public String toString(){
        return super.toString() + "\t\t" + "Loai vang: " + loaivang + "\t\t" + getThanhtien();    
    }
}

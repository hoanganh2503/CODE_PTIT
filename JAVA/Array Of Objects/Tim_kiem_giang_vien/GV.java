package Tim_kiem_giang_vien;

public class GV {
    String ma, hoten, nganh;
    public GV(String ma, String hoten, String nganh){
        this.ma = ma;
        this.hoten = hoten;
        String str1[] = nganh.toUpperCase().split(" ");
        String s = "";
        for(String it:str1) s += it.charAt(0);
        this.nganh = s;
    }
}

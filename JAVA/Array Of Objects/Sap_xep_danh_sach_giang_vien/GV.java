package Sap_xep_danh_sach_giang_vien;

public class GV {
    String ma, hoten, ten, nganh;
    public GV(String ma, String hoten, String nganh){
        this.ma = ma;
        this.hoten = hoten;
        String str[] = hoten.split(" ");
        this.ten = str[str.length - 1];
        String str1[] = nganh.toUpperCase().split(" ");
        String s = "";
        for(String it:str1) s += it.charAt(0);
        this.nganh = s;
    }
}

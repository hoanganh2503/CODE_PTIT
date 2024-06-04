package Chuan_hoa_danh_sach_sinh_vien;

public class SV {
    private String ma, ten, lop, ns,diem;
    public SV(String ma, String ten, String lop, String ns, String diem) {
        this.ma = ma;
        this.ten = formatName(ten);
        this.lop = lop;
        this.ns = formatDate(ns);
        this.diem = diem;

    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans.trim();
    }

    public String formatDate(String s){
        String str[] = s.split("\\/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        return str[0] + "/" + str[1] + "/" + str[2];
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", Float.parseFloat(this.diem));
    }
}

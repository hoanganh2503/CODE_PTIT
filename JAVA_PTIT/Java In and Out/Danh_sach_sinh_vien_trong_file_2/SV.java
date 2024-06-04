package Danh_sach_sinh_vien_trong_file_2;

public class SV {
    private String ma, ten, lop, ns;
    private double diem;

    public SV(String ma, String ten, String lop, String ns, String diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns = formatDate(ns);
        this.diem = Double.parseDouble(diem);
    }

    public String formatDate(String s){
        String str[] = s.split("\\/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        return str[0] + "/" + str[1] + "/" + str[2];
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getNs(){
        return this.ns;
    }
    
    public double getDiem(){
        return this.diem;
    }
}

package Xep_loai;

public class SV {
    private String ma, ten, xl;
    private double diem;

    public SV(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = formatName(ten);
        this.diem = d1*25.0/100.0 + d2*35.0/100.0 + d3*40.0/100.0;
        if(this.diem >= 8) this.xl = "GIOI";
        else if(this.diem >= 6.5) this.xl = "KHA";
        else if(this.diem >= 5) this.xl = "TRUNG BINH";
        else this.xl = "KEM";
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

    public String getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }
    
    public String getXL(){
        return this.xl;
    }
    
    public double getDiem(){
        return this.diem;
    }

}

package Danh_sach_sinh_vien_trong_file_1;

public class SV {
    private String ma, ten, lop, email;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = formatName(ten).trim();
        this.lop = lop;
        this.email = email;
    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans;
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
    
    public String getEmail(){
        return this.email;
    }

}

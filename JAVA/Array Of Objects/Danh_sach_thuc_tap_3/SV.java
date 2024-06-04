package Danh_sach_thuc_tap_3;

public class SV {
    private String ma, ten, lop, email, dn;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = formatName(ten);
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
        return ans.trim();
    }

    public void setCompany(String company) {
        this.dn = company;
    }

    public String getId(){
        return this.ma;
    }

    public String getName(){
        return this.ten;
    }

    public String getClasss(){
        return this.lop;
    }
    
    public String getEmail(){
        return this.email;
    }

    public String getCompany(){
        return this.dn;
    }
}

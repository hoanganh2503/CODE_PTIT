package Bang_diem_theo_lop;

public class SV {
    
    private String ma, ten, lop;

    public SV(String ma, String ten, String lop, String mail){
        this.ma = ma;
        this.ten = formatName(ten);
        this.lop = lop;
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
    
    public String getLop(){
        return this.lop;
    }

}

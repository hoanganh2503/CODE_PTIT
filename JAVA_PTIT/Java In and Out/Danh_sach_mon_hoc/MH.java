package Danh_sach_mon_hoc;

public class MH {
    private String ma, ten, tc;

    public MH (String ma, String ten, String tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getTC(){
        return this.tc;
    }
}

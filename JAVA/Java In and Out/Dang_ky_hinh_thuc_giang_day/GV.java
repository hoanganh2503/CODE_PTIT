package Dang_ky_hinh_thuc_giang_day;

public class GV {
    private String ma, ten, tc, lt, th, httt;

    public GV(String ma, String ten, String tc, String lt, String th){
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
        if(!th.equals("Truc tiep")) this.httt = "Truc tuyen";
        else this.httt = "Truc";
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

    public String getLT(){
        return this.lt;
    }

    public String getTH(){
        return this.th;
    }

    public String getHTTT(){
        return this.httt;
    }
}

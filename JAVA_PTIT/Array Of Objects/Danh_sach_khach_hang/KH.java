package Danh_sach_khach_hang;

public class KH {
    private String ma, ten, dc, sn, gioi_tinh, ngay, thang, nam;

    public KH(String ma, String ten, String gioi_tinh, String ns, String dc){
        this.ma = ma;
        this.ten = formatName(ten);
        this.gioi_tinh = gioi_tinh;
        this.sn = formatDate(ns);
        this.dc = dc;
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

    public String formatDate(String s){
        String str[] = s.split("\\/");
        if(str[0].length() == 1) str[0] = "0" + str[0];
        this.ngay = str[0];
        if(str[1].length() == 1) str[1] = "0" + str[1];
        this.thang = str[1];
        this.nam = str[2];
        return str[0] + "/" + str[1] + "/" + str[2];
    }

    public String getYear(){
        return this.nam;
    }

    public String getMonth(){
        return this.thang;
    }
    
    public String getDay(){
        return this.ngay;
    }

    public String getId(){
        return this.ma;
    }

    public String getAddr(){
        return this.dc;
    }

    public String getGender(){
        return this.gioi_tinh;
    }

    public String getName(){
        return this.ten;
    }

    public String getBirthday(){
        return this.sn;
    }
}

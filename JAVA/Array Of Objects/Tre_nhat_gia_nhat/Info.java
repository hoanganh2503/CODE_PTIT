package Tre_nhat_gia_nhat;

public class Info {
    public String ngay, thang, nam;
    public String ten;

    public Info(String ten, String s){
        this.ten = ten;
        String str[] = s.split("/");
        this.ngay = str[0];
        this.thang = str[1];
        this.nam = str[2];
    }
}

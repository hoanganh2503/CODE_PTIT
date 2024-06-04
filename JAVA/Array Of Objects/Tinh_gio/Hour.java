package Tinh_gio;

public class Hour {
    public String ma, ten;
    public int gio, phut;
    public Hour(String ma, String ten, String giovao, String giora){
        this.ma = ma;
        this.ten = ten;
        int time = getMinutes(giora) - getMinutes(giovao);
        this.gio = time/60;
        this.phut = time%60;

    } 
    
    public static int getMinutes(String str){
        String arr[] = str.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}

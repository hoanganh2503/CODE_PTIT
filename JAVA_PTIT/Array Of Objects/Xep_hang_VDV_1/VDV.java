package Xep_hang_VDV_1;
import java.text.DecimalFormat;
public class VDV {
    
    public String ma, ten, tttt, uu_tien, kq;
    public int rank, thanhtich;

    public VDV(String ma, String ten, String ngay_sinh, String xuat_phat, String den_dich){
        DecimalFormat df = new DecimalFormat("00");
        this.ma = ma;
        this.ten = ten;
        int tuoi = 2021 - Integer.parseInt(ngay_sinh.substring(6)); 
        int giay = (Integer.parseInt(den_dich.substring(0, 2)) - Integer.parseInt(xuat_phat.substring(0, 2)))*3600
                 + (Integer.parseInt(den_dich.substring(3, 5)) - Integer.parseInt(xuat_phat.substring(3, 5)))*60
                 + (Integer.parseInt(den_dich.substring(6)) - Integer.parseInt(xuat_phat.substring(6)));
        this.tttt = String.valueOf(df.format(giay/3600)) + ":" + String.valueOf(df.format((giay%3600)/60)) + ":" + String.valueOf(df.format(giay%60));
        if(tuoi >= 32) {
            this.uu_tien = "00:00:03";
            giay-=3;
        }
        else if(tuoi >= 25) {
            this.uu_tien = "00:00:02";
            giay-=2;
        }
        else if(tuoi >= 18) {
            this.uu_tien = "00:00:01";
            giay-=1;
        }
        else this.uu_tien = "00:00:00";
        this.kq = String.valueOf(df.format(giay/3600)) + ":" + String.valueOf(df.format((giay%3600)/60)) + ":" + String.valueOf(df.format(giay%60));
        this.thanhtich = giay;
    }
}

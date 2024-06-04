package Bang_diem_hoc_sinh;

public class HS {
    public String ma, ten, hk;
    public String diem;

    public HS(String ma, String ten, double diem1, double diem2, double diem3, double diem4, double diem5, double diem6, double diem7, double diem8, double diem9, double diem10){
        this.ten = ten;
        this.ma = ma;
        double diem = (diem1*2 + diem2*2 + diem3 + diem4 + diem5 + diem6 + diem7 + diem8 + diem9 + diem10)/12.0;
        if(diem > 9.0) this.hk = "XUAT SAC";
        else if(diem > 8.0) this.hk = "GIOI";
        else if(diem > 7.0) this.hk = "KHA";
        else if(diem > 5.0) this.hk = "TB";
        else this.hk = "YEU";
        double roundDiem = Math.round(diem * 10.0) / 10.0;
        this.diem = String.format("%.1f", roundDiem);
    }
}

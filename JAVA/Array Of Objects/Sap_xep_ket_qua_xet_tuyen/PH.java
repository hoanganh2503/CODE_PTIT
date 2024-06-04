package Sap_xep_ket_qua_xet_tuyen;

public class PH {
    public String ma, ten, xl;
    public double tuoi, diem, thuong;

    public PH(String ma, String ten, String tuoi, double t1, double t2){
        this.ma = ma;
        this.ten = ten;
        if(t1 >= 8 && t2 >= 8) this.thuong = 1;
        else if(t1 >= 7.5 && t2 >= 7.5) this.thuong = 0.5;
        else this.thuong = 0;
        this.diem = Math.round((t1+t2)/2 + thuong);
        if(this.diem >= 10) this.diem = 10;
        if(this.diem >=9) this.xl = "Xuat sac";
        else if(this.diem ==8) this.xl = "Gioi";
        else if(this.diem ==7) this.xl = "Kha";
        else if(this.diem >= 5) this.xl = "Trung binh";
        else this.xl = "Truot";
        this.tuoi = 2021-Integer.parseInt(tuoi.substring(6));
    }
}

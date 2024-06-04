package Practice.Quan_ly_giao_dich;

public class GiaoDich {
    protected int magd,soluong;
    protected String ngaygd;
    protected double dongia, thanhtien;
    protected GiaoDich(int ma, int sl, String ngay, double dgia){
        this.magd=ma;
        this.ngaygd=ngay;
        this.dongia=dgia;
        this.soluong=sl;
        this.thanhtien=0;
    }

    protected GiaoDich(int magd){
        this.magd=magd;
        this.ngaygd="";
        this.dongia=0;
        this.soluong=0;
        this.thanhtien=0;
    }

    public void setNgaygd(String ngay){
        this.ngaygd = ngay;
    }

    public void setDongia(double dongia){
        this.dongia = dongia;
    }

    public void setThanhtien(double thanhtien){
        this.thanhtien = thanhtien;
    }

    public void setSoluong(int sl){
        this.soluong = sl;
    }

    public void setThanhtien(){
        thanhtien = this.dongia*this.soluong;
    }

    public String toString() {
        return magd + "\t" + soluong + "\t\t" + ngaygd + "\t" + dongia;
    }

    public int getSoluong(){
        return this.soluong;
    }

    public double getDongia(){
        return this.dongia;
    }

    public double getThanhtien(){
        return this.thanhtien;
    }

    public int getMagd(){
        return this.magd;
    }

    public String getNgaygd(){
        return this.ngaygd;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        GiaoDich other = (GiaoDich) o;
        if (magd != other.magd) return false;
        return true;
    }
}

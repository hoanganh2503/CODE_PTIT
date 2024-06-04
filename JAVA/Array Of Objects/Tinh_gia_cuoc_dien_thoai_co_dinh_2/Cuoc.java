package Tinh_gia_cuoc_dien_thoai_co_dinh_2;

public class Cuoc implements Comparable<Cuoc> {
    private String sdt, ten;
    private int phut, gia;

    public Cuoc(String sdt, String ten, int phut, int gia) {
        this.sdt = sdt;
        this.ten = ten;
        this.gia = gia;
        this.phut = phut;
    }

    @Override
    public int compareTo(Cuoc o){
        return o.gia - this.gia;
    }

    @Override
    public String toString() {
        return this.sdt + " " + this.ten + " " + this.phut + " " + this.gia;
    }
}

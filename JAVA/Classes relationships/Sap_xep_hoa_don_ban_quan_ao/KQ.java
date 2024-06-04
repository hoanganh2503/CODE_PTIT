package Sap_xep_hoa_don_ban_quan_ao;

public class KQ implements Comparable<KQ> {
    private String ma, ten;
    private double giam, tong;

    public KQ(String ma, String ten, double giam, double tong){
        this.ma = ma;
        this.ten = ten;
        this.giam = giam;
        this.tong = tong;
    }
    
    @Override
    public int compareTo(KQ o){
        return (int)(o.tong - this.tong);
    }

    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.0f", this.giam) + " " + String.format("%.0f", this.tong);
    }
}


package Bang_diem_theo_lop;

public class KQ implements Comparable<KQ> {
    
    private String ma, ten, tenMh = "", maMh = "", diem, lop;

    public KQ(String ma, String ten, String maMh, String tenMh, String diem, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.maMh = maMh;
        this.tenMh = tenMh;
        this.diem = diem;
        this.lop = lop;
    }

    public String getLop(){
        return this.lop;
    }

    @Override
    public int compareTo(KQ o){
        if(this.maMh.compareTo(o.maMh) < 0) return -1;
        else if(this.maMh.compareTo(o.maMh) == 0) return this.ma.compareTo(o.ma);
        return 1;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.maMh + " " + this.tenMh + " " + this.diem;
    }
}

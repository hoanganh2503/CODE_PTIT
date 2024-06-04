package Liet_ke_nhan_vien_theo_nhom;

public class NV implements Comparable<NV> {
    private String ten, chuc_vu, heso, so_hieu;

    public NV(String ma, String ten){
        this.ten = ten.trim();
        this.chuc_vu = ma.substring(0, 2);
        this.heso = ma.substring(2, 4);
        this.so_hieu = ma.substring(4);
    }

    public String getCV(){
        return this.chuc_vu;
    }

    @Override
    public int compareTo(NV o){
        if(this.heso.compareTo(o.heso) < 0){
            return 1;
        }else if(this.heso.equals(o.heso)){
            return this.so_hieu.compareTo(o.so_hieu);
        }
        return -1;
    }

    @Override 
    public String toString() {
        return this.ten + " " + this.chuc_vu + " " + this.so_hieu + " " + this.heso;
    }
}

package Sap_xep_danh_sach_sinh_vien;

public class SV implements Comparable <SV> {
    private String ma, ten, sdt, mail, ten1, ho = "";

    public SV(String ma, String ten, String sdt, String mail){
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.mail = mail;

        String str[] = ten.split(" ");
        int n = str.length;
        this.ten1 = str[n-1];
        for (int i = 0; i < n-1 ; i++) {
            this.ho += str[i];
        }
    }

    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.sdt + " " + this.mail;
    }
    
    @Override
    public int compareTo(SV o){
        if(this.ten1.compareTo(o.ten1) > 0) return 1;
        else if(this.ten1.equals(o.ten1)){
            if(this.ho.compareTo(o.ho) > 0) return 1;
            else if(this.ho.equals(o.ho)) return this.ma.compareTo(o.ma);
        }
        return -1;
    }
}

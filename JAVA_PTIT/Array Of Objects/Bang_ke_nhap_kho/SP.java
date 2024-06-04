package Bang_ke_nhap_kho;

public class SP {
    public String ma, ten;
    public double ck, tong;
    public SP(String ma, String ten, double sl, double dongia){
        this.ma = ma;
        this.ten = ten;
        if(sl > 10) this.ck = dongia*sl/20;
        else if(sl >= 8) this.ck = dongia*sl/50;
        else if(sl >= 5) this.ck = dongia*sl/100;
        else this.ck = 0;
        this.tong = dongia*sl - this.ck;
    }
}

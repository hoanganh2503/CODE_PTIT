package Sap_xep_mat_hang;

public class SP {
    private String ma, ten, nhom;
    private double lai;

    public SP(String ma, String ten, String nhom, double mua, double ban) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.lai = ban - mua;
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getNhom(){
        return this.nhom;
    }
    
    public double getLai(){
        return this.lai;
    }
        
}

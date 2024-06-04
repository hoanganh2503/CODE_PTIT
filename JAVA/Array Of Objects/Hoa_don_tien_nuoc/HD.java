package Hoa_don_tien_nuoc;

public class HD {
    private String ma, ten;
    private double tong_thu, phu_phi, don_gia;

    public HD(String ma, String ten, double cu, double moi){
        this.ma = ma;
        this.ten = ten;
        double tong = moi - cu;
        if(tong > 0){
           this.phu_phi = 2.0/100.0; 
           this.don_gia = 100;
           double so = tong >= 50 ? 50 : tong;
           this.tong_thu += (this.don_gia*so);
           tong -= 50;
        } 
        if(tong > 0){
           this.phu_phi = 3.0/100.0; 
           this.don_gia = 150;
           double so = tong >= 50 ? 50 : tong;
           this.tong_thu += (this.don_gia*so);
           tong -= 50;
        }
        if(tong > 0) {
           this.phu_phi = 5.0/100.0;
           this.don_gia = 200;
           this.tong_thu += (this.don_gia*tong);
        }
        this.tong_thu = this.tong_thu*(1+this.phu_phi);
    }

    public String getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }

    public double getTong(){
        return this.tong_thu;   
    }
}

package Examination.FOLDER.Cua_hang_quan_ao_thoi_trang;

public class SP {
    private String ten, ma, stt;
    private double giam_gia, thanh_tien;

    public SP(String ten, String ma, Double don_gia, Double sl){
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1, 4);
        this.thanh_tien = don_gia*sl;
        if(ma.charAt(ma.length() - 1) == '1') this.giam_gia = 0.3*this.thanh_tien;
        else this.giam_gia = 0.5*this.thanh_tien;
        this.thanh_tien -= this.giam_gia;
    }  

    public String getId(){
        return this.ma;
    }

    public String getName(){
        return this.ten;
    }
    
    public String getStt(){
        return this.stt;
    }
    
    public double getDiscount(){
        return this.giam_gia;
    }
        
    public double getTotal(){
        return this.thanh_tien;
    }
}

package Quan_ly_bat_tap_nhom;

public class SV implements Comparable<SV>{
   private String ma, ten, sdt, detai, tendetai;
   
   public SV(String ma, String ten, String sdt){
    this.ma = ma;
    this.ten = ten;
    this.sdt = sdt;
   }

   public void setDetai(String detai){
        this.detai = detai;
   }

   public void setTendetai(String tendetai){
    this.tendetai = tendetai;
   }

   public String getMa(){
    return this.ma;
   }

   @Override
   public int compareTo(SV o){
        return this.ma.compareTo(o.ma);
    }

   @Override
   public String toString(){
    return this.ma + " " + this.ten + " " + this.sdt + " " + this.detai + " " + this.tendetai;
   }
}

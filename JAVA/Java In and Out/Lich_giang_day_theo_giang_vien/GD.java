package Lich_giang_day_theo_giang_vien;

public class GD implements Comparable<GD>{
    private String ma, mamh, thu, kip, ten, phong, mon;

    public GD(String ma, String mamh, String thu, String kip, String ten, String phong) {
        this.ma = ma;
        this.mamh = mamh;
        this.thu = thu;
        this.kip = kip;
        this.ten = ten;
        this.phong = phong;
    }

    public void setMon(String mon){
        this.mon = mon;
    }

    public String getMaMH(){
        return this.mamh;
    }
    
    public String getTen(){
        return this.ten;
    }

    @Override 
    public int compareTo(GD o){
        if(this.thu.compareTo(o.thu) < 0){
            return -1;
        }else if(this.thu.compareTo(o.thu) == 0){
            if(this.kip.compareTo(o.kip) < 0){
                return -1;
            }else if(this.kip.compareTo(o.kip) == 0){
                return this.ma.compareTo(o.ma);
            }
        }
        return 1;
    }    

    @Override
    public String toString(){
        return this.ma + " " + this.mon + " " + this.thu + " " + this.kip + " " + this.phong;
    }
}

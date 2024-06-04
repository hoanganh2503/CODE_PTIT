package Xet_tuyen;

public class TS {
    private String ma, ten, xl;
    private double tuoi, thuong, tb;

    public TS(String ma, String ten, String ns, double lt, double th) {
        this.ma = ma;
        this.ten = formatName(ten);
        this.tuoi = 2021 - Integer.parseInt(ns.substring(ns.length()-4));
        double tbc = (lt+th)/2;
        if(lt >= 8 && th >= 8) this.thuong = 1;
        else if(lt >= 7.5 && th >= 7.5) this.thuong = 0.5;
        tbc = (tbc + this.thuong) >= 10 ? 10 : tbc + this.thuong;
        this.tb = Math.round(tbc);
        if(this.tb < 5) this.xl = "Truot";
        else if(this.tb <= 6) this.xl = "Trung binh";
        else if(this.tb <= 7) this.xl = "Kha";
        else if(this.tb <= 8) this.xl = "Gioi";
        else this.xl = "Xuat sac";
    }

    public String formatName(String s){
        String ans = "";
        String str[] = s.replaceAll("\\s\\s+", " ").trim().toLowerCase().split(" ");
        for(String it:str){
            it = it.substring(0, 1).toUpperCase() + it.substring(1);
            ans += it + " ";
        }
        return ans.trim();
    }


    public String getMa(){
        return this.ma;
    }

    public String getTen(){
        return this.ten;
    }
    
    public String getXl(){
        return this.xl;
    }

    public double getTuoi(){
        return this.tuoi;
    }

    public double getTB(){
        return this.tb;
    }
}

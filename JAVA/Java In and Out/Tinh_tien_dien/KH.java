package Tinh_tien_dien;

public class KH {
    private String ma, ten;
    private double trong, vuot, tong, vat;

    public KH(String ma, String ten, String str){
        this.ma = ma;
        this.ten = formatName(ten);
        String s[] = str.trim().split("\\s");
        s[0] = s[0].trim();
        s[1] = s[1].trim();
        s[2] = s[2].trim();
        int dm = 0;
        if(s[0].equals("A")) dm = 100;
        else if(s[0].equals("B")) dm = 500;
        else dm = 200;
        int so_diem = Integer.parseInt(s[2]) - Integer.parseInt(s[1]);
        if(so_diem <= dm) this.trong = so_diem  * 450;
        else {
            this.trong = dm * 450;
            this.vuot = (so_diem-dm) * 1000;
            this.vat = this.vuot * 5.0/100.0;
        }
        this.tong = this.trong + this.vuot + this.vat;

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

    public double getTrong(){
        return this.trong;
    }
 
    public double getThue(){
        return this.vat;
    }
 
    public double getVuot(){
        return this.vuot;
    }
    
    public double getTong(){
        return this.tong;
    }
 
 
}

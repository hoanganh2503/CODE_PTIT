package Tinh_diem_trung_binh;

public class SV {
    private String ma, ten, tb;
    private int stt;

    public SV(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = formatName(ten);
        this.tb = String.format("%.2f", (d1*3 + d2*3 + d3*2)/8);
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

    public String getDiem(){
        return this.tb;
    }

    public int getStt(){
        return this.stt;
    }

    public void setStt(int stt){
        this.stt = stt;
    }
}

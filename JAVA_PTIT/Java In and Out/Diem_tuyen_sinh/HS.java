package Diem_tuyen_sinh;

public class HS {
    private String ma, ten, tt;
    private double diem, ut, dt;

    public HS(String ma, String ten, String diem, String dantoc, String khuvuc){
        this.ma = ma;
        this.ten = formatName(ten);
        if(khuvuc.equals("1")) this.ut = 1.5;
        else if(khuvuc.equals("2")) this.ut = 1;
        else this.ut = 0;

        if(!dantoc.equals("Kinh")) this.dt = 1.5;

        this.diem = Double.parseDouble(diem) + this.ut + this.dt;
        if( this.diem >= 20.5) this.tt = "Do";
        else this.tt = "Truot";
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

    public String getTT(){
        return this.tt;
    }
    public double getDiem() {
        return this.diem;
    }
}

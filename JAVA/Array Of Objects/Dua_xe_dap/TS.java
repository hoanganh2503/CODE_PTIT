package Dua_xe_dap;

public class TS {
    private String ma, ten, donVi;
    private double vanToc;

    public TS(String ten, String donVi, String gio){
        this.ten = ten;
        this.donVi = donVi;
        this.ma = handleId(donVi + " " + ten);
        this.vanToc = tinhVanToc(gio);
    }

    public String handleId(String s){
        String str = "";
        String ans[] = s.toUpperCase().split(" ");
        for(String it:ans){
            str += it.charAt(0);
        }
        return str;
    }

    public double tinhVanToc(String s){
        return 120/(Double.parseDouble(s.substring(0, 1))-6.0 + (Double.parseDouble(s.substring(2)))/60);
    }

    public String getMa(){
        return this.ma;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getDonVi(){
        return this.donVi;
    }
    
    public double getVT(){
        return this.vanToc;
    }
}

package Bang_diem_theo_mon_hoc;

public class SV implements Comparable<SV> {
    
    private String ma, ten, lop, maMh = "";
    private String diem;
    private double diem1;

    public SV(String ma, String ten, String lop, String mail){
        // System.out.println(ma + " " + ten + " " + lop + " " + mail);
        this.ma = ma;
        this.ten = formatName(ten);
        this.lop = lop;
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

    public void setDiem(String diem){
        this.diem1 = Double.parseDouble(diem);
        this.diem = diem;
    }

    public void setMamh(String ma){
        this.maMh = ma;
    }

    public String getMamh(){
        return this.maMh;
    }
    public String getMa(){
        return this.ma;
    }

    @Override
    public int compareTo(SV o){
        if(this.diem1 > o.diem1) return -1;
        else if(this.diem1 == o.diem1) return this.ma.compareTo(o.ma);
        return 1;
    }

    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.diem;
    }
}

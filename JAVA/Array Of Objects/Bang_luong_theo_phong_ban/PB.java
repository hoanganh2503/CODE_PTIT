package Bang_luong_theo_phong_ban;

public class PB {
    private String ma, ten;

    public PB(String ma, String ten){
        this.ma = ma;
        this.ten = ten.trim();
    }

    public String getName(){
        return this.ten;
    }

    public String getId(){
        return this.ma;
    }

}

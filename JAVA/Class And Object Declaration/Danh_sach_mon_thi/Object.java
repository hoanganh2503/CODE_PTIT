package Danh_sach_mon_thi;

public class Object {
    public String ma, ten, hthuc;

    public Object(){
        this.ma = "";
        this.ten = "";
        this.hthuc = "";
    }

    public String getMa(){
        return this.ma;
    }

    public Object(String ma, String ten, String hthuc){
        this.ma = ma;
        this.ten = ten;
        this.hthuc = hthuc;
    }

    public void getInfo(){
        System.out.printf("%s %s %s\n", this.ma, this.ten, this.hthuc);
    }
}

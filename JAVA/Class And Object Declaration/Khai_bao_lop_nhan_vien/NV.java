package Khai_bao_lop_nhan_vien;

public class NV {
    public String name, sex, birthday, addr, tax, sign;
    public NV(String name, String sex, String birthday, String addr, String tax, String sign) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.addr = addr;
        this.tax = tax;
        this.sign = sign;
    }

    public void printNV(){
        System.out.printf("%s %s %s %s %s %s %s", "00001", this.name, this.sex, this.birthday, this.addr, this.tax, this.sign);
    }
}

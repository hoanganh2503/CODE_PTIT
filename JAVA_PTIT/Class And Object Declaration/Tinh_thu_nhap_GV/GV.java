package Tinh_thu_nhap_GV;

public class GV {
    public String code, name;
    public long trocap, tong;

    public GV(String code, String name, long luong){
        this.code = code;
        this.name = name;
        switch(code.substring(0, 2)){
            case "HT":
                this.trocap = 2000000;
                break;
            case "HP":
                this.trocap = 900000;
                break;
            case "GV":
                this.trocap = 500000;
                break;
        }
        int a= Integer.parseInt(code.substring(2, 4));
        this.tong = luong*a + this.trocap;

        System.out.printf("%s %s %d %d %d", this.code, this.name, a, this.trocap, this.tong); 
    }
}

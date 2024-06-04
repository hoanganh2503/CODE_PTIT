package Khai_bao_lop_SV;

public class SV {
    private String name, lop, birthday;
    private float diem;
    public SV(String name, String lop, String birthday, float diem) {
        this.name = name;
        this.lop = lop;
        this.diem = diem;
        String s[] = birthday.split("/");
        if(s[0].length()==1) s[0] = 0 + s[0];
        if(s[1].length()==1) s[1] = 0 + s[1];
        this.birthday = s[0] + "/" + s[1] + "/" + s[2];
    }

    public void printSv(){
        System.out.printf("%s %s %s %s %.2f", "B20DCCN001", this.name, this.lop, this.birthday, this.diem);
    }
}

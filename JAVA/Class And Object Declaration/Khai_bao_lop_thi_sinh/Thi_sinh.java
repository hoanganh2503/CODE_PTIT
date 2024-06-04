package Khai_bao_lop_thi_sinh;

public class Thi_sinh {
    private String name, birthday;
    float m1, m2, m3;

    public Thi_sinh(String name, String birthday, float m1, float m2, float m3) {
        this.name = name;
        this.birthday = birthday;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void printCandidate(){
        System.out.printf("%s %s %.1f", this.name, this.birthday, (this.m1+this.m2+this.m3));
    }
}

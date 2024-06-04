package So_phuc;
public class Phuc {
    public int a, b;
    public Phuc(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void ans1(Phuc B){
        int nguyen = this.a + B.a;
        int ao = this.b + B.b;
        System.out.print((nguyen*this.a - ao*this.b) + ((nguyen*this.b + ao*this.a) > 0 ?  " + " + (nguyen*this.b + ao*this.a) : " - " + Math.abs((nguyen*this.b + ao*this.a))) + "i, ");
    }

    public void ans2(Phuc B){
        int nguyen = this.a + B.a;
        int ao = this.b + B.b;
        System.out.print((nguyen*nguyen - ao*ao) + ((nguyen*ao + ao*nguyen) > 0 ? " + " + (nguyen*ao + ao*nguyen) : " - " +  Math.abs((nguyen*ao + ao*nguyen))) + "i\n");
    }
}

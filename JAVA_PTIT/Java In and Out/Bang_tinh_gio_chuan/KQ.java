package Bang_tinh_gio_chuan;

public class KQ {
    private String ten;
    private double gio;

    public KQ(String ten){
        this.ten = ten;
    }

    public void setGio(double gio){
        this.gio += gio;
    }

    public String getTen(){
        return this.ten;
    }

    @Override
    public String toString() {
        return this.ten + " " + String.format("%.2f", this.gio);
    }
}

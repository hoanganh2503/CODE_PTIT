package Tinh_toan_gia_ban;

public class SP {
    private double tong;
    private String ten;

    public SP(String ten, double dongia, double sl){
        this.ten = ten;
        double thue = 0, vc = 0;
        switch (ten.charAt(0)) {
            case 'T':
                thue = 29.0/100.0;
                vc = 4.0/100.0;
                break;

            case 'C':
                thue = 10.0/100.0;
                vc = 3.0/100.0;
                break;
    
            case 'D':
                thue = 8.0/100.0;
                vc = 25.0/1000.0;
                break;
                            
            case 'M':
                thue = 2.0/100.0;
                vc = 5.0/1000.0;
                break;        
            default:
                break;
        }
        if (ten.charAt(ten.length()-1) == 'C') {
            // thue = thue - 5.0/100.0 >= 0 ? thue - 5.0/100.0 : 0;
            thue *= 95.0/100.0;
        }
        double t = dongia*(thue) + dongia*(vc) + dongia;
        this.tong = t*120.0/100.0;

    }

    @Override
    public String toString() {
        return this.ten + " " + String.format("%.2f", this.tong);
    }
}

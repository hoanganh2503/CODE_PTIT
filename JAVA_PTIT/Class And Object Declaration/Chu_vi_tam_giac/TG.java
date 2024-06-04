package Chu_vi_tam_giac;

public class TG {
    private double x, y, z;

    public TG(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x = calculate(x1, y1, x2, y2);
        this.y = calculate(x1, y1, x3, y3);
        this.z = calculate(x2, y2, x3, y3);
    }

    public static double calculate(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    public void printTG(){
        double a = this.x, b = this.y, c = this.z;
        if(a >= b + c || b >= a + c || c >= a + b){
            System.out.println("INVALID");
            return;
        }
        System.out.printf("%.3f\n", a+b+c);

    }
}

package Lop_Triangle_1;

public class Triangle {
    private double x, y, z;

    public Triangle(Point x, Point y, Point z) {
        this.x = calculate(x.x, x.y, y.x, y.y);
        this.y = calculate(x.x, x.y, z.x, z.y);
        this.z = calculate(y.x, y.y, z.x, z.y);
    }

    public static double calculate(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    public boolean valid(){
        double a = this.x, b = this.y, c = this.z;
        if(a >= b + c || b >= a + c || c >= a + b){
            return false;
        }
        return true;
    }

    public String getPerimeter(){
        return String.format("%.3f", this.x + this.y + this.z);
    }
}

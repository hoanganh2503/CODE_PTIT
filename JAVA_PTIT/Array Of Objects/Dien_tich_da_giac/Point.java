package Dien_tich_da_giac;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double tinhDienTich(Point p2, Point p3) {
        return tinhDienTichTamGiac(tinhDoDai(this.x, this.y, p2.x, p2.y),
                                   tinhDoDai(this.x, this.y, p3.x, p3.y),
                                   tinhDoDai(p3.x, p3.y, p2.x, p2.y));
    }

    public double tinhDoDai(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    public double tinhDienTichTamGiac(double a, double b , double c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

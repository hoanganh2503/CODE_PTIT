package Khai_bao_hinh_chu_nhat;

public class HCN {
    double a, b;
    String color;

    public HCN(){
        this.a = 1;
        this.b = 1;
    }

    public HCN(double a, double b, String color){
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public double getWidth(){
        return this.a;
    }
    public void setWidth(double width){
        this.a = width;
    }
    public double getHeight(){
        return this.b;
    }
    public void setHeight(double height){
        this.b = height;
    }
    public String getColor(){
        String ans = this.color.toLowerCase().trim();
        ans = ans.substring(0, 1).toUpperCase() + ans.substring(1);
        return ans;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return this.a*this.b;
    }
    public double findPerimeter(){
        return (this.a+this.b)*2;
    }
}

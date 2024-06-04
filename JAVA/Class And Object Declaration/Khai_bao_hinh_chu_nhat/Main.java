package Khai_bao_hinh_chu_nhat;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String color = sc.nextLine();
        if(a > 0 && b > 0){
            HCN A = new HCN(a, b, color);
            System.out.printf("%.0f %.0f %s", A.findPerimeter(), A.findArea(), A.getColor());            
        }else System.out.println("INVALID");

    }
}

import java.util.*;
public class Hinh_vuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int max1 =  Math.max(Math.max(Math.abs(x3-x2), Math.abs(x1-x4)), Math.max(Math.abs(y3-y2), Math.abs(y1-y4)));
        int max2 =  Math.max(Math.max(Math.abs(y2-y1), Math.abs(x2-x1)), Math.max(Math.abs(y4-y3), Math.abs(x4-x4)));
        System.out.println(Math.max(max1*max1, max2*max2));
    }
}

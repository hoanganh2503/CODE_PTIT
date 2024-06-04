import java.util.*;

public class Giai_pt_bac_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a == 0 && b == 0){
            System.out.println("VSN");
        }
        else if(a == 0 && b != 0){
            System.out.println("VN");
        }else{
            System.out.println(String.format("%.2f", Math.round((-b/a)*100.0)/100.0));
        }
    }
}

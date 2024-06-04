import java.util.*;
public class Danh_sach_canh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                int x = sc.nextInt();
                if(x==1 && j>i) System.out.println("("+i+","+j+")");
            }
        }
    }
}

import java.util.*;
public class Chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] new_str = str.replaceAll("\\s\\s+", " ").toLowerCase().trim().split("\\s");
            for(int i = 1 ; i < new_str.length ; i++){
                System.out.print(new_str[i].substring(0, 1).toUpperCase() + new_str[i].substring(1));
                if(i != new_str.length-1) System.out.print(" ");
            }
            System.out.println(", " + new_str[0].toUpperCase());
        }
    }
}

import java.util.*;
public class Chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] new_str = str.replaceAll("\\s\\s+", " ").toLowerCase().trim().split("\\s");
            for(String str2 : new_str){
                System.out.print(str2.substring(0, 1).toUpperCase() + str2.substring(1) + " ");
            }
            System.out.println();
        }
    }
}

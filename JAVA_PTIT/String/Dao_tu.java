import java.util.*;
public class Dao_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();      
        while(t-->0){
            String s = sc.nextLine();
            String str[] = s.split(" ");
            for(String str1:str){
                System.out.print(reserved(str1)+ " ");
            }
            System.out.println();
        }  
    }

    static String reserved(String s){
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        return str.toString();
    }

}

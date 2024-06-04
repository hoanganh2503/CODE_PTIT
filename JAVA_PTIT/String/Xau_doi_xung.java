import java.util.*;
public class Xau_doi_xung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            checkString(s);
        }
    }
    static void checkString(String str){
        int count = 0;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                count++;
            }
        }
        if(count == 1 || (count == 0 && str.length()%2==1)) System.out.println("YES");
        else System.out.println("NO");
    }
    
}

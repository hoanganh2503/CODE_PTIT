import java.util.*;
public class So_dep_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            if(checkStr(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean checkStr(String str){
        char charArray[] = str.toCharArray();
        for(int i=0; i<charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length-1-i] || (charArray[i]-'0')%2 == 1) return false;
        }
        return true;
    }
}

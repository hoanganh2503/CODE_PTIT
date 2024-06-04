import java.util.*;
public class So_dep_2 {
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
        if(charArray[0] != '8' || charArray[charArray.length-1] != '8') return false;
        int sum = 0;
        for(int i=0; i<charArray.length/2; i++){
            sum += charArray[i]-'0';
            if(charArray[i] != charArray[charArray.length-1-i]) return false;
        }
        sum*=2;
        if(charArray.length%2==1) sum += charArray[charArray.length/2+1]-'0';
        if(sum%10 != 0) return false;
        return true;
    }
}

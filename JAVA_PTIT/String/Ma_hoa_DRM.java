import java.util.*;
public class Ma_hoa_DRM {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String s1 = rotate(s.substring(0, s.length()/2));
            String s2 = rotate(s.substring(s.length()/2));
            System.out.println(mergeString(s1, s2)); 
        }
   } 

   static String mergeString(String s1, String s2){
        String ans = "";
        for(int i = 0; i < s1.length(); i++) {
            ans += newCharRotate(charToInt(s2.charAt(i)), s1.charAt(i));
        }
        return ans;
   }

   static String rotate(String s){
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            temp += charToInt(s.charAt(i));
        }
        String ans = rotateString(s, temp);
        return ans;
   }

   static String rotateString(String s, int k){
        String str ="";
        for(int i = 0; i < s.length(); i++){
            str += newCharRotate(k, s.charAt(i));
        }
        return str;
   }

   static char newCharRotate(int k, char c) {
        return intToChar(charToInt(c) + k);
   }

   static char intToChar(int v) {
        int k = v%26;
        char c = 'A';
        c+=k;
        return c;
   }

   static int charToInt(char v) {
        return v-'A';
   }
}

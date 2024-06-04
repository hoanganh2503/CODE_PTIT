import java.util.*;
public class Vong_tron {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new TreeSet<Character>();
        for(int i = 0; i <s.length() - 1; i++){
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            while(a==b){
                s = s.substring(0, i)+s.substring(i+2); 
                i--;
                if(s.length() < 2 || i+1 >= s.length() || i == -1) break;
                a = s.charAt(i);
                b = s.charAt(i + 1);
            }
        }
        char arr[] = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
            set.add(arr[i]);
        }
        int ans = 0;
        for(Character it: set){
            int a = 0, b = 0;
            for( a = 0; a < s.length(); a++){
                if( s.charAt(a) == it) break;
            }
            for(b = a+1 ; b < s.length(); b++){
                if( s.charAt(b) == it) break;
            }
            Set<Character> set1 = new TreeSet<Character>();
            for(int i = a+1 ; i < b ; i++){
                set1.add(s.charAt(i));
            }
            ans += (b-a-1) -2*((b-a-1)-set1.size());
        }
        System.out.println(ans/2);
    }
}

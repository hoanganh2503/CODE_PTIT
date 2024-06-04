import java.util.*;
public class Dien_thoai_cuc_gach {
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char A = 'A';
        char a = 'a';
        for(int i = 2; i <= 9 ; i++){
            for(int j = 1; j <=3 ; j++){
                map.put(A, i);
                map.put(a, i);
                A++;
                a++;
            }            
            if(i == 7 || i == 9){
                map.put(A, i);
                map.put(a, i);
                A++;
                a++; 
            }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String ans = "";
            for(int i = 0; i <s.length() ; i++){
                ans += map.get(s.charAt(i));
            }
            checkString(ans);
        }
    }
    static void checkString(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
}

import java.util.*;
public class Xau_day_du {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int k = sc.nextInt();
            sc.nextLine();

            int n = s.length();
            Set<Character> set = new HashSet<Character>();
            for(int i=0; i<n; i++){
                set.add(s.charAt(i));
            }
            if(n >= 27 && 27-set.size() <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

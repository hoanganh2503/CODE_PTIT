import java.util.*;
public class Khoang_cach_giua_2_vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String str1[] = s1.trim().replaceAll("\\s+", " ").split(" ");
            String str2[] = s2.trim().replaceAll("\\s+", " ").split(" ");
            if(str1.length != str2.length){
                System.out.println("INVALID");
            }else{
                int n = str1.length;
                double ans = 0.0;
                for(int i = 0; i < n; i++){
                    ans += ((Integer.parseInt(str2[i]) - Integer.parseInt(str1[i]))*(Integer.parseInt(str2[i]) - Integer.parseInt(str1[i])));
                }
                ans = Math.sqrt(ans);
                System.out.printf("%.5f\n", ans);
            }
        }
    }
}
// 2
//    1     4
// 0 0
// 3 5 7 8
// 4 6


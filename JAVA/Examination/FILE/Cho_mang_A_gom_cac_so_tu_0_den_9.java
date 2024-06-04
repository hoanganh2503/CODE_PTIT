import java.util.*;

public class Cho_mang_A_gom_cac_so_tu_0_den_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(n > 1){
                String s1 = "", s2 = "";
                for(int i = 0; i < n; i++){
                    if(i%2 == 0) s1 += arr[i];
                    else s2 += arr[i];
                }
                System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));                
            }else System.out.println(arr[0]);

        }
        sc.close();
    }
}
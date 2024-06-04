import java.util.*;

public class Hinh_sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a] ++;
            arr[b] ++; 
        }
        boolean check = false;
        for(int i = 1; i <= n; i++) {
            if(arr[i] == n-1){
                check = true;
                break;
            }
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }        
}

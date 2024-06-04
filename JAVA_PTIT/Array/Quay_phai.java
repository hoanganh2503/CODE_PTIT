import java.util.*;
public class Quay_phai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                min = Math.min(min,arr[i]);
            } 
            for(int i = 0; i < n; i++){
                if(arr[i] == min){
                    System.out.println(i);
                    break;
                }
            }

        }
    }    
}

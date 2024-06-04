import java.util.*;
public class In_ma_tran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n*n];
            for(int i = 0; i < n*n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                if(i%2 == 0){
                    for(int j = n*i; j < n*(i+1); j++) System.out.print(arr[j] + " ");
                }
                else {
                    for(int j = n*(i+1)-1; j >= n*i; j--) System.out.print(arr[j] + " ");
                }
            }   
            System.out.println();
        }

    }
}

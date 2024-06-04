import java.util.Scanner;
public class Tong_uoc_so_tru_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[2000001];
        arr[0] = arr[1] = 1;
        for(int i = 2; i < 1500; i++){
            if(arr[i] == 0){
                for(int j = i*i ; j < 2000001; j += i){
                    if(arr[j] == 0) arr[j] = i;
                }
            }
        }

        for(int i = 2; i < 2000001; i++) {
            if(arr[i] == 0) arr[i] = i;
        }

        long ans = 0;
        while(t-- > 0){
            int n = sc.nextInt();
            while(n > 1){
                ans += arr[n];
                n/=arr[n];
            }
        }
        System.out.println(ans);
    }
}

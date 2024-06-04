import java.util.Scanner;
public class Mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n+1];
            for(int i = 1; i <= n; i++){
                arr[i] = sc.nextLong();
            }
            if(check(arr, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static boolean check(long arr[], int n){
        for(int i = 1; i <= Math.ceil(n/2); i++){
            if(arr[i] != arr[n-i+1]) return false;
        }
        return true;
    }
}

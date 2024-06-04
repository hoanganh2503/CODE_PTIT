import java.util.Scanner;
public class Xau_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fibo = new long[93];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for(int i = 3; i <=92 ; i ++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        while(t > 0){
            t--;
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(findCharacter(fibo, n, k));
        }
    }

    static int findCharacter(long fibo[], int n, long k) {
        if(n == 1) return 0; 
        if(n == 2) return 1;
        if(k <= fibo[n-2]) return findCharacter(fibo, n-2, k);
        else return findCharacter(fibo, n-1, k-fibo[n-2]);
    }
}

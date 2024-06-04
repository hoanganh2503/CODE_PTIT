import java.util.Scanner;

public class Tong_uoc_so_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        int[] vt = new int[b + 1];
        for (int i = 1; i <= b; i++) {
            vt[i] = 1;
        }
        
        for (int i = 2; i <= b; i++) {
            for (int j = i; j <= b; j += i) {
                vt[j] += i;
            }
        }
        
        for (int i = a; i <= b; i++) {
            if (vt[i] - i > i) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
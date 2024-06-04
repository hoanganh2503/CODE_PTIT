import java.util.*;
public class USCLN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =  sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n+1];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            b[0] = a[0];
            b[n] = a[n-1];
            for(int i = 1 ; i < n ; i++){
                b[i] = BCNN(a[i], a[i-1]);
            }
            for(int it:b) System.out.print(it+" ");
            System.out.println();
        }
    }

    public static int UCLN(int a, int b){
        if(b == 0) return a;
        return UCLN(b, a%b);
    }

    public static int BCNN(int a, int b){
        return a*b / UCLN(a, b);
    }
}

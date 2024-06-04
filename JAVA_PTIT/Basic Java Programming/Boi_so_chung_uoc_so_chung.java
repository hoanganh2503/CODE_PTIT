import java.util.*;
public class Boi_so_chung_uoc_so_chung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            t--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a < b) {
                long tmp = a;
                a = b;
                b = tmp;
            }
            System.out.print(BCNN(a, b)+ " " + UCLN(a, b) + '\n');
        }
    }

    public static long UCLN(long a, long b){
        if(b == 0) return a;
        return UCLN(b, a%b);
    }

    public static long BCNN(long a, long b){
        return a*b / UCLN(a, b);
    }
}
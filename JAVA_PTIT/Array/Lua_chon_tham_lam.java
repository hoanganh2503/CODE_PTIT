import java.util.*;

public class Lua_chon_tham_lam {
    static void findSmallest(int m, int s) {
        if (s == 0){
            System.out.print(m == 1 ? "0" : "-1 ");  
            return ;
        }
        if (s > 9*m){
            System.out.print("-1 ");
            return ;
        }

        int[] res = new int[m];
        s -= 1;
          for (int i=m-1; i>0; i--){
            if (s > 9){
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1; 
  
        for (int i=0; i<m; i++)
            System.out.print(res[i]);
        System.out.print(" ");

    }

    static void findLargest(int m, int s) {
        if (s == 0){
            System.out.print(m == 1 ? "0" : "-1 ");
            return ;
        }
  
        if (s > 9*m){
            System.out.print("-1 ");
            return ;
        }
        int[] res = new int[m];

        for (int i=0; i<m; i++) {
            if (s >= 9) {
                res[i] = 9;
                s -= 9;
            } else {
                res[i] = s;
                s = 0;
            }
        }
  
        for (int i=0; i<m; i++)
            System.out.print(res[i]);
    }
     
    // driver program
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        findSmallest(n, s);
        findLargest(n, s);
    }
}
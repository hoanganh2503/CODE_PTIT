import java.io.*;
import java.util.*;

public class Cho_day_so_A_gom_N {
        public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> chan = new ArrayList<Integer>();
            ArrayList<Integer> le = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
               int a = sc.nextInt();
               if(a%2 == 0 && !chan.contains(a)) chan.add(a);
               else if(a%2 == 1 && !le.contains(a)) le.add(a); 
            }
            Collections.sort(chan);
            Collections.sort(le,  Collections.reverseOrder());
            for(int it:chan) System.out.print(it + " ");
            System.out.println();
            for(int it:le) System.out.print(it + " ");
            System.out.println();
        }
    }
}

import java.util.*;
public class Bo_sung_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
       for(int i=0; i<n; i++){
            int a = sc.nextInt();
            set1.add(a);
            m = Math.max(m, a);
        }
        for(int i=0; i<m; i++){
            set2.add(i+1);
        }

        set2.removeAll(set1);
        for(int it:set2) System.out.println(it); 
        if(set2.size() == 0) System.out.println("Excellent!");
    }
}

import java.util.*;

public class Cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            Map<Long, Long> map = new HashMap<Long, Long>();
            for(long i = 0; i < n; i++){
                long a = sc.nextLong();
                if(map.containsKey(a)) map.put(a, map.get(a) + 1);
                else map.put(a, (long)1);
            }
            long ans = 0;
            Set<Long> set = map.keySet();
            for(long it:set){
                // System.out.println(it + " " + map.get(it));
                if(map.containsKey(k-it)){
                    if(it != k - it) ans += map.get(k-it)*map.get(it);
                    else ans += gt(map.get(it))*2;
                } 
            }
            System.out.println(ans/2);
        }
    }

    public static long gt(long n){
        long ans = 0;
        for(long i = 1 ; i < n ; i++)
            ans += i;
        return ans;

    }
}